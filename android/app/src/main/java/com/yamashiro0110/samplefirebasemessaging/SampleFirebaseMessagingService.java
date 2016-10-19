package com.yamashiro0110.samplefirebasemessaging;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by yamashiro-r on 2016/09/30.
 */
public class SampleFirebaseMessagingService extends FirebaseMessagingService {

    private final String tag = this.getClass().getSimpleName();

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        String from = remoteMessage.getFrom();
        Log.d(tag, String.format("Push通知を受信しました from: %s, data: %s", from, remoteMessage.toString()));
    }
}
