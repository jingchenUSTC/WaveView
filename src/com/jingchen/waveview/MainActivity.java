package com.jingchen.waveview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * 更多详解见博客http://blog.csdn.net/zhongkejingwang/article/details/38556891
 * 
 * @author chenjing
 * 
 */
public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
