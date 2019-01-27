package com.example.shirleyzeng.nw2019;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class addUsersToGroup extends AppCompatActivity {
    private ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_users_to_group);
        lv = findViewById(R.id.userList);

        // Instanciating an array list (you don't need to do this,
        // you already have yours).
        List<String> listOfAddedUsers = new ArrayList<String>();
        listOfAddedUsers.add("User1");
        listOfAddedUsers.add("User2");

        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                listOfAddedUsers);
        // menu = getMenuInflater();

        lv.setAdapter(arrayAdapter);
    }

    public void goToHome(View view) {
        Intent i = new Intent(addUsersToGroup.this, groupSideBarMenu.class);
        startActivity(i);
    }

}
