package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText result;
    double num1 = 0, num2 = 0;
    String op = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.textView);
    }

    public void BtnFuncNum(View view) {
        if (view instanceof Button) {
            Button button = (Button) view;
            String str = button.getText().toString();
            result.append(str);
        }
    }

    public void BtnFuncEql(View view) {
        if (view instanceof Button) {
            String temp2 = result.getText().toString();
            num2 = Integer.parseInt(temp2);
            double sum = 0;
            switch (op) {
                case "+":
                    sum = num1 + num2;
                    break;
                case "-":
                    sum = num1 - num2;
                    break;
                case "X":
                    sum = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0)
                        result.setText("error");
                    else
                        sum = num1 / num2;
                    break;
                default:
                    break;

            }
            num1 = sum;
            result.setText(sum + "");
        }
    }

    public void BtnFuncPlus(View view) {
        if (view instanceof Button) {
            String temp = result.getText().toString();
            num1 = Double.parseDouble(temp);
            op = "+";
            result.setText("");
        }
    }

    public void BtnFuncMinus(View view) {
        if (view instanceof Button) {
            String temp = result.getText().toString();
            num1 = Double.parseDouble(temp);
            op = "-";
            result.setText("");
        }
    }

    public void BtnFuncTimes(View view) {
        if (view instanceof Button) {
            String temp = result.getText().toString();
            num1 = Double.parseDouble(temp);
            op = "X";
            result.setText("");
        }
    }

    public void BtnFuncSub(View view) {
        if (view instanceof Button) {
            String temp = result.getText().toString();
            num1 = Double.parseDouble(temp);
            op = "/";
            result.setText("");
        }

    }


    public void BtnFuncAC(View view) {
        if (view instanceof Button) {
            result.setText("");
        }

    }
}



