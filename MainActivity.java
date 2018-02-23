package com.example.yash.to_do;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText et;
    String data = "";
    MyDBHandler database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textView);
        et= (EditText)findViewById(R.id.editText);
        database = new MyDBHandler(this, null, null, 1);
        printDatabase();
    }


    public void add(View view) {
        Task newtask = new Task(et.getText().toString());
        database.addProduct(newtask);
        printDatabase();

    }
    public void printDatabase(){
        String dbString = database.databaseToString();
        tv.setText(dbString);
        et.setText("");
    }
}
