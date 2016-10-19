package com.yamashiro0110.samplefirebasemessaging;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by yamashiro-r on 2016/09/30.
 */
public class SampleFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private final String tag = this.getClass().getSimpleName();

    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(tag, "device_tokenを発行しました:" + token);
    }
}
