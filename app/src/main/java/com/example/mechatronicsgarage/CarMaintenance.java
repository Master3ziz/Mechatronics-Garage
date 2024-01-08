package com.example.mechatronicsgarage;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class CarMaintenance extends AppCompatActivity {
    DB3Z07 DBhp07;
    EditText CN_3Z07, CAg_3Z07, CRM_3Z07, EP_3Z07;
    Button Add_3Z07, Update_3Z07, View_3Z07, Delete_3Z07, Clear_3Z07,Calculate_3Z07;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_maintenance);
        DBhp07 = new DB3Z07(this);
        //get Edittext IDs
        CN_3Z07 = (EditText) findViewById(R.id.CN3Z07);
        CAg_3Z07 = (EditText) findViewById(R.id.CAg3Z07);
        CRM_3Z07 = (EditText) findViewById(R.id.CRM3Z07);
        EP_3Z07 = (EditText) findViewById(R.id.EP3Z07);
        //get button ids
        Add_3Z07 = (Button) findViewById(R.id.Add3Z07);
        Update_3Z07 = (Button) findViewById(R.id.Update3Z07);
        View_3Z07 = (Button) findViewById(R.id.View3Z07);
        Delete_3Z07 = (Button) findViewById(R.id.Delete3Z07);
        Calculate_3Z07 = (Button) findViewById(R.id.Calculate3Z07);
        Clear_3Z07 = (Button) findViewById(R.id.Clear3Z07);
        Calculate_3Z07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {Intent itn3Z07=new Intent(CarMaintenance.this, Calculate3Z07.class);
                    startActivity(itn3Z07);}
            }});
        //defined methods
        addData3Z07();
        updateData3Z07();
        deleteData3Z07();
        viewData3Z07();
        clearData3Z07();
    }
    //adding data
    public void addData3Z07()
    {
        Add_3Z07.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                boolean insert3Z07=DBhp07.insertData(CN_3Z07.getText().toString(),CAg_3Z07.getText().toString(), CRM_3Z07.getText().toString(),EP_3Z07.getText().toString());
                if(insert3Z07==true)
                    Toast.makeText(CarMaintenance.this, "Data Inserted",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(CarMaintenance.this,"no inserted Data ",Toast.LENGTH_LONG).show();
            }
        });
    }
    //update
    public void updateData3Z07()
    {
        Update_3Z07.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                boolean update3Z07=DBhp07.updateData(CN_3Z07.getText().toString(),CAg_3Z07.getText().toString(), CRM_3Z07.getText().toString(),EP_3Z07.getText().toString());
                if(update3Z07==true)
                    Toast.makeText(CarMaintenance.this,"Data updated",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(CarMaintenance.this, "no updated Data ",Toast.LENGTH_LONG).show();
            }
        });
    }
    //deleting data
    public void deleteData3Z07()
    {
        View_3Z07.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Integer del3Z07=DBhp07.deleteData(CAg_3Z07.getText().toString());
                if(del3Z07>0)
                    Toast.makeText(CarMaintenance.this,"Data deleted",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(CarMaintenance.this,"no deleted Data ",Toast.LENGTH_LONG).show();
            }
        });
    }
    //viewing data
    public void viewData3Z07()
    {
        Delete_3Z07.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Cursor r3z07=DBhp07.getAllData();
                if(r3z07.getCount()==0)
                {
                    showMessage("Error found", "There's Nothing found");
                    return;
                }
                StringBuffer view3Z0=new StringBuffer();
                while(r3z07.moveToNext())
                {

                    view3Z0.append("CustomerName3Z07:"+r3z07.getString(1)+"\n");
                    view3Z0.append("CustomerPhoneNumber3Z07:"+r3z07.getString(2)+"\n");
                    view3Z0.append("CarModel3Z07:"+r3z07.getString(0)+"\n");
                    view3Z0.append("CarEnginePower3Z07:"+r3z07.getString(3)+"\n");
                }
                showMessage("Customer Details",view3Z0.toString());
            }
        });
    }
    //clearing screen
    public void clearData3Z07()
    {
        Clear_3Z07.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CN_3Z07.setText("");
                CAg_3Z07.setText("");
                CRM_3Z07.setText("");
                EP_3Z07.setText("");
            }
        });
    }
    //Display message
    public void showMessage(String title3Z07,String msg3Z07)
    {
        AlertDialog.Builder ad3Z07=new AlertDialog.Builder(this);
        ad3Z07.setCancelable(true);
        ad3Z07.setTitle(title3Z07);
        ad3Z07.setMessage(msg3Z07);
        ad3Z07.show();
    }
}



