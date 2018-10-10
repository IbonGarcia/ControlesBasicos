package com.example.dm2.controlesbasicos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class actividad2 extends AppCompatActivity {

    private EditText ed1;
    private EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
    }
    public void validar (View view){

        int dni=Integer.parseInt(ed1.getText().toString());
        char letra=ed2.getText().charAt(0);
        char letraC=' ';
        int resto=dni%23;

        switch (resto){
            case 0:
                letraC='T';
                break;
            case 1:
                letraC='R';
                break;
            case 2:
                letraC='W';
                break;
            case 3:
                letraC='A';
                break;
            case 4:
                letraC='G';
                break;
            case 5:
                letraC='M';
                break;
            case 6:
                letraC='Y';
                break;
            case 7:
                letraC='F';
                break;
            case 8:
                letraC='P';
                break;
            case 9:
                letraC='D';
                break;
            case 10:
                letraC='X';
                break;
            case 11:
                letraC='B';
                break;
            case 12:
                letraC='N';
                break;
            case 13:
                letraC='J';
                break;
            case 14:
                letraC='Z';
                break;
            case 15:
                letraC='S';
                break;
            case 17:
                letraC='Q';
                break;
            case 18:
                letraC='H';
                break;
            case 19:
                letraC='L';
                break;
            case 20:
                letraC='C';
                break;
            case 21:
                letraC='K';
                break;
            case 22:
                letraC='E';
                break;
        }
        if (letra==letraC){
            Toast.makeText(getApplicationContext(),"DNI VALIDO",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"DNI INCORRECTO",Toast.LENGTH_LONG).show();
        }
    }
}
