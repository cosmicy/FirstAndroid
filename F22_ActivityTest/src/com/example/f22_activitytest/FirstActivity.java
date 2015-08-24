package com.example.f22_activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class FirstActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//隐藏标题栏,这句代码一定要在setContentView()之前执行
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
	}

}
