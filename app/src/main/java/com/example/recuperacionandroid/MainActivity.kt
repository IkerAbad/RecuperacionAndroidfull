package com.example.recuperacionandroid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.recuperacionandroid.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    @Suppress("unused")
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )

        //TOOLBAR
        setSupportActionBar(binding.toolbar)

        //Cambiar texto navbar dependiendo del fragment
        //NavController
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.list_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        //appBarConfiguration
        val appBarConfiguration = AppBarConfiguration(navController.graph)

        //Toolbar a Navigation
        binding.toolbar.setupWithNavController(navController, appBarConfiguration)

    }


    //Menu

    //CrearMenu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    //Funciones del Menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            //Web
            R.id.toWeb -> {
                @Suppress("LocalVariableName")
                val URL = "www.jesuitasrioja.org"
                toWeb(URL)
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    //Indent
    @Suppress("SameParameterValue")
    private fun toWeb(URL:String): Boolean{
        val queryUrl: Uri = Uri.parse("${"https://"}${URL}")
        val intent = Intent(Intent.ACTION_VIEW, queryUrl)
        startActivity(intent)
        return true
    }


}