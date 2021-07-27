package com.rl.moviesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


/**
 * Create a RecyclerView Showing Movies with
 *  Movie Name
 *  Movie Image
 *  Movie Ratings
 *  Movie Crew
 *
 *  Use Retrofit to get the data from Intenet
 *  Use Picasso/Glide to load image
 *  Use MVVM Architecture , LiveData , DataBinding
 *  Use Kotlin Programming to create Recyclerview Adapter (Only)
 *
 *
 * */


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}