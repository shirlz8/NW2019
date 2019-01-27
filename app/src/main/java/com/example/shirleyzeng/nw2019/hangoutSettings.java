package com.example.shirleyzeng.nw2019;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class hangoutSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String.format(getResources().getString(R.string.title_activity_group_side_bar_menu), "default group");
        setContentView(R.layout.activity_hangout_settings);
    }

    public void addUsers(View view) {
        Intent i = new Intent(hangoutSettings.this, addUsersToGroup.class);
        startActivity(i);
    }

    public void setGroupName(View view) {
        EditText editText = (EditText) findViewById(R.id.newGroupName);
        String message = editText.getText().toString();
        Resources res = getResources();
        String text = String.format(res.getString(R.string.title_activity_group_side_bar_menu), message);
        Toast.makeText(hangoutSettings.this, "Group name has been set", Toast.LENGTH_LONG).show();


    }

}
