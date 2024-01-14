package com.example.server

import android.app.Service
import android.content.Intent
import android.os.IBinder

class ServerLightsServer : Service() {

    private val serverLightsServiceImp = ServerLightsServiceImp()

    override fun onBind(intent: Intent): IBinder {
        return serverLightsServiceImp
    }
}
