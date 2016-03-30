package com.nqsky.meap.core.uninstall;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;

public class MyActivity extends Activity {
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Intent intent = new Intent(this, unInstallListener.class);
		startService(intent);
		File file = new File(Environment.getExternalStorageDirectory()
				+ File.separator + "com.nqsky.meap.test");
		NSMeapUnInstallUtils.init("/data/data/com.nqsky.meap.core.uninstall",
				file.getAbsolutePath());

	}

}