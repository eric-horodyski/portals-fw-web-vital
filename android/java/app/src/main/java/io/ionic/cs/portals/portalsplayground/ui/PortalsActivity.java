package io.ionic.cs.portals.portalsplayground.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.ionic.cs.portals.portalsplayground.R;

public class PortalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portals);
        setTitle(R.string.title_portals);
    }
}