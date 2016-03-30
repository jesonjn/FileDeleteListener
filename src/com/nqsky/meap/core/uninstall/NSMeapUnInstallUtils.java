package com.nqsky.meap.core.uninstall;

import android.util.Log;

public class NSMeapUnInstallUtils {
	public static native void init(String packetPath, String delPath);

	static {
		Log.d("onEvent", "load jni lib");
		System.loadLibrary("NSMeapUninstallListener");
	}
}
