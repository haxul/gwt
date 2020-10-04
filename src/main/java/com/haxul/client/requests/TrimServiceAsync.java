package com.haxul.client.requests;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;

public interface TrimServiceAsync {
    void trimText(String text, AsyncCallback<String> async);
}
