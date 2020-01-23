package com.example.myapplication;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextToSpeech ansTextToSpeech;
        ansTextToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            public void onInit(int status) {

            }
        });

        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numberEditText1 = (EditText) findViewById(R.id.numberEditText1);
                EditText numberEditText2 = (EditText) findViewById(R.id.numberEditText2);
                TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

                double num1 = Double.parseDouble(numberEditText1.getText().toString());
                double num2 = Double.parseDouble(numberEditText2.getText().toString());
                double ansNum = num1 + num2;
                String ansStr = ansNum + "";

                ansTextView.setText(ansStr);

                //Toast.makeText(getApplicationContext(), ansStr, Toast.LENGTH_SHORT).show();
                ansTextToSpeech.speak(ansStr, TextToSpeech.QUEUE_FLUSH, null);

            }
        });

        Button subButton = (Button) findViewById(R.id.subButton);
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numberEditText1 = (EditText) findViewById(R.id.numberEditText1);
                EditText numberEditText2 = (EditText) findViewById(R.id.numberEditText2);
                TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

                double num1 = Double.parseDouble(numberEditText1.getText().toString());
                double num2 = Double.parseDouble(numberEditText2.getText().toString());

                double ansNum = num1 - num2;
                String ansStr = ansNum + "";

                ansTextView.setText(ansStr);

                //Toast.makeText(getApplicationContext(), ansStr, Toast.LENGTH_SHORT).show();
                ansTextToSpeech.speak(ansStr, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        Button multButton = (Button) findViewById(R.id.multButton);
        multButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numberEditText1 = (EditText) findViewById(R.id.numberEditText1);
                EditText numberEditText2 = (EditText) findViewById(R.id.numberEditText2);
                TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

                double num1 = Double.parseDouble(numberEditText1.getText().toString());
                double num2 = Double.parseDouble(numberEditText2.getText().toString());
                double ansNum = num1 * num2;
                String ansStr = ansNum + "";

                ansTextView.setText(ansStr);

                //Toast.makeText(getApplicationContext(), ansStr, Toast.LENGTH_SHORT).show();
                ansTextToSpeech.speak(ansStr, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        Button divButton = (Button) findViewById(R.id.divButton);
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numberEditText1 = (EditText) findViewById(R.id.numberEditText1);
                EditText numberEditText2 = (EditText) findViewById(R.id.numberEditText2);
                TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

                double num1 = Double.parseDouble(numberEditText1.getText().toString());
                double num2 = Double.parseDouble(numberEditText2.getText().toString());
                double ansNum = num1 / num2;
                String ansStr = ansNum + "";

                ansTextView.setText(ansStr);

                //Toast.makeText(getApplicationContext(), ansStr, Toast.LENGTH_SHORT).show();
                ansTextToSpeech.speak(ansStr, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

    }
}
