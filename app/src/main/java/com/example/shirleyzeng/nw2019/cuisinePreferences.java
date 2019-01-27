package com.example.shirleyzeng.nw2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class cuisinePreferences extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine_preferences);
    }

    public boolean vegetarianSelected(View view) {
        CheckBox veg = findViewById(R.id.checkBox_Vegetarian);
        return veg.isChecked();
    }

    public void goToHome(View view) {
        Intent i = new Intent(cuisinePreferences.this, groupSideBarMenu.class);
        startActivity(i);
    }
}
