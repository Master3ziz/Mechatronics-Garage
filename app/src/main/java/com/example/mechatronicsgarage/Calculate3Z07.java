package com.example.mechatronicsgarage;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Calculate3Z07 extends AppCompatActivity {
    EditText Model_3Z07,Service_3Z07;
    Button btnCalculate_3Z07,btnClear_307,Return_3Z07;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate3_z07);
        Model_3Z07= (EditText) findViewById(R.id.Model3Z07);
        Service_3Z07= (EditText) findViewById(R.id.Service3Z07);
        Return_3Z07= (Button) findViewById(R.id.Return3Z07);
        Return_3Z07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn3Z07=new Intent(Calculate3Z07.this, CarMaintenance.class);
                startActivity(itn3Z07);
            }
        });
        btnClear_307= (Button) findViewById(R.id.btnClear307);
        btnClear_307.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Model_3Z07.setText("");
                Service_3Z07.setText("");
            }
        });
        btnCalculate_3Z07= (Button) findViewById(R.id.btnCalculate3Z07);
        btnCalculate_3Z07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Model3Z7 = Model_3Z07.getText().toString();
                String Service3Z7 = Service_3Z07.getText().toString();
                int Model307=Integer.parseInt(Model3Z7);
                int Service307=Integer.parseInt(Service3Z7);
                int Cost3Z07 = 0;
                if(Model307 >= 2003 && Model307 <= 2012) {
                    if (Service307 == 1) {
                        Cost3Z07 = 14;}
                    else if (Service307 == 2) {
                        Cost3Z07 = 17;}
                    else if (Service307 == 3) {
                        Cost3Z07 = 19;}}
                if(Model307 >= 2013 && Model307 <= 2017) {
                    if (Service307 == 1) {
                        Cost3Z07 = 21;}
                    else if (Service307 == 2) {
                        Cost3Z07 = 23;}
                    else if (Service307 == 3) {
                        Cost3Z07 = 25;} }
                Double Discount3Z07 = Cost3Z07 * 0.1;
                Toast.makeText(Calculate3Z07.this, "The Monthly Cost = OMR "+ Discount3Z07, Toast.LENGTH_SHORT).show();}
        });

    }


}