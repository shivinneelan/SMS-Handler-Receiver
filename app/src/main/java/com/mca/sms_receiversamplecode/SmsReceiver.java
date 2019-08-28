package com.mca.sms_receiversamplecode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;


public class SmsReceiver extends BroadcastReceiver {
    String address;
    public void onReceive(Context context, Intent intent) {


        Toast.makeText(context, "sms received", Toast.LENGTH_SHORT).show();

        final String SMS_BUNDLE = "pdus";

        // get SMS from Intent while receive SMS
        Bundle intentExtras = intent.getExtras();
        if (intentExtras != null) {
            Toast.makeText(context, "sms not null", Toast.LENGTH_SHORT).show();
            Object[] sms = (Object[]) intentExtras.get(SMS_BUNDLE);

            for (int i = 0; i < sms.length; ++i) {
                SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) sms[i]);//new sms converted to byte from pdu format first

                String smsBody = smsMessage.getMessageBody().toString();//then covert byte to string
                address = smsMessage.getOriginatingAddress();
                      Toast.makeText(context, "From :"+address +"\n Message : "+smsBody , Toast.LENGTH_LONG).show();



            }
        }
    }

}
