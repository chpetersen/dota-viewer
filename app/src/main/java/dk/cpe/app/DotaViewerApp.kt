package dk.cpe.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DotaViewerApp: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}