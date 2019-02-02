package com.example.valik.mynotes

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.activity_recipes.*
import kotlinx.android.synthetic.main.app_bar_main.*

class Recipes : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipes)
        setSupportActionBar(toolbar1)
        var newresipe = Intent(this,NewRecipes::class.java)
        fab1.setOnClickListener {
            startActivity(newresipe)
        }

        val toggle1 = ActionBarDrawerToggle(
                this, asd, toolbar1, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        asd.addDrawerListener(toggle1)
        toggle1.syncState()

        nav_view.setNavigationItemSelectedListener(this)



    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.


        var intent = Intent(this,ThreeToporsActivity::class.java)
        var in_tent = Intent(this,SettingsActivity::class.java)
        var resipe = Intent(this,Recipes::class.java)

        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {
                setContentView(R.layout.activity_three_topors)
            }
            R.id.nav_slideshow -> {
            }
            R.id.nav_manage -> {

            }
            R.id.nav_recipe -> {
                startActivity(resipe)
            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
            R.id.nav_settings -> {
                startActivity(in_tent)
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

}
