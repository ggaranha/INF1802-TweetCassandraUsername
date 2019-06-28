import com.datastax.driver.core.LocalDate;
import java.util.Date;

import twitter4j.*;

public class Tweet implements Status{

    private long id;

    private String username;

    private String tweetText;

    private LocalDate tweetDate;
    //private String tweetDate;

    public Tweet()
    {

    }

    public Tweet(long id, LocalDate td, String un, String tt)
    {
        this.id = id;
        username = un;
        tweetText = tt;
        tweetDate = td;
    }

    public String getTweetText() {
        return tweetText;
    }

    public LocalDate getTweetDate() {
        return tweetDate;
    }

    public String getUsername() {
        return username;
    }

    public void setTweetId(long id) {
        this.id = id;
    }

    public void setTweetText(String tt) {
        tweetText = tt;
    }

    public void setTweetDate(LocalDate td) {
        tweetDate = td;
    }

    public void setUsername(String un) {
        username = un;
    }

    public Date getCreatedAt() {
        return null;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return tweetText;
    }

    public int getDisplayTextRangeStart() {
        return 0;
    }

    public int getDisplayTextRangeEnd() {
        return 0;
    }

    public String getSource() {
        return null;
    }

    public boolean isTruncated() {
        return false;
    }

    public long getInReplyToStatusId() {
        return 0;
    }

    public long getInReplyToUserId() {
        return 0;
    }

    public String getInReplyToScreenName() {
        return null;
    }

    public GeoLocation getGeoLocation() {
        return null;
    }

    public Place getPlace() {
        return null;
    }

    public boolean isFavorited() {
        return false;
    }

    public boolean isRetweeted() {
        return false;
    }

    public int getFavoriteCount() {
        return 0;
    }

    public User getUser() {
        return null;
    }

    public boolean isRetweet() {
        return false;
    }

    public Status getRetweetedStatus() {
        return null;
    }

    public long[] getContributors() {
        return new long[0];
    }

    public int getRetweetCount() {
        return 0;
    }

    public boolean isRetweetedByMe() {
        return false;
    }

    public long getCurrentUserRetweetId() {
        return 0;
    }

    public boolean isPossiblySensitive() {
        return false;
    }

    public String getLang() {
        return null;
    }

    public Scopes getScopes() {
        return null;
    }

    public String[] getWithheldInCountries() {
        return new String[0];
    }

    public long getQuotedStatusId() {
        return 0;
    }

    public Status getQuotedStatus() {
        return null;
    }

    public URLEntity getQuotedStatusPermalink() {
        return null;
    }

    public int compareTo(Status o) {
        return 0;
    }

    public UserMentionEntity[] getUserMentionEntities() {
        return new UserMentionEntity[0];
    }

    public URLEntity[] getURLEntities() {
        return new URLEntity[0];
    }

    public HashtagEntity[] getHashtagEntities() {
        return new HashtagEntity[0];
    }

    public MediaEntity[] getMediaEntities() {
        return new MediaEntity[0];
    }

    public SymbolEntity[] getSymbolEntities() {
        return new SymbolEntity[0];
    }

    public RateLimitStatus getRateLimitStatus() {
        return null;
    }

    public int getAccessLevel() {
        return 0;
    }
}