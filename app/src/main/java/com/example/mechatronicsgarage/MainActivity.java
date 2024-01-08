package com.example.mechatronicsgarage;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText USNam_3Z07,Pass_3Z07;
    Button btnLog_3Z07,btnRegs_3Z07;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        USNam_3Z07= (EditText) findViewById(R.id.USNam3Z07);
        Pass_3Z07= (EditText) findViewById(R.id.Pass3Z07);
        btnLog_3Z07= (Button) findViewById(R.id.btnLog3Z07);
        btnRegs_3Z07= (Button) findViewById(R.id.btnRegs3Z07);

        btnLog_3Z07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (USNam_3Z07.getText().toString().equals("aziz") && Pass_3Z07.getText().toString().equals("aziz07"))
                {
                    Toast.makeText(getApplicationContext(),"Successful",Toast.LENGTH_LONG).show();
                    Intent itn3Z07=new Intent(MainActivity.this, CarMaintenance.class);
                    startActivity(itn3Z07);
                }

                else
                {
                    Toast.makeText(getApplicationContext(),"Please Register",Toast.LENGTH_LONG).show();
                    Intent itn3Z07=new Intent(MainActivity.this, Register3Z07.class);
                    startActivity(itn3Z07);
                }
            }});
    }
}



