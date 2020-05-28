package com.kroshz.homework_2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button b_ok;
    private Button b_clear;
    private TextView tv_subscribe;
    private TextView et_name;
    private TextView et_mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        b_ok = findViewById(R.id.b_ok);
        b_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_name.length() == 0) {
                    tv_subscribe.setText(R.string.nameError);
                } else if (et_mail.length() == 0) {
                    tv_subscribe.setText(R.string.mailError);
                } else {
                    tv_subscribe.setText(getString(R.string.sub1) +
                    et_name.getText() + getString(R.string.sub2) + et_mail.getText());
                }
            }
        });

        b_clear = findViewById(R.id.b_clear);
        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_subscribe.setText("");
                et_name.setText("");
                et_mail.setText("");

            }
        });

        tv_subscribe = findViewById(R.id.tv_subscribe);
        et_name = findViewById(R.id.et_name);
        et_mail = findViewById(R.id.et_mail);
    }


}
