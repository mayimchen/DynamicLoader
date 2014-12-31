package com.wzystal.dynamicloader.util;

import android.util.Log;

public class LogHelper {
	private static boolean showLog = true;

	public static void closeAllLogs() {
		showLog = false;
	}

	public static void showAllLogs() {
		showLog = true;
	}

	public static void d(String tag, String msg) {
//		if (showLog) {
			Log.d(tag, msg);
//		}
	}

	public static void e(String tag, String msg) {
		if (showLog) {
			Log.e(tag, msg);
		}
	}

	public static void v(String tag, String msg) {
		if (showLog) {
			Log.v(tag, msg);
		}
	}

	public static void w(String tag, String msg) {
		if (showLog) {
			Log.w(tag, msg);
		}
	}

	public static void i(String tag, String msg) {
		if (showLog) {
			Log.i(tag, msg);
		}
	}
}
