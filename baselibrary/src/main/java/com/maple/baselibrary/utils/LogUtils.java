package com.maple.baselibrary.utils;


import android.util.Log;

import com.maple.baselibrary.BuildConfig;

public final class LogUtils {

    private LogUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static boolean isShow = BuildConfig.DEBUG;

    public static void logGGQ(String msg) {
        if (isShow) {
            Log.i("GGQ", msg);
        }
    }
}