package com.poi.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoArranque extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent service = new Intent(context,  Cronometro.class);
		context.startService(service);
	}

}
