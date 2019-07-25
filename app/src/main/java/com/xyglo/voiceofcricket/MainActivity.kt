package com.xyglo.voiceofcricket

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import android.support.v4.widget.DrawerLayout
import android.support.design.widget.NavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import java.net.URL
import java.net.HttpURLConnection
import CricketMatchesTask
import LoadCricketMatches
import android.os.AsyncTask
import android.widget.Toast
import kotlinx.android.synthetic.main. activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    companion object {
        private var thing = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        /*
        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }*/


        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        this.startStopButton.setOnClickListener() {
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }

        navView.setNavigationItemSelectedListener(this)
/*
        async {
            val result = URL("url").readText()
            uiThread {
                mainTextView.setText(result)
            }
        }
        */
        //sendGet()
    }

    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_home -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_tools -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    fun sendGet() {
        val url = URL("http://www.google.com/")

        //CricketMatchTask().execute(url)

        // Attempt 1
        //
        /*
        Thread({
            //Do some Network Request

            runOnUiThread({
                //Update UI

                with(url.openConnection() as HttpURLConnection) {
                    requestMethod = "GET"  // optional default is GET

                    //println("\nSent 'GET' request to URL : $url; Response Code : $responseCode")
                    inputStream.bufferedReader().use {
                        it.lines().forEach { line ->
                            //MainActivity.thing += line
                            //println(line)
                        }
                    }
                }
            })
        }).start()
*/
/*
        // Attempt 2
        loadingProducts = object : CricketMatchesTask() {
            override fun onPostExecute(result: String?) {
                super.onPostExecute(result)

                Log.e("Result", result)
            }
        }

        loadingProducts.execute()
        */

        // Attempt 3
        //
        /*
        CricketMatchesTask {


        }*/

        // Attempt 4
        //
        /*
        LoadCricketMatches(object : BaseAsyncTask.ProgressListener {
            override fun onStarted() {
                //Show Progrss Bar
                //loadingBar.visibility = View.VISIBLE
                println("onStarted")
            }

            override fun onCompleted() {
                // hide progress bar
                //loadingBar.visibility = View.GONE
                // update UI on SUCCESS
                //setUpUI()
                println("onCompleted")
            }

            override fun onError(errorMessage: String?) {
                // hide progress bar
                //loadingBar.visibility = View.GONE
                // Update UI on ERROR
                //Toast.makeText(context, "No Videos Found", Toast.LENGTH_SHORT).show()
                println("onError")
            }

        }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR)
        */

        // Attempt 5
        //
        //CricketMatchesTask().execute()
    }

    /*
    // Attempt 6
    fun downloadData() {
        doAsync {
            //Execute all the lon running tasks here
            val s: String = makeNetworkCall()
            uiThread {
                //Update the UI thread here
                alert("Downloaded data is $s", "Hi I'm an alert") {
                    yesButton { toast("Yay !") }
                    noButton { toast(":( !") }
                }.show()
            }
        }
    }*/

/*
    fun setOnClickListener(){
        Toast.makeText(this@MainActivity, "Its toast!", Toast.LENGTH_SHORT).show();
    }
*/


}
