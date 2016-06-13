package com.example.sathishkumar.spidertask2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.Format;


public class activity_2 extends Activity
{
    TextView nameView;
    Format format;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_2);
        TextView nameView=(TextView) findViewById(R.id.textView3);
        nameView.setText(getIntent().getExtras().getString("name"));
    }

}
