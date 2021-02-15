package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et_fnum= findViewById(R.id.calc_main_et_funm);
        EditText et_snum= findViewById(R.id.calc_main_et_sunm);
        Button btn_sum= findViewById(R.id.calc_main_bnt_sum);
        TextView tv_result= findViewById(R.id.calc_main_tv_result );
        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fnum=et_fnum.getText().toString();
                String snum=et_snum.getText().toString();
                double first = Double.parseDouble(fnum);
                double second = Double.parseDouble(snum);
                tv_result.setText(first+second+"");
            }
        });

    }
}