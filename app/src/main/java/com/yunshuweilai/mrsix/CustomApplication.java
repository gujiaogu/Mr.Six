package com.yunshuweilai.mrsix;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by gujiao on 2016/5/8.
 */
public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(this);
    }
}
