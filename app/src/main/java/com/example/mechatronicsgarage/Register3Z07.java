package com.example.mechatronicsgarage;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Register3Z07 extends AppCompatActivity {
    EditText Nam_3Z07,NwPass_3Z07;
    Button CrAnt_3Z07;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register3_z07);
        Nam_3Z07= (EditText) findViewById(R.id.Nam3Z07);
        NwPass_3Z07= (EditText) findViewById(R.id.NwPass3Z07);
        CrAnt_3Z07= (Button) findViewById(R.id.CrAcnt3Z07);
        CrAnt_3Z07.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    if (Nam_3Z07.getText().toString().equals("aziz") && NwPass_3Z07.getText().toString().equals("aziz07"))
                    {
                        Toast.makeText(getApplicationContext(),"Account Created",Toast.LENGTH_LONG).show();
                        Intent itn3Z07=new Intent(Register3Z07.this, MainActivity.class);
                        startActivity(itn3Z07);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Create Account Please",Toast.LENGTH_LONG).show();
                    }
                }});
        }
    }