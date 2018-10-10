package com.example.dm2.controlesbasicos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity {

    private EditText ed1;
    private EditText ed2;
    private TextView resul;
    private double num1;
    private double num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        ed1=(EditText)findViewById(R.id.ed1);     //Estas lineas son para cojer los elementos de las vistas
        ed2=(EditText)findViewById(R.id.ed2);
        resul=(TextView) findViewById(R.id.res);
    }

    public void operar(View view) {

       if (view.getTag().equals("boton1")){

           num1=Double.parseDouble(ed1.getText().toString());
           num2=Double.parseDouble(ed2.getText().toString());
           double s=num1+num2;
           resul.setText("Resultado: "+s);
       }
       else{
           if (view.getTag().equals("boton2")){

               num1=Double.parseDouble(ed1.getText().toString());
               num2=Double.parseDouble(ed2.getText().toString());
               double s=num1-num2;
               resul.setText("Resultado: "+s);
           }
           else{
               if (view.getTag().equals("boton3")){

                   num1=Double.parseDouble(ed1.getText().toString());
                   num2=Double.parseDouble(ed2.getText().toString());
                   double s=num1*num2;
                   resul.setText("Resultado: "+s);
               }
               else{
                   if (view.getTag().equals("boton4")){

                       num1=Double.parseDouble(ed1.getText().toString());
                       num2=Double.parseDouble(ed2.getText().toString());
                       double s=num1/num2;
                       resul.setText("Resultado: "+s);
                   }
               }
           }
       }
    }
}
