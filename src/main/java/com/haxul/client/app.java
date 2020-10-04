package com.haxul.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class app implements EntryPoint {

    private final VerticalPanel mainPanel = new VerticalPanel();
    private final StringServiceAsync serviceAsync = GWT.create(StringService.class);


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
            serviceAsync.greetServer(textBox.getText(), new AsyncCallback<String>() {

                @Override
                public void onFailure(Throwable throwable) {
                        Window.alert(throwable.getMessage());
                }

                @Override
                public void onSuccess(String s) {
                    serverOutput.setText(s);
                }
            });
            textBox.setText("");
            label.setText("");
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
