package eu.bolt.screenshotty

import android.content.Intent

interface ScreenshotManager {

    fun makeScreenshot(applyErrorFallback: Boolean = true, serviceAvailable: Boolean = false): ScreenshotResult

    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
}
