import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import java.util.ArrayList;
import java.util.List;
import com.datastax.driver.core.LocalDate;


public class TweetRepository {

    private static final String TABLE_NAME = "tweets";

    private static final String TABLE_NAME_BY_USER = TABLE_NAME + "ByUsername";

    private Session session;

    public TweetRepository(Session session)
    {
        this.session = session;
    }

    public void createTable()
    {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ")
                .append(TABLE_NAME).append("(")
                .append("tweetId int PRIMARY KEY,")
                .append("tweetDate date,")
                .append("tweetUsername text,")
                .append("tweetText text);");

        final String query = sb.toString();
        session.execute(query);
    }

    public void createTableTweetsByUsername()
    {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ")
                .append(TABLE_NAME_BY_USER)
                .append("(").append("tweetId int, ").append("tweetDate date, ").append("tweetUsername text, ").append("tweetText text,").append("PRIMARY KEY (tweetId, tweetUsername));");

        final String query = sb.toString();
        session.execute(query);
    }

    public void insertTweet(Tweet tw)
    {
        System.out.println("insertTweet - init");
        StringBuilder sb = new StringBuilder("INSERT INTO ")
                .append(TABLE_NAME).append("(tweetId, tweetDate, tweetUsername, tweetText) ")
                .append("VALUES (").append(tw.getId()).append(", '")
                .append(tw.getTweetDate()).append("', '")
                .append(tw.getUsername()).append("', '")
                .append(tw.getTweetText()).append("');");

        final String query = sb.toString();
        System.out.println("insertTweet - command: " + sb);
        session.execute(query);
        System.out.println("insertTweet - end");
    }

    public void insertTweetByUsername(Tweet tw)
    {
        System.out.println("insertTweetByUsername - init");
        StringBuilder sb = new StringBuilder("INSERT INTO ")
                .append(TABLE_NAME_BY_USER).append("(tweetId, tweetDate, tweetUsername, tweetText) ")
                .append("VALUES (").append(tw.getId()).append(", '")
                .append(tw.getTweetDate()).append("', '")
                .append(tw.getUsername()).append("', '")
                .append(tw.getTweetText()).append("');");

        final String query = sb.toString();
        System.out.println("insertTweetByUsername - command: " + sb);
        session.execute(query);
        System.out.println("insertTweetByUsername - end");
    }

    public Tweet selectByUsername(String user)
    {
        StringBuilder sb = new StringBuilder("SELECT * FROM ")
                .append(TABLE_NAME_BY_USER)
                .append(" WHERE tweetUsername = '").append(user).append("';");

        final String query = sb.toString();

        ResultSet rs = session.execute(query);

        List<Tweet> tweets = new ArrayList<Tweet>();

        for (Row r : rs)
        {
            Tweet s = new Tweet(r.getLong("tweetId"), r.getDate("tweetDate"), r.getString("tweetUsername"), r.getString("tweetText"));

            tweets.add(s);
        }

        Tweet twtRef = tweets.get(0);

        System.out.println("TweetSelectByUsername = " + twtRef.getId() + ", "
                + twtRef.getTweetDate() + ", "
                + twtRef.getUsername() + ", "
                + twtRef.getTweetText());
        return twtRef;
    }

    public List<Tweet> selectAll() {
        StringBuilder sb = new StringBuilder("SELECT * FROM ").append(TABLE_NAME);

        final String query = sb.toString();
        ResultSet rs = session.execute(query);

        List<Tweet> tweets = new ArrayList<Tweet>();

        for (Row r : rs) {
            Tweet twt = new Tweet((long)r.getInt("tweetId"), r.getDate("tweetDate"), r.getString("tweetUsername"), r.getString("tweetText"));
            System.out.println("Tweet = " + (long)r.getInt("tweetId") + ", "
                    + r.getDate("tweetDate") + ", "
                    + r.getString("tweetUsername") + ", "
                    + r.getString("tweetText"));

            tweets.add(twt);
        }

        return tweets;
    }

    public List<Tweet> selectAllByUsername() {
        StringBuilder sb = new StringBuilder("SELECT * FROM ").append(TABLE_NAME_BY_USER);

        final String query = sb.toString();
        ResultSet rs = session.execute(query);

        List<Tweet> tweets = new ArrayList<Tweet>();

        for (Row r : rs) {
            Tweet twt = new Tweet((long)r.getInt("tweetId"), r.getDate("tweetDate"), r.getString("tweetUsername"), r.getString("tweetText"));
            System.out.println("TweetByUsername = " + (long)r.getInt("tweetId") + ", "
                    + r.getDate("tweetDate") + ", "
                    + r.getString("tweetUsername") + ", "
                    + r.getString("tweetText"));

            tweets.add(twt);
        }

        return tweets;
    }

    public void deleteTweetById(long id)
    {
        StringBuilder sb = new StringBuilder("DELETE FROM ")
                .append(TABLE_NAME)
                .append(" WHERE tweetId = ")
                .append(String.valueOf(id)).append(";");

        final String query = sb.toString();
        session.execute(query);
    }

    public void deleteTweetByUser(String user)
    {
        StringBuilder sb = new StringBuilder("DELETE FROM ")
                .append(TABLE_NAME_BY_USER)
                .append(" WHERE tweetUsername = '")
                .append(user).append("';");

        final String query = sb.toString();
        session.execute(query);
    }

    public void deleteTable(String tableName)
    {
        StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ").append(tableName);

        final String query = sb.toString();
        session.execute(query);
    }
}
