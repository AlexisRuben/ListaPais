package com.example.reproductor.listapais;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    private ListView lista;
    List<String> items;
    ArrayAdapter ADP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtNombre = findViewById(R.id.txtNombre);
        final Button btbAgregar = findViewById(R.id.btnAgregar);
        lista = findViewById(R.id.lista);
        items = new ArrayList<>();
        ADP = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,items);
        lista.setAdapter(ADP);
        lista.setBackgroundColor(Color.BLACK);
        btbAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items.add(txtNombre.getText().toString());
                ADP.notifyDataSetChanged();
            }
        });
    }
}
