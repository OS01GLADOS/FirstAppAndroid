package com.belstu.Teya;

import androidx.appcompat.app.AppCompatActivity;//что это

import android.os.Bundle;//передача данных между Activity
import android.util.Log;//разбивать сообщения по категориям в зависимости от важности
import android.widget.TextView;//представление текста на экране

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main/*ссылка на файл с ресурсами разметки*/);

        //todo подключить git
        for (int count = 0; count < 16; count++) {
            Log.d("MainActivity","count = "+count);
        }
        setText();
    }

    private void setText() {
        com.belstu.Teya.Test.toOutText textOut = new com.belstu.Teya.Test.toOutText();
        TextView newText = findViewById(R.id.testNew);
        newText.setText(textOut.getValue());
    }
}