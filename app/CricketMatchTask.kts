internal class CricketMatchTask : AsyncTask<String, Void, RSSFeed>() {

    override fun doInBackground(vararg urls: String): RSSFeed? {
        try {
            // download
            // prepare RSSFeeds
            return RSSFeeds
        } catch (e: Exception) {
            //handle exception
            return null
        }
    }

    override fun onPostExecute(feed: RSSFeed) {
        // TODO: check this.exception
        // TODO: do something with the feed
    }
}

