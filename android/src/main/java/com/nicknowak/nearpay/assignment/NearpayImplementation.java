package com.nicknowak.nearpay.assignment;

import android.util.Log;

import io.nearpay.terminalsdk.TerminalSDK;
import android.app.Activity;
import io.nearpay.terminalsdk.SdkEnvironment;
import io.nearpay.terminalsdk.data.dto.Country;

public class NearpayImplementation {
    public boolean initialize(Activity activity) {
        try {
            TerminalSDK nearpay = new TerminalSDK.Builder()
                    .activity(activity)  // Sets the activity context
                    .environment(SdkEnvironment.SANDBOX)  // Choose SANDBOX or PRODUCTION or INTERNAL
                    .googleCloudProjectNumber(12345678L)  // Set Google Cloud project number
                    .country(Country.USA)  // Set country SA, TR, USA, KEN
                    .build();
            Log.d("NearpayCapacitor", "TerminalSDK Initialized Successfully.");
            return true;
        } catch (Exception e) {
            Log.e("NearpayCapacitor", "Failed to init SDK", e);
            throw new RuntimeException(e);
        }
        
    }

}
