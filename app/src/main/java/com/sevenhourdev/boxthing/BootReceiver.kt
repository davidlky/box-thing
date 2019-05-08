package com.sevenhourdev.boxthing

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.util.Log


class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("BootReceiver", "Unlocked")
        context!!.registerReceiver(UnlockReceiver(), IntentFilter("android.intent.action.USER_PRESENT"))
    }
}