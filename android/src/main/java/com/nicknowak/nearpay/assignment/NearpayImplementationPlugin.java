package com.nicknowak.nearpay.assignment;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "NearpayImplementation")
public class NearpayImplementationPlugin extends Plugin {

    private NearpayImplementation implementation = new NearpayImplementation();

    @PluginMethod
    public void initialize(PluginCall call) {
        try {
            boolean initialized = implementation.initialize(bridge.getActivity());
            JSObject ret = new JSObject();
            ret.put("initialized", initialized);
            call.resolve(ret);
        } catch (Exception ex) {
            call.reject("Initialization failed: " + ex.getMessage());
        }
    }
}
