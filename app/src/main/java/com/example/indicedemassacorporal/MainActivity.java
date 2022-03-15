package com.example.indicedemassacorporal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtmassa = findViewById(R.id.edtMassa);
        EditText edtaltura = findViewById(R.id.edtAltura);
        Button btnvalidar = findViewById(R.id.btnValidarDados);
        TextView txtresultado = findViewById(R.id.txtResultado);


        btnvalidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double massa = Double.parseDouble( edtmassa.getText().toString());
                double altura = Double.parseDouble( edtaltura.getText().toString());
                double IMC = massa / (altura * altura);

                if(IMC < 16){
                    txtresultado.setText("Magreza grave");
                }

                if (IMC >=16 && IMC <17){
                    txtresultado.setText("Magreza moderada");
                }

                if (IMC >=17 && IMC <18.5){
                    txtresultado.setText("Magreza leve");
                }

                if (IMC >=18.5 && IMC <25){
                    txtresultado.setText("Saudável");
                }

                if (IMC >=25 && IMC <30){
                    txtresultado.setText("Sobrepeso");
                }

                if (IMC >=30 && IMC <35){
                    txtresultado.setText("Obesidade Grau I");
                }

                if (IMC >=35 && IMC <40){
                    txtresultado.setText("Obesidade Grau II");
                }

                if (IMC >=40){
                    txtresultado.setText("Obesidade Grau IIII (mórbida)");
                }


            }
        });



    }
}