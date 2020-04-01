package com.exam.entranceinew.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.exam.entranceinew.R;

public class ForgotPasswordScreen extends AppCompatActivity {
    TextView submit_tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password);

        submit_tv = findViewById(R.id.submit_tv);

        submit_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotPasswordScreen.this, ResetPasswordScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }

   /* public void onClick(View view) {
        switch (view.getId()){

            case R.id.tv_create_account:

                break;


        }
    }*/
}
