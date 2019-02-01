package com.example.valik.mynotes

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_recipes.*

class Recipes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipes)
        setSupportActionBar(toolbar)
        var newresipe = Intent(this,NewRecipes::class.java)
        fab.setOnClickListener {
            startActivity(newresipe)
        }
    }

}
