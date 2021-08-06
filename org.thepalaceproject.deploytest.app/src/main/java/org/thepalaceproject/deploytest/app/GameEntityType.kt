package org.thepalaceproject.deploytest.app

import android.graphics.Canvas

interface GameEntityType {

    fun onRender(
        canvas: Canvas,
        deltaMs: Double
    ) {
    }

    fun onEvent(
        event: BreakoutEvent,
        deltaMs: Double
    ) {
    }

    fun onLogic(deltaMs: Double) {
    }
}
