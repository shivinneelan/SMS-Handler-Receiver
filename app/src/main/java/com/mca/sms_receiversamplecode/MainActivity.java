package com.mca.sms_receiversamplecode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Permissions.verifySMSPermissions(MainActivity.this);


        // add permission in the Manifest
        //         <uses-permission android:name="android.permission.RECEIVE_SMS" />

        // check manual permission granted
        // Permission class

        //create a receiver in the manifest
        /*

         <receiver android:name=".SmsReceiver">  // class name
            <intent-filter>
                <action android:name="android.provider.Telephony.SMS_RECEIVED"></action>
            </intent-filter>
        </receiver>

         */

    }


}

