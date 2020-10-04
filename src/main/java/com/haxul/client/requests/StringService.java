package com.haxul.client.requests;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.haxul.client.objects.CallInput;
import com.haxul.client.objects.CallResponse;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface StringService extends RemoteService {
  CallResponse greetServer(CallInput text) throws Exception;
}
