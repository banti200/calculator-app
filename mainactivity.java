package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button addBtn, subBtn, mulBtn, divBtn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);

        addBtn = findViewById(R.id.addBtn);
        subBtn = findViewById(R.id.subBtn);
        mulBtn = findViewById(R.id.mulBtn);
        divBtn = findViewById(R.id.divBtn);

        addBtn.setOnClickListener(v -> calculate("+"));
        subBtn.setOnClickListener(v -> calculate("-"));
        mulBtn.setOnClickListener(v -> calculate("*"));
        divBtn.setOnClickListener(v -> calculate("/"));
    }

    private void calculate(String op) {
        double n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());
        double res = 0;

        switch (op) {
            case "+": res = n1 + n2; break;
            case "-": res = n1 - n2; break;
            case "*": res = n1 * n2; break;
            case "/": res = n1 / n2; break;
        }

        result.setText("Result: " + res);
    }
}
