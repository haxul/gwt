package com.haxul.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import com.haxul.client.objects.CallInput;
import com.haxul.client.objects.CallResponse;
import com.haxul.client.requests.StringService;
import com.haxul.client.requests.StringServiceAsync;
import com.haxul.client.requests.TrimService;
import com.haxul.client.requests.TrimServiceAsync;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class app implements EntryPoint {

    private final VerticalPanel mainPanel = new VerticalPanel();
    private final StringServiceAsync serviceAsync = GWT.create(StringService.class);
    private final TrimServiceAsync trimService = GWT.create(TrimService.class);


    @Override
    public void onModuleLoad() {
        Label h1 = new Label();
        h1.setText("Simple app");
        Label label = new Label();
        Label serverOutput = new Label();

        TextBox textBox = new TextBox();
        textBox.addKeyDownHandler((event) -> label.setText(String.valueOf(textBox.getText().trim().length())));

        Button button = new Button("send");
        button.addClickHandler((e) -> {
            CallInput request = new CallInput();
            request.text = textBox.getText();
            serviceAsync.greetServer(request, new AsyncCallback<CallResponse>() {

                @Override
                public void onFailure(Throwable throwable) {
                    Window.alert(throwable.getMessage());
                }

                @Override
                public void onSuccess(CallResponse callResponse) {
                    serverOutput.setText(callResponse.responseText +" : code " + callResponse.responseCode);
                }
            });
        });


        button.setStyleName("redButton");

        mainPanel.add(h1);
        mainPanel.add(textBox);
        mainPanel.add(label);
        mainPanel.add(button);
        mainPanel.add(serverOutput);


        RootPanel.get("root").add(mainPanel);
    }

    private void buttonClickHandler(String data) {
        Window.alert(data);
    }
}
