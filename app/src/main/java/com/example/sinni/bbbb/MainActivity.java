package com.example.sinni.bbbb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.TextView;

import java.sql.Struct;

public class MainActivity extends AppCompatActivity {
    RadioButton English,Malaysia,Thai,Indonesia,Vietnam,Philippines;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         setTitle("Learn1234");

         findView();
         English.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                 intent.putExtra("position", 0);
                 startActivity(intent);
             }
         });
         Malaysia.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                 intent.putExtra("position", 1);
                 startActivity(intent);
             }
         });
         Thai.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                 intent.putExtra("position", 2);
                 startActivity(intent);
             }
         });
         Indonesia.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                 intent.putExtra("position", 3);
                 startActivity(intent);
             }
         });
         Vietnam.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                 intent.putExtra("position", 4);
                 startActivity(intent);
             }
         });
         Philippines.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                 intent.putExtra("position", 5);
                 startActivity(intent);
             }
         });

     }
    public void findView() {
        English = (RadioButton) findViewById(R.id.English);
        Malaysia = (RadioButton) findViewById(R.id.Malaysia);
        Thai = (RadioButton) findViewById(R.id.Thai);
        Indonesia = (RadioButton) findViewById(R.id.Indonesia);
        Vietnam = (RadioButton) findViewById(R.id.Vietnam);
        Philippines = (RadioButton) findViewById(R.id.Philippines);

    }
}
