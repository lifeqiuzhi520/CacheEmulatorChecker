package com.snail.device.jni;

/**
 * Author: snail
 * Data: 2017/7/20 下午4:46
 * Des:
 * version:
 */

public class EmulatorDetectUtil {

    static {
        System.loadLibrary("emulator_check");
    }

    public static native boolean detect();

    public static synchronized boolean isEmulator() {
        return detect();
    }

    public void throwNativeCrash() {

    }
}
