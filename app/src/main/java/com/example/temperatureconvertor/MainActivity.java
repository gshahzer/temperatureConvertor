package com.example.temperatureconvertor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText et;
    Button ctof;
    Button ftoc;
    Button newact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et =findViewById(R.id.getedit);
        ctof = (Button) findViewById(R.id.ctof);
        ftoc = (Button) findViewById(R.id.ftoc);
        newact = (Button) findViewById(R.id.newact);

        ctof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Add a temperature",Toast.LENGTH_SHORT).show();
                }

                ctof.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Double a1 = Double.parseDouble(String.valueOf(et.getText()));
                        Double f = a1 * 9 / 5 + 32;
                        String r = String.valueOf(f);

                        Toast.makeText(MainActivity.this, r + " F", Toast.LENGTH_SHORT).show();


                    }
                });

                ftoc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Double a1 = Double.parseDouble(String.valueOf(et.getText()));
                        Double f = a1 - 32 * 5/9;
                        String r = String.valueOf(f);

                        Toast.makeText(MainActivity.this, r + " C", Toast.LENGTH_SHORT).show();

                    }
                });

                newact.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        et.setText("");
                    }
                });
            }
        });

    }
}
