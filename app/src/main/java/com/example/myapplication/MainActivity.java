package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // задание полей
    int robotCost = 35000; // стоимость робота
    int savings = 700; // счет пользователя
    int allowance = 1700; // ежемесячная стипендия
    double interestRate = 9.0; // годовая процентная ставка по накоплениям


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.countOut);

        double percentMonth = interestRate / 12; // Месячная процентная ставка по накоплениям
        int monthCount = 0; // Сколько месяцев копили

        while (robotCost > savings) {
            savings *= (1 + percentMonth / 100);
            savings += allowance;
            monthCount++;
        }

        textView.setText(monthCount + " месяцев");
    }
}