package com.example.dm2.controlesbasicos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void acti1(View view) {
        Intent iractiv1= new Intent(this,Actividad1.class);
        startActivity(iractiv1);
    }
    public void acti2(View view) {
        Intent iractiv2= new Intent(this,actividad2.class);
        startActivity(iractiv2);
    }
    public void acti3(View view) {
        Intent iractiv3= new Intent(this,Actividad3.class);
        startActivity(iractiv3);
    }
    public void acti4(View view) {
        Intent iractiv4= new Intent(this,actividad4.class);
        startActivity(iractiv4);
    }
}
