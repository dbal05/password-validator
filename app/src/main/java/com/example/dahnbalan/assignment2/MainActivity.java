package com.example.dahnbalan.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Main Activity for password validator
 * @author dahnbalan
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Validates password on the UI and shows the strength of the password once validated
     * @param view
     */
    public void validatePassword (View view) {

    }
}
