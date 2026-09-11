package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void zmienNapis1(View view) {
        TextView tekst = findViewById(R.id.napis_1);
        tekst.setText("Wcisnales przycisk 1");
    }
    public void zmienNapis2(View view) {
        TextView tekst = findViewById(R.id.napis_1);
        tekst.setText("Wcisnales przycisk 2");
    }
    public void przywrocNapis(View view) {
        TextView tekst = findViewById(R.id.napis_1);
        tekst.setText("witaj programisto");
    }

    int licznik = 0;
    public void odswiezNapis() {
        TextView tekst = findViewById(R.id.licznik);
        tekst.setText(String.valueOf(licznik));
    }
    public void dodaj(View view) {
        licznik += 1;
        odswiezNapis();
    }
    public void odejmij(View view) {
        licznik -= 1;
        odswiezNapis();
    }
    public void resetuj(View view) {
        licznik = 0;
        odswiezNapis();
    }
}