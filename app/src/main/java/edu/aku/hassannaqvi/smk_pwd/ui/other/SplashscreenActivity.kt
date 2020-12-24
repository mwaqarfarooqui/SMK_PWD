package edu.aku.hassannaqvi.smk_pwd.ui.other

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import edu.aku.hassannaqvi.smk_pwd.R
import kotlinx.coroutines.*

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class SplashscreenActivity : Activity() {
    private lateinit var activityScope: Job

    init {
        /*provinces = mutableListOf("....")
        districtsMap = mutableMapOf()*/
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        callingScope()
    }

    companion object {
        private const val SPLASH_TIME_OUT = 1500L
    }

    override fun onPause() {
        super.onPause()
        activityScope.cancel()
    }

    private fun callingScope() {
        activityScope = CoroutineScope(Dispatchers.Main).launch {
            delay(SPLASH_TIME_OUT)
            finish()
            startActivity(Intent(this@SplashscreenActivity, LoginActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        if (activityScope.isActive.not()) callingScope()
    }

    override fun onDestroy() {
        super.onDestroy()
        activityScope.cancel()
    }

    //Only use for calling coroutine in java
    abstract class Continuation<in T> : kotlin.coroutines.Continuation<T> {
        abstract fun resume(value: T)
        abstract fun resumeWithException(exception: Throwable)
        override fun resumeWith(result: Result<T>) = result.fold(::resume, ::resumeWithException)
    }
}