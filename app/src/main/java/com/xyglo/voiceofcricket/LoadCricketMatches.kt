import com.xyglo.voiceofcricket.MainActivity
import java.net.HttpURLConnection
import java.net.URL
import android.os.AsyncTask


class LoadCricketMatches(listener: ProgressListener) : BaseAsyncTask(listener) {

    override fun doInBackground(vararg params: Void?): String? {

        var thing = ""

        val url = URL("http://www.google.com/")

        val result = URL("url").readText()
        /*
        with(url.openConnection() as HttpURLConnection) {
            requestMethod = "GET"  // optional default is GET

            println("\nSent 'GET' request to URL : $url; Response Code : $responseCode")
            inputStream.bufferedReader().use {
                it.lines().forEach { line ->
                    thing += line
                    println(line)
                }
            }
        }
*/
//        println("Hello")
        return result
    }
}