package com.demo.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CheckBox java, kotlin, flutter;
    private ArrayList<String> language = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        java = findViewById(R.id.java);
        kotlin = findViewById(R.id.kotlin);
        flutter = findViewById(R.id.flutter);

    }

    public void selectLanguage(View view) {

        switch (view.getId()) {

            case R.id.java:

                if (java.isChecked()) {
                    language.add(java.getText().toString());
                    updateLanguage();
                } else {
                    int index = language.indexOf(((CheckBox) view).getText().toString());
                    language.remove(index);
                    updateLanguage();
                }

                break;

            case R.id.kotlin:

                if (kotlin.isChecked()) {
                    language.add(kotlin.getText().toString());
                    updateLanguage();
                } else {
                    int index = language.indexOf(((CheckBox) view).getText().toString());
                    language.remove(index);
                    updateLanguage();
                }

                break;

            case R.id.flutter:

                if (flutter.isChecked()) {
                    language.add(flutter.getText().toString());
                    updateLanguage();
                } else {
                    int index = language.indexOf(((CheckBox) view).getText().toString());
                    language.remove(index);
                    updateLanguage();
                }

                break;

        }

    }

    public void updateLanguage() {

        Toast.makeText(this, language + "", Toast.LENGTH_LONG).show();

    }

}
