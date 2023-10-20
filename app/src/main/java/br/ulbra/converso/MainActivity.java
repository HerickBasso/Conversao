package br.ulbra.converso;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResu;
    EditText edt1, edt2, edtTemp1, edtTemp2;
    Button btnC, btnC2;
    double v1, v2, v3, v4, C, C2;

    int  pontuacaoJogador = 0;
    int pontuacaoApp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResu =  (TextView) findViewById(R.id.txtResu);
        edt1 =     (EditText) findViewById(R.id.edt1);
        edt2 =     (EditText) findViewById(R.id.edt2);
        edtTemp1 = (EditText) findViewById(R.id.edtTemp1);
        edtTemp2 = (EditText) findViewById(R.id.edtTemp2);
        btnC =     (Button) findViewById(R.id.btnC);
        btnC2 =    (Button) findViewById(R.id.btnC2);
    }
    public void converter(View view){
        if (edt1.getText().toString().equals("") ) {
            v2 = Double.parseDouble(edt2.getText().toString());
            v1 = v2 * 3.28084;
            txtResu.setText("Resultado:" + v1);
        }else{

            v1 = Double.parseDouble(edt1.getText().toString());
            v2 = v1 / 3.28084;
            txtResu.setText("Resultado:" + v2);
        }
    }

    //Temperatura

    public void converter2(View view){
        if (edtTemp1.getText().toString().equals("")){
            v4 = Double.parseDouble(edtTemp2.getText().toString());
            v3 = v4 - 32 * 5 / 9;
            AlertDialog.Builder dialogo=new AlertDialog.Builder(MainActivity.this);
            dialogo.setTitle("Resultado");
            dialogo.setMessage("A conversão é "+v3);
            dialogo.setNeutralButton("Ok",null);
            dialogo.show();
        }else{
            v3 = Double.parseDouble(edtTemp1.getText().toString());
            v4 = v3 * 9 / 5 + 32;
            AlertDialog.Builder dialogo=new AlertDialog.Builder(MainActivity.this);
            dialogo.setTitle("Resultado");
            dialogo.setMessage("A conversão é "+v4);
            dialogo.setNeutralButton("Ok",null);
            dialogo.show();
    }
    }
}








