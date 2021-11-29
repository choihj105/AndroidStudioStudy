package com.example.p_l1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class L1 extends AppCompatActivity {

    EditText edit1, edit2;
    TextView textresult;
    Button add,sub,mul,div;
    String num1,num2;
    Integer result;
    Button[] numButtons = new Button[10];
    Integer[] numBTNIds= {R.id.btn0,R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5,
            R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1);

        setTitle("테이블 레이아웃 계산기");

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        add = findViewById(R.id.Add);
        sub = findViewById(R.id.Sub);
        mul = findViewById(R.id.Mul);
        div = findViewById(R.id.Div);
        textresult = findViewById(R.id.text_result);

        add.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result=Integer.parseInt(num1) + Integer.parseInt(num2);
                textresult.setText("계산결과: "+ result.toString());

                return false;
            }
        });
        sub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result=Integer.parseInt(num1) - Integer.parseInt(num2);
                textresult.setText("계산결과: "+ result.toString());

                return false;
            }
        });
        mul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result=Integer.parseInt(num1) * Integer.parseInt(num2);
                textresult.setText("계산결과: "+ result.toString());

                return false;
            }
        });

        div.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result=Integer.parseInt(num1) / Integer.parseInt(num2);
                textresult.setText("계산결과: "+ result.toString());

                return false;
            }
        });

        for(int i =0 ; i<numButtons.length; i++){
            numButtons[i]= findViewById(numBTNIds[i]);
        }
        for(int i=0 ; i<numBTNIds.length; i++){
            final int idx;
            idx =i;
            numButtons[idx].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(edit1.isFocused()==true) {
                        num1 = edit1.getText().toString() + numButtons[idx].getText().toString();
                        edit1.setText(num1);
                    } else if(edit2.isFocused()==true) {
                        num2 = edit2.getText().toString() + numButtons[idx].getText().toString();
                        edit1.setText(num2);
                    } else {
                        Toast.makeText(getApplicationContext(), "먼저 에디트 텍스트를 선택하세요", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }


    }
}