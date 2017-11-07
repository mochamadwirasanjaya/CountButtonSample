package com.acewira.countbutton;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    View view;
    private int mCounter = 0;
    Button btnCount;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCount = (Button) findViewById(R.id.btnCount);
        textView = (TextView) findViewById(R.id.textView);

        btnCount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mCounter ++;
                textView.setText(Integer.toString(mCounter));
            }

        });

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.green);
    }


    public void goGreen (View v){
        view.setBackgroundResource(R.color.green);
    }

    public void goBlue (View v){
        view.setBackgroundResource(R.color.blue);
    }

}
