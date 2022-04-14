package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtugas, edabsensi, eduts, eduas, edakhir ;
    Button bthitung ;
    Double vtugas, vabsensi, vuts, vuas, vakhir ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtugas = (EditText) findViewById(R.id.edtugas);
        edabsensi = (EditText) findViewById(R.id.edabsensi);
        eduts = (EditText) findViewById(R.id.eduts);
        eduas = (EditText) findViewById(R.id.eduas);
        edakhir = (EditText) findViewById(R.id.edakhir);
        bthitung = (Button) findViewById(R.id.bthitung);
    }

    public void hitung(View view){
        vtugas = Double.parseDouble(edtugas.getText().toString());
        vabsensi = Double.parseDouble(edabsensi.getText().toString());
        vuts = Double.parseDouble(eduts.getText().toString());
        vuas = Double.parseDouble(eduas.getText().toString());


        vakhir = (0.1 * vabsensi) + (0.20 * vtugas) + (0.3 * vuts) + (0.4 * vuas);

        edakhir.setText(""+vakhir);
    }
}