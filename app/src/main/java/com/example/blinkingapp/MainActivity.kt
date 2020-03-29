package com.example.blinkingapp


import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var blinkTextView: TextView
    @SuppressLint("WrongConstant", "ObjectAnimatorBinding")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        blinkTextView = findViewById(R.id.textMessage)

        btnAction.setOnClickListener{
            val animator:ObjectAnimator= ObjectAnimator.ofInt(blinkTextView,"backgroundColor",Color.YELLOW,
                Color.RED,Color.GREEN

            );
            animator.duration = 500;
            animator.setEvaluator(ArgbEvaluator())
            animator.repeatMode = Animation.REVERSE
            animator.repeatCount = Animation.INFINITE
            animator.start()
        }
    }

}