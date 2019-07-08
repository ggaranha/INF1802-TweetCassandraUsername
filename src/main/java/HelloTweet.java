import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;

import com.datastax.driver.core.LocalDate;

public class HelloTweet {

    public static void main(String[] args) {
        System.out.println("Hello, Cassandra!");
        Cluster cluster = null;
        try {
            cluster = Cluster.builder()
                    .addContactPoint("localhost")
                    .build();

            Session session = cluster.connect();

            ResultSet rs = session.execute("select release_version from system.local");
            Row row = rs.one();
            System.out.println(row.getString("release_version"));

            KeyspaceRepository sr = new KeyspaceRepository(session);
            sr.createKeyspace("tweetLibrary", "SimpleStrategy", 1);
            System.out.println("Create repository");

            sr.useKeyspace("tweetLibrary");
            System.out.println("Using repository tweetLibrary");

            TweetRepository tr = new TweetRepository(session);
            tr.createTable();
            System.out.println("Create table tweets");

            tr.createTableTweetsByUsername();
            System.out.println("Create table tweets by username");

            LocalDate ld1 = LocalDate.fromYearMonthDay(2019, 2, 4);
            Tweet tweet1 = new Tweet(1, ld1, "UserT", "Get REKT!", -22.984408, -43.219379, "From IPhone", false, false);
            System.out.println(tweet1.getTweetDate().toString());
            tr.insertTweet(tweet1);
            System.out.println(tweet1.getTweetDate().toString());
            tr.insertTweetByUsername(tweet1);
            LocalDate ld2 = LocalDate.fromYearMonthDay(2019, 2, 5);
            Tweet tweet2 = new Tweet(2, ld2, "UserT1", "Get lost!", -22.983267, -43.223360, "From IPhone", false, true);
            tr.insertTweet(tweet2);
            tr.insertTweetByUsername(tweet2);
            LocalDate ld3 = LocalDate.fromYearMonthDay(2019, 2, 7);
            Tweet tweet3 = new Tweet(3, ld3, "UserT7", "Hello.", -22.926466, -43.209413, "From IPhone", false, false);
            tr.insertTweet(tweet3);
            tr.insertTweetByUsername(tweet3);
            LocalDate ld4 = LocalDate.fromYearMonthDay(2019, 2, 12);
            Tweet tweet4 = new Tweet(4, ld4, "UserJ", "Goodbye.", -21.243262, -42.973869, "From IPhone", false, false);
            tr.insertTweet(tweet4);
            tr.insertTweetByUsername(tweet4);
            LocalDate ld5 = LocalDate.fromYearMonthDay(2019, 2, 17);
            Tweet tweet5 = new Tweet(5, ld5, "UserT7", "Yep.", -21.386346, -59.366491, "From IPhone", false, false);
            tr.insertTweet(tweet5);
            tr.insertTweetByUsername(tweet5);
            System.out.println("Insert tweets");

            System.out.println("Select tweets");
            tr.selectAll();
            System.out.println("Select tweets by username");
            tr.selectAllByUsername();
            System.out.println("Select tweet by username UserT7");
            Tweet twtRef = tr.selectByUsername("UserT7");

            System.out.println("Delete tweet by id 5 from tweets");
            tr.deleteTweetById(5);
            System.out.println("Delete tweet by username UserT7 from tweets by username");
            tr.deleteTweetByUsername("UserT7");

            System.out.println("Select tweets");
            tr.selectAll();
            System.out.println("Select tweets by username");
            tr.selectAllByUsername();


            tr.deleteTable("tweets");
            System.out.println("Delete tweets");
            tr.deleteTable("tweetsByUsername");
            System.out.println("Delete tweetsByUsername");




           // sr.deleteKeyspace("tweetLibrary");
           // System.out.println("Delete keyspace tweetLibrary");


        } finally {
            if (cluster != null)
                cluster.close();
        }
    }
}