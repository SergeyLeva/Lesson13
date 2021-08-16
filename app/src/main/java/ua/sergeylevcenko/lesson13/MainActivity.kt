package ua.sergeylevcenko.lesson13

import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val backLightSeekBar = findViewById<SeekBar>(R.id.seekBar)
        val settingTextView = findViewById<TextView>(R.id.textViewSetting)
        backLightSeekBar
            .setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                    val backLightValue = progress.toFloat() / 100
                    settingTextView.text = backLightValue.toString()
                    val layoutParams = window
                        .attributes
                    layoutParams.screenBrightness = backLightValue
                    window.attributes = layoutParams
                    if (backLightValue < 0.1) {
                        backLightValue > 0.1.toFloat()
                    }
                }

                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {}
            })
    }
}

