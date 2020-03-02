package com.example.myfirstapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count,count1,count2,count3;
    private TextView text,text2;
    private EditText edit,edit2;
    private Button button2,button3;
    private CheckBox box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text = findViewById(R.id.text);
        text2 = findViewById(R.id.text2);
        edit = findViewById(R.id.edit);
        edit2 = findViewById(R.id.edit);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        box = findViewById(R.id.box);


    }

    public void showmessage (View view){
        if(view.getId()==R.id.button3){
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        }

    }

}
