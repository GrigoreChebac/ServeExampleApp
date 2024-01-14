package com.example.server

import android.os.IBinder
import android.util.Log
import com.example.LightsControllerService.ILightsControllerService


class ServerLightsServiceImp : ILightsControllerService.Stub() {

    override fun setLedColor(color: LedColor?): Boolean {
        Log.d("Greg", color?.name.toString())
        return true
    }

    override fun asBinder(): IBinder {
        return this
    }
}
