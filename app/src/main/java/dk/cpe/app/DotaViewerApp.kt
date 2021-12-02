package dk.cpe.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Application class for the Dota viewer app
 *
 *
 */
@HiltAndroidApp
class DotaViewerApp: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}