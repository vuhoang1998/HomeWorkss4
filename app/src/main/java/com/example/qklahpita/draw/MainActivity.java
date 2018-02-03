package com.example.qklahpita.draw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private FloatingActionButton fbAdd;
    int images[] = {R.drawable.food_1, R.drawable.food_2, R.drawable.food_3, R.drawable.food_4, R.drawable.food_5};
    int currentimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUI();
    }

    private void setupUI() {
        fbAdd = findViewById(R.id.fb_add);

        fbAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        LinearLayout layout = (LinearLayout) findViewById(R.id.ll_test);

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.food_1);
        image.setLayoutParams(new android.view.ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        image.setMaxHeight(20);
        image.setMaxWidth(20);


        // Adds the view to the layout
        layout.addView(image);


    }
}
