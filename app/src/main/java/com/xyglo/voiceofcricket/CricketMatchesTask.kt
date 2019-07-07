//package com.xyglo.voiceofcricket
import android.os.AsyncTask
import java.net.URL

/*
open class CricketMatchesTask : AsyncTask<Void, Void, String>() {

    private var name = ""

    override fun doInBackground(vararg p0: Void?): String {

        for (i in 1..100000000) {
            if (i == 100000000) {
                name = "Hello World"
            }
        }
        return name
    }
}
*/
/*
class CricketMatchesTask(val handler: () -> Unit) : AsyncTask<Void, Void, Void>() {
    init {
        execute()
    }

    override fun doInBackground(vararg params: Void?): Void? {
        handler()
        return null
    }
}
*/


public class CricketMatchesTask : AsyncTask<URL, Int, Long>() {
    override fun doInBackground(vararg urls: URL): Long? {

        var thing = ""

        val url = URL("http://www.google.com/")

        val result = URL("url").readText()
        println("result = " + result)
        return result.length as Long?
    }
/*
    protected override fun onProgressUpdate(vararg progress: Int) {
        setProgressPercent(progress[0])
    }

    override fun onPostExecute(result: Long?) {
        showDialog("Downloaded $result bytes")
    }*/
}
