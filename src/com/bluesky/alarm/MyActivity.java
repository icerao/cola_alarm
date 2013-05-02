package com.bluesky.alarm;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity implements View.OnClickListener
{
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button startBtn=(Button) findViewById(R.id.startBtn);
		startBtn.setOnClickListener(this);
	}

	public void setAlarm(Context context,long timeInMillis)
	{
		Log.d("cola","setalarm");
		AlarmManager am=(AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
		Intent intent=new Intent(AlarmConstanst.ALARM_ACTION);
		PendingIntent sender = PendingIntent.getBroadcast(context,0,intent,PendingIntent.FLAG_CANCEL_CURRENT);
		int interval = 5000;//闹铃间隔
		am.setRepeating(AlarmManager.RTC_WAKEUP,timeInMillis,interval,sender);
	}

	@Override
	public void onClick(View view)
	{
		setAlarm(this,System.currentTimeMillis()+5000);
	}
}
