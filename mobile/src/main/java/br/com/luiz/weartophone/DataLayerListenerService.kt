package br.com.luiz.weartophone

import android.util.Log
import com.google.android.gms.wearable.MessageEvent
import com.google.android.gms.wearable.WearableListenerService

class DataLayerListenerService : WearableListenerService() {

    override fun onMessageReceived(p0: MessageEvent?) {
        super.onMessageReceived(p0)
        when(p0?.path) {
            "/PROXIMO" -> {
                Log.i("WEAR", "BOTAO CLICADO")}
        }
    }

}