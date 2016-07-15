package com.example.augmentedrealitytour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button beginTourButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        beginTourButton = (Button) findViewById(R.id.beginTourButton);

        beginTourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beginTourIntent = new Intent(HomeActivity.this, TourActivity.class);
                startActivity(beginTourIntent);
            }
        });
    }
}
