package com.example.f22_activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class FirstActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//���ر�����,������һ��Ҫ��setContentView()֮ǰִ��
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
	}

}
