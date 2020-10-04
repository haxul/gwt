package com.haxul.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.haxul.client.requests.TrimService;

public class TrimServiceImp extends RemoteServiceServlet implements TrimService {

    @Override
    public String trimText(String text) {
        return text.trim();
    }
}
