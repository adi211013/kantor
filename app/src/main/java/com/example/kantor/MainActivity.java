package com.example.kantor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText et;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void oblicz(View view) {

        try {
            spinner=(Spinner) findViewById(R.id.spinner);
            String waluta=spinner.getSelectedItem().toString();
            et=(EditText) findViewById(R.id.kwota);
            tv=(TextView) findViewById(R.id.wynik);
            Double kwota=Double.parseDouble(String.valueOf(et.getText()));
            double obliczone;
            switch (waluta)
            {
                case "Dolary":
                    obliczone=kwota/4.3489;
                    tv.setText("Wyjdzie ci: "+String.format("%.2f", obliczone)+" dolarow");
                    break;
                case "Euro":
                    obliczone=kwota/4.6377;
                    tv.setText("Wyjdzie ci: "+String.format("%.2f", obliczone)+" euro");
                    break;
                case "Funty":
                    obliczone=kwota/5.3845;
                    tv.setText("Wyjdzie ci: "+String.format("%.2f", obliczone)+" funtów");
                    break;
                case "Jen":
                    obliczone=kwota/2.9457;
                    tv.setText("Wyjdzie ci: "+String.format("%.2f", obliczone)+" jenów");
                    break;
                default:
                    break;
            }
        }
        catch (Exception ex)
        {
            tv=(TextView) findViewById(R.id.wynik);
            tv.setText("cos zle wpisales");
        }



    }
}
