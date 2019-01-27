package com.example.shirleyzeng.nw2019;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class User {
    public String email;
    public String password;
    public ArrayList cuisinePreferences;
    public Boolean  isVegetarian;


    public User(String email, String password){
        this.email = email;
        this.password = password;
        this.cuisinePreferences = new ArrayList<String>();
    }

    public void addCuisine(String cuisine){
        this.cuisinePreferences.add(cuisine);
    }


}
