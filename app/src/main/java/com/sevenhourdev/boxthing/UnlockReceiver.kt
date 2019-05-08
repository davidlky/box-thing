package com.sevenhourdev.boxthing

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class UnlockReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("UnlockReceiver", "Unlocked")

        context!!.startService(Intent(context, FloatingWidgetService::class.java))
    }

}