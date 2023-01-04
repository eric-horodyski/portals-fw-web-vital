package io.ionic.cs.portals.portalsplayground.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import io.ionic.cs.portals.portalsplayground.R;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.title_main);

        button = findViewById(R.id.button_main);
        button.setOnClickListener(view -> {
            startActivity(new Intent(this, PortalsActivity.class));
        });
    }
}