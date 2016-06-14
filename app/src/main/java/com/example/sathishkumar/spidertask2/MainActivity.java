package com.example.sathishkumar.spidertask2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener
{

    int i=0;
    Spinner spinner;
    String str1,str2;
    CheckBox c1,c2,c3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner= (Spinner)findViewById(R.id.spinner);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(this,R.array.deps,android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        c1=(CheckBox) findViewById(R.id.c1);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked()){
                    i++;
                }
                else{
                    i--;
                }
            }

        });
        c2=(CheckBox) findViewById(R.id.c2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    i++;
                } else {
                    i--;
                }
            }
        });
        c3=(CheckBox) findViewById(R.id.c3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    i++;
                } else {
                    i--;
                }
            }
        });

    }



   @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }



    public void submitButton(View view)
    {
        EditText text1= (EditText) findViewById(R.id.editText);
        EditText text2= (EditText) findViewById(R.id.editText2);
        str1 =  text1.getText().toString();
        str2 =  text2.getText().toString();

        if (str1.matches(""))
        {
            Toast toast=Toast.makeText(this, "no name", Toast.LENGTH_SHORT);
            toast.show();


        }
        if (str2.matches(""))
        {
            Toast toast=Toast.makeText(this, "no roll-no", Toast.LENGTH_SHORT);
            toast.show();


        }

        if(i==0)
        {
          Toast toast=Toast.makeText(this,"no profiles opted", Toast.LENGTH_SHORT);
          toast.show();


        }

        if(i!=0&&!str1.matches("")&&!str2.matches(""))
        {

            Intent intent  = new Intent(MainActivity.this, activity_2.class);
            intent.putExtra("name",str1);
            startActivity(intent);

        }
    }
}


