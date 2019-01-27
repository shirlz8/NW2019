package com.example.shirleyzeng.nw2019;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class groupSideBarMenu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Menu sideBarMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_side_bar_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onPrepareOptionsMenu(sideBarMenu);
                // Toast.makeText(groupSideBarMenu.this, "Hello World", Toast.LENGTH_LONG).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.group_side_bar_menu, menu);
        sideBarMenu = menu;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent i = new Intent(groupSideBarMenu.this, hangoutSettings.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*public void updateOption1(View view){
        TextView counter = (TextView)findViewById(R.id.pollResults1);
        String S = counter.getText().toString();
        if(S == ""){
            counter.setText("1");
        }else{
            int count = Integer.parseInt(S);
            count ++;
            counter.setText(Integer.toString(count));
        }
    }
    public void updateOption2(View view){
        TextView counter = (TextView)findViewById(R.id.pollResults2);
        String S = counter.getText().toString();
        if(S == ""){
            counter.setText("1");
        }else{
            int count = Integer.parseInt(S);
            count ++;
            counter.setText(Integer.toString(count));
        }
    }
    public void updateOption3(View view){
        TextView counter = (TextView)findViewById(R.id.pollResults3);
        String S = counter.getText().toString();
        if(S == ""){
            counter.setText("1");
        }else{
            int count = Integer.parseInt(S);
            count ++;
            counter.setText(Integer.toString(count));
        }
    }
    public void updateOption4(View view){
        TextView counter = (TextView)findViewById(R.id.pollResults4);
        String S = counter.getText().toString();
        if(S == ""){
            counter.setText("1");
        }else{
            int count = Integer.parseInt(S);
            count ++;
            counter.setText(Integer.toString(count));
        }
    }

    public void updateOption5(View view){
        TextView counter = (TextView)findViewById(R.id.pollResults5);
        String S = counter.getText().toString();
        if(S == ""){
            counter.setText("1");
        }else{
            int count = Integer.parseInt(S);
            count ++;
            counter.setText(Integer.toString(count));
        }
    }
*/
    public void getRestaurant1Info (View view){
        Intent i = new Intent(groupSideBarMenu.this, restaurant1info.class);
        startActivity(i);
    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_Group1) {
            // Handle the camera action
        } else if (id == R.id.nav_Group2) {

        } else if (id == R.id.nav_Group3) {

        } else if (id == R.id.nav_addNewHangout) {
            Intent i = new Intent(groupSideBarMenu.this, addUsersToGroup.class);
            startActivity(i);
        } else if (id == R.id.nav_editPreferences) {
            Intent i = new Intent(groupSideBarMenu.this, cuisinePreferences.class);
            startActivity(i);

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
