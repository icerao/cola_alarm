package com.bluysky.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * 接收全局定时器事件广播
 * User: icerao
 * Date: 13-5-2
 * Time: 下午8:27
 */
public class AlarmReceiver extends BroadcastReceiver
{
	@Override
	public void onReceive(Context context, Intent intent)
	{
		if(intent.getAction().equals(AlarmConstanst.ALARM_ACTION))
		{
			Log.d("cola","receiver action");
		}
	}
}
