package com.ismailmesutmujde.kotlinprogressbarsliderratingbar

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinprogressbarsliderratingbar.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.buttonStart.setOnClickListener {
            bindingMain.progressBar.visibility = View.VISIBLE
        }

        bindingMain.buttonStop.setOnClickListener {
            bindingMain.progressBar.visibility = View.INVISIBLE
        }

        bindingMain.slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                bindingMain.textViewResult.text = "Result : $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        bindingMain.buttonShow.setOnClickListener {
            val incomingProgress = bindingMain.slider.progress
            val incomingRating = bindingMain.ratingBar.rating

            Log.e("Progress", incomingProgress.toString())
            Log.e("Rating", incomingRating.toString())
        }

    }
}