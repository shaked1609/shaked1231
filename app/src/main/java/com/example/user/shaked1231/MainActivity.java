package com.example.user.shaked1231;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et;
Button b1,b2,b3,b4,b5,b6,b7;
String st1=new String("");
double x,y,z,w=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText) findViewById(R.id.textView);
        b1=(Button) findViewById(R.id.button3);
        b2=(Button) findViewById(R.id.button4);
        b3=(Button) findViewById(R.id.button5);
        b4=(Button) findViewById(R.id.button6);
        b5=(Button) findViewById(R.id.button7);
        b6=(Button) findViewById(R.id.button8);
        b7=(Button) findViewById(R.id.button9);
    }
    public void cefl(View view){
     if(w==0){
      st1=et.getText().toString();
      x=Double.parseDouble(st1);
      et.setText("");

         if (w==1){
             et.setText("");
             st1=et.getText().toString();
             y=Double.parseDouble(st1);

         }

         if (w==3){
             z=x*y;
             et.setText(""+z);

         }
         w++;
     }
     }



    }


