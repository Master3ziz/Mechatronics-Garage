package com.example.mechatronicsgarage;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DB3Z07 extends SQLiteOpenHelper {
    public static final String DBName3Z07="CarMain.db";
    public static final String TName3Z07="Car_Maintenance";
    public static final String COL1_3Z07="CN_3Z07";
    public static final String COL2_3Z07="CAg_3Z07";
    public static final String COL3_3Z07="CRM_3Z07";
    public static final String COL4_3Z07="EP_3Z07";

    public DB3Z07(Context context)
    {
        super(context,DBName3Z07,null,1);
    }
    public void onCreate(SQLiteDatabase Sql3zdb)
    {
        Sql3zdb.execSQL("create table " +TName3Z07+ "(ID INTEGER PRIMARY KEY AUTOINCREMENT, CustomerName TEXT,CarModel INTEGER,EnginePower INTEGER)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase Sql3zdb, int oldVersion, int newVersion)
    {
        Sql3zdb.execSQL("DROP TABLE IF EXISTS " + TName3Z07);
        onCreate(Sql3zdb);
    }
    public boolean insertData(String CN_3Z07, String CAg_3Z07, String CRM_3Z07, String EP_3Z07)
    {
        SQLiteDatabase Sql3zdb=this.getReadableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL1_3Z07,CN_3Z07);
        contentValues.put(COL2_3Z07,CAg_3Z07);
        contentValues.put(COL3_3Z07,CRM_3Z07);
        contentValues.put(COL4_3Z07,EP_3Z07);
        long res3Z07=Sql3zdb.insert(TName3Z07,null,contentValues);
        if(res3Z07==-1)
            return false;
        else
            return true;
    }
    public boolean updateData(String CN_3Z07, String CAg_3Z07, String CRM_3Z07, String EP_3Z07)
    {
        SQLiteDatabase Sql3zdb=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL1_3Z07,CN_3Z07);
        contentValues.put(COL2_3Z07,CAg_3Z07);
        contentValues.put(COL3_3Z07,CRM_3Z07);
        contentValues.put(COL4_3Z07,EP_3Z07);
        Sql3zdb.update(TName3Z07,contentValues,"ID=",new String[]{CAg_3Z07});
        return true;
    }
    public Integer deleteData(String CAg_3Z07)
    {
        SQLiteDatabase Sql3zdb=this.getWritableDatabase();
        return Sql3zdb.delete(TName3Z07,"ID=",new String[]{CAg_3Z07});
    }
    public Cursor getAllData()
    {
        SQLiteDatabase Sql3zdb=this.getWritableDatabase();
        Cursor crs3Z07=Sql3zdb.rawQuery("select * from " +TName3Z07,null);
        return crs3Z07;
    }
}
