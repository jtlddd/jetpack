package com.wdx.kotlin

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.TextView
import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Route
import com.wdx.common.base.BaseActivity


/**
 *
 * @ Description:
 * @ Author: wdx
 * @ CreateDate: 2020/9/4 11:32
 */
@Route(path = "/kotlin/kotlintestactivity")
class KotlinTestActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_test)
        var tv_final = findViewById<TextView>(R.id.tv_final)
        Log.e("wdx", "********************************")

        tv_final.let {
            it.setOnClickListener{
                Toast.makeText(this, "kotlin测试关闭了", Toast.LENGTH_LONG).show()

                finish()
            }
        }
        tv_final.let {
           it. setOnTouchListener OnTouchListener@{ view, motionEvent ->
               when(motionEvent.action){
                   MotionEvent.ACTION_UP -> {
                   }
                   MotionEvent.ACTION_DOWN -> {
                   }
               }
               return@OnTouchListener true
           }
        }
    }


}