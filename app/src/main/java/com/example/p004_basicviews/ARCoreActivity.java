package com.example.p004_basicviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class ARCoreActivity extends AppCompatActivity {

    private TextView nameModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcore);

        nameModel = (TextView)findViewById(R.id.nameModel);
        String name = getIntent().getExtras().get("name").toString();
        nameModel.setText(name);
            }

}