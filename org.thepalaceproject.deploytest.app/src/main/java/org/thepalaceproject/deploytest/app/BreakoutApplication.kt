package org.thepalaceproject.deploytest.app

import android.app.Application
import org.slf4j.LoggerFactory

class BreakoutApplication : Application() {

    private val logger = LoggerFactory.getLogger(BreakoutApplication::class.java)

    override fun onCreate() {
        super.onCreate()
        this.logger.debug("starting")
    }
}
