package com.haxul.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.haxul.client.objects.CallInput;
import com.haxul.client.objects.CallResponse;
import com.haxul.client.requests.StringService;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements StringService {


    @Override
    public CallResponse greetServer(CallInput text) throws IllegalArgumentException {
        CallResponse response = new CallResponse();
        response.responseCode = 200;
        response.responseText = text.text;
        return response;
    }
}
