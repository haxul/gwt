package com.haxul.client.requests;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.haxul.client.objects.CallInput;
import com.haxul.client.objects.CallResponse;

public interface StringServiceAsync {
    void greetServer(CallInput text, AsyncCallback<CallResponse> async);
}
