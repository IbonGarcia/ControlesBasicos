package com.example.dm2.controlesbasicos;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Actividad3 extends AppCompatActivity implements View.OnClickListener{

    private ImageView imgv;
    private Button botonbing;
    private Button botongoogle;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
        imgv=(ImageView)findViewById(R.id.imagen1);
        botonbing=(Button)findViewById(R.id.botonB);
        botongoogle=(Button)findViewById(R.id.botonG);

        botongoogle.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            public void onClick(View v) {
                imgv.setImageDrawable(getDrawable(R.mipmap.ic_google));
                imgv.setVisibility(View.VISIBLE);
            }
        });
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void aparecer(View view){

            imgv.setImageDrawable(getDrawable(R.mipmap.ic_yahoo));
            imgv.setVisibility(View.VISIBLE);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onClick(View v) {
        imgv.setImageDrawable(getDrawable(R.mipmap.ic_bing));
        imgv.setVisibility(View.VISIBLE);
    }
}