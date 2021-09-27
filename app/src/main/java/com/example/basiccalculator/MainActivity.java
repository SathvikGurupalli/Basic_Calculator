package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusFunction(View view) {

        Log.i("Info", "plus button Pressed!");
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());

        int plusAns = num1+ num2;
        //Toast.makeText(MainActivity.this, Integer.toString(plusAns), Toast.LENGTH_LONG).show();
        String plusAnsString = Integer.toString(plusAns);
        goToActivity2(plusAnsString);

    }


    public void minusFunction(View view) {

        Log.i("Info", "subtract button Pressed!");
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());

        int minusAns = num1 - num2;
        //Toast.makeText(MainActivity.this, Integer.toString(plusAns), Toast.LENGTH_LONG).show();
        String minusAnsString = Integer.toString(minusAns);
        goToActivity2(minusAnsString);
    }

    public void timesFunction(View view) {

        Log.i("Info", "times button Pressed!");
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());

        int timesAns = num1 * num2;
        //Toast.makeText(MainActivity.this, Integer.toString(plusAns), Toast.LENGTH_LONG).show();
        String timesAnsString = Integer.toString(timesAns);
        goToActivity2(timesAnsString);
    }

    public void divideFunction(View view) {

        Log.i("Info", "divide button Pressed!");
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());

        int divideAns = num1/num2;
        //Toast.makeText(MainActivity.this, Integer.toString(plusAns), Toast.LENGTH_LONG).show();
        String divideAnsString = Integer.toString(divideAns);
        goToActivity2(divideAnsString);
    }

    public void goToActivity2(String s)
    {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);

    }


}