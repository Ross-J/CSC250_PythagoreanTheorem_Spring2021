package com.example.csc250_pythagoreantheorem_spring2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText inputA_ET;
    private EditText inputB_ET;
    private TextView resultC_TV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inputA_ET = this.findViewById(R.id.inputA_ET);
        this.inputB_ET = this.findViewById(R.id.inputB_ET);
        this.resultC_TV = this.findViewById(R.id.resultC_TV);
    }

    public void calculateC(View v)
    {
        String inputA = this.inputA_ET.getText().toString();
        String inputB = this.inputB_ET.getText().toString();

        String errorMsg = "";
        if(inputA.length() == 0 || inputB.length() == 0)
        {
            errorMsg = errorMsg + "You must enter both input A and input B before calculating";
        }

        if(errorMsg.length() > 0)
        {
            Toast.makeText(this, errorMsg, Toast.LENGTH_LONG).show();
            return;
        }

        double doubleInputA = Double.parseDouble(inputA);
        double doubleInputB = Double.parseDouble(inputB);

        double answer = Math.hypot(doubleInputA, doubleInputB);
        this.resultC_TV.setText("" + answer);
    }

}