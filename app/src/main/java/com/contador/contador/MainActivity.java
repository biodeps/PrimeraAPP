package com.contador.contador;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    String nomUsuari;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomUsuari = "";
    }

    public void accepta(View vista) {
        TextView texte = (TextView) findViewById(R.id.txt_Nom);
        nomUsuari = texte.getText().toString();
        printejaNom();

    }

    public void cancela(View vista) {
        TextView texte = (TextView) findViewById(R.id.txt_Nom);
        texte.setText("");
        texte.setHint("Insert your name. This is a Hint");

    }

    public void printejaNom() {
        TextView textAPrintar = (TextView) findViewById(R.id.txt_Resultat);
        textAPrintar.setText("Hola " + nomUsuari + ", qué tal el día?");
    }

}
