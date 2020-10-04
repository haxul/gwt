package com.haxul.client.requests;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

public interface StringServiceAsync {
    void greetServer(String name, AsyncCallback<String> async);
}
