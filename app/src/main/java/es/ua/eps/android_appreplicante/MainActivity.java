package es.ua.eps.android_appreplicante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
/*
* @Author: Isabel Calzadilla
* PAC : ANDROID
* */
public class MainActivity extends AppCompatActivity {

    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.inicia);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inicia_Accion = new Intent(getApplicationContext(), PlatosActivity.class);
                startActivity(inicia_Accion);
            }
        });
    }
}