package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btn1, btn2, btn3, btn4, btn5;
    TextView textResult;
    String num1, num2;
    Float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기(160076_최호준)");
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        textResult = findViewById(R.id.textResult);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty() ){
                    Toast toast = Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    result = Float.parseFloat(num1) + Float.parseFloat((num2));

                    textResult.setText("계산결과: " + result.toString());
                }


            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty() ){
                    Toast toast = Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {

                    result = Float.parseFloat(num1) - Float.parseFloat((num2));
                    textResult.setText("계산결과: " + result.toString());
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty() ){
                    Toast toast = Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {

                    result = Float.parseFloat(num1) * Float.parseFloat((num2));
                    textResult.setText("계산결과: " + result.toString());
                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (Integer.parseInt((num2)) == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(), "0으로 나누는 기능은 지원하지않습니다.",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    if (num1.isEmpty() || num2.isEmpty() ){
                        Toast toast = Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    else
                    {
                        result = Float.parseFloat(num1) / Float.parseFloat((num2));
                        textResult.setText("계산결과: " + result.toString());
                    }
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty() ){
                    Toast toast = Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    result = Float.parseFloat(num1) % Float.parseFloat((num2));
                    textResult.setText("계산결과: " + result.toString());
                }
            }
        });


    }
}
