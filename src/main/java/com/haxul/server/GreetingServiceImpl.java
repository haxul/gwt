package com.haxul.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.haxul.client.StringService;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements StringService {

    @Override
    public String greetServer(String name) throws IllegalArgumentException {
        return "Hello "+ name + ".Get from server";
    }
}
