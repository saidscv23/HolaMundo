package com.sscv.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        EditText edNombres, edApellidos, edCedula, edDireccion;
        Button btAceptar;

        edNombres = findViewById(R.id.txtnombre);
        edApellidos = findViewById(R.id.txtapellidos);
        edCedula = findViewById(R.id.txtcedula);
        edDireccion = findViewById(R.id.txtdireccion);
        btAceptar = findViewById(R.id.btn_Aceptar);
        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = edNombres.getText().toString();
                String apellidos = edApellidos.getText().toString();
                String cedula = edCedula.getText().toString();
                String direccion = edDireccion.getText().toString();

                if (!nombre.isEmpty() && !apellidos.isEmpty() && !cedula.isEmpty() && !direccion.isEmpty()) {

                    Toast.makeText(Formulario.this, "Información Ingresada Correcta", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Formulario.this, "Por favor, complete todos los campos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}