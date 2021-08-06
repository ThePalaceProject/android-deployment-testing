package org.thepalaceproject.deploytest.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.thepalaceproject.deployment_testing.R

class BreakoutActivity : AppCompatActivity() {

    private lateinit var breakoutView: BreakoutView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.setTheme(R.style.Blank)
        this.setContentView(R.layout.main)

        this.breakoutView = this.findViewById(R.id.breakoutView)
    }
}
