package com.clicks.yogi.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    RadioButton radio1,radio2,radio3;
    RadioGroup group;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
    btn = findViewById(R.id.btn);
    radio1 = findViewById(R.id.radio1);
    radio2 = findViewById(R.id.radio2);
    radio3 = findViewById(R.id.radio3);
    group = findViewById(R.id.group);
 
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            checkStatus();
        }
    });
    
    group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            checkStatus();
        }
    });
    
    }

    private void checkStatus() {
    
    if (radio1.isChecked()){
        Toast.makeText(this, "Android", Toast.LENGTH_SHORT).show();
    }else if (radio2.isChecked()){
        Toast.makeText(this, "Kotlin", Toast.LENGTH_SHORT).show();
    }else if (radio3.isChecked()){
        Toast.makeText(this, "Flutter", Toast.LENGTH_SHORT).show();
        }
    }
}