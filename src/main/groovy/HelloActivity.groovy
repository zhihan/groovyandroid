package me.zhihan.helloworld1

import android.widget.Button
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.View

import groovy.transform.CompileStatic

import me.zhihan.R
import me.zhihan.helloworld1.utils

@CompileStatic
public class HelloActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);


        String messageText = "Hello Groovy!";
        TextView message = findViewById(R.id.hello_text) as TextView
        message.text = messageText;

        Button button = findViewById(R.id.button) as Button
        button.setOnClickListener(utils.createOnClickListener {View v ->
            message.text = "Clicked!";
            return
        })
    }



}