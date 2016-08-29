package com.kesteli.filip.coordinatorlayout1;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SnackbarAndFabActivity extends AppCompatActivity {

    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar_and_fab);

        initWidgets();
        setupListeners();
    }

    private void initWidgets() {
        floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);
    }

    private void setupListeners() {
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Heloooou", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
