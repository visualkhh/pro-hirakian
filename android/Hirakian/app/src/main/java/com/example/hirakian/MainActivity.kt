package com.example.hirakian

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.view.Gravity
import android.view.Window
import android.view.WindowManager


class MainActivity : AppCompatActivity() {

    var sw = true;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()!!.hide(); //<< this
//        //Remove title bar
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
//
//        //Remove notification bar
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
//        //set content view AFTER ABOVE sequence (to avoid crash)
        setContentView(R.layout.activity_main);

        hirakianBtn.text = "LOVE"
        hirakianText.text = "덕분이네 두부가게";
        hirakianText.setTextColor(Color.rgb(255,255,255))
        hirakianLayout.setBackgroundColor(Color.rgb(0,0,0));

        hirakianBtn.setOnClickListener {
            var toast: Toast? = null;

            if (sw) {
                toast = Toast.makeText(this@MainActivity,"to the do", Toast.LENGTH_SHORT);
                hirakianText.text = "Do";
                hirakianText.setTextColor(Color.rgb(0,0,0))
                hirakianImg.setImageResource(R.drawable.dooboo);
                hirakianLayout.setBackgroundColor(Color.rgb(255,255,255));
            } else {
                toast = Toast.makeText(this@MainActivity,"to the boon", Toast.LENGTH_SHORT);
                hirakianText.text = "Boon";
                hirakianText.setTextColor(Color.rgb(255,255,255))
                hirakianImg.setImageResource(R.drawable.moon);
                hirakianLayout.setBackgroundColor(Color.rgb(0,0,0));
            }
            toast.setGravity(Gravity.CENTER or Gravity.CENTER_HORIZONTAL, 0, 0)
            toast.show();
            sw = !sw;
        }
    }
}
