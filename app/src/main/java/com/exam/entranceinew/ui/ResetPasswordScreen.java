package com.exam.entranceinew.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.exam.entranceinew.R;

public class ResetPasswordScreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_password);
    }

    public void onClick(View view) {
        switch (view.getId()){

            case R.id.submit_tv:
                Intent intent = new Intent(ResetPasswordScreen.this, LoginScreen.class);
                startActivity(intent);
                finish();
                break;


        }
    }
}
