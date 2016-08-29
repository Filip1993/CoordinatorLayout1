package com.kesteli.filip.coordinatorlayout1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSnackbarAndFab;
    private Button btnCollapsToolbarLayout;
    private Button btnRecyclerViewAndCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupListeners();
    }

    private void initWidgets() {
        btnSnackbarAndFab = (Button) findViewById(R.id.btnSnackbarAndFab);
        btnCollapsToolbarLayout = (Button) findViewById(R.id.btnCollapsToolbarLayout);
        btnRecyclerViewAndCardView = (Button) findViewById(R.id.btnRecyclerViewAndCardView);
    }

    private void setupListeners() {
        btnSnackbarAndFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SnackbarAndFabActivity.class);
                startActivity(intent);
            }
        });
        btnCollapsToolbarLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CollapsToolbarLayoutActivity.class);
                startActivity(intent);
            }
        });
        btnRecyclerViewAndCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewAndCardViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
