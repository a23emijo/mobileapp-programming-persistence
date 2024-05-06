package com.example.persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase database;
    private DBHandler databaseHelper;
    private Button writeButton;
    private Button readButton;
    private EditText addName;
    private EditText addColor;
    private EditText addNumberOfLegs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new DBHandler(this);
        database = databaseHelper.getWritableDatabase();

        writeButton = findViewById(R.id.leftButton);
        readButton = findViewById(R.id.rightButton);

        addName = findViewById(R.id.leftEditText);
        addColor = findViewById(R.id.middleEditText);
        addNumberOfLegs = findViewById(R.id.rightEditText);

        writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContentValues values = new ContentValues();
                values.put(DatabaseTables.Animal.COLUMN_NAME_NAME, addName.getText().toString());
                values.put(DatabaseTables.Animal.COLUMN_NAME_COLOR, addColor.getText().toString());
                values.put(DatabaseTables.Animal.COLUMN_NAMN_NUMBER_OF_LEGS, addNumberOfLegs.getText().toString());
                database.insert(DatabaseTables.Animal.TABLE_NAME, null, values);
            }
        });
    }
}
