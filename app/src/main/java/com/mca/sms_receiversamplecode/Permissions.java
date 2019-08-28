package com.mca.sms_receiversamplecode;


import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;

public class Permissions {


    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.RECEIVE_SMS
    };

    //check permissions.
    public static void verifySMSPermissions(Activity activity) {
        // Check if we have read or write permission
        int receiveSMSPermission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.RECEIVE_SMS);


        if (receiveSMSPermission != PackageManager.PERMISSION_GRANTED) {
            // We don't have permission so prompt the user
            ActivityCompat.requestPermissions(
                    activity,
                    PERMISSIONS_STORAGE,
                    1
            );
        }
    }
}


