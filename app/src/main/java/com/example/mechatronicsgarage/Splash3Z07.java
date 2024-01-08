package com.example.mechatronicsgarage;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash3Z07 extends AppCompatActivity {
    Handler handler3Z07;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash3_z07);
        handler3Z07=new Handler();
        handler3Z07.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent3Z07=new
                        Intent(Splash3Z07.this,MainActivity.class);
                startActivity(intent3Z07);
                finish();
            }
        },1478);
    }
}