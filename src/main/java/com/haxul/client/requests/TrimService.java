package com.haxul.client.requests;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("trim")
public interface TrimService extends RemoteService {

    String trimText(String text) throws IllegalArgumentException;
}
