package es.ua.eps.android_appreplicante;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Menu extends Fragment implements View.OnClickListener  {


    private TextView informacion, confirmacion;
    private EditText edita;
    private View rootie;
    private Button choice, call;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // ACÁ ES DONDE SE DEFINEN LOS ELEMENTOS DLE FRAGMAN
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootie = inflater.inflate(R.layout.menu_fragment, container, false);
        choice = (Button)  rootie.findViewById(R.id.prueba);
        call = (Button)  rootie.findViewById(R.id.llamar);
        informacion = (TextView) rootie.findViewById(R.id.textoLetra);
        confirmacion = (TextView) rootie.findViewById(R.id.confirma);
        edita = (EditText) rootie.findViewById(R.id.textoaparecer);
        call.setOnClickListener(this);
        choice.setOnClickListener(this);

        return rootie;
    }

    // INSERCIÓN DEL BOTTON CHOICE CON SWITCHS

    @Override
    public void onClick(View elige) {
        switch (elige.getId()) {
            case R.id.prueba:
                String aux = "Reserva Confirmada";
                informacion.setText(edita.getText().toString());
                confirmacion.setText(aux);
                break;
            case R.id.llamar:
                Uri llama = Uri.parse("tel : + 334785");
                Intent llamada = new Intent(Intent.ACTION_CALL);
                startActivity(llamada);
                break;
        }

    }
}


