# INF1802-TweetCassandraUsername

/usr/java/jdk-9/bin/java -javaagent:/opt/idea-IC-182.4129.33/lib/idea_rt.jar=34223:/opt/idea-IC-182.4129.33/bin -Dfile.encoding=UTF-8 -classpath /home/treinamento/Downloads/TweetCassandraProject/target/classes:/home/treinamento/.m2/repository/com/datastax/cassandra/cassandra-driver-core/3.7.1/cassandra-driver-core-3.7.1.jar:/home/treinamento/.m2/repository/io/netty/netty-handler/4.0.56.Final/netty-handler-4.0.56.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-buffer/4.0.56.Final/netty-buffer-4.0.56.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-common/4.0.56.Final/netty-common-4.0.56.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-transport/4.0.56.Final/netty-transport-4.0.56.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-codec/4.0.56.Final/netty-codec-4.0.56.Final.jar:/home/treinamento/.m2/repository/com/google/guava/guava/19.0/guava-19.0.jar:/home/treinamento/.m2/repository/io/dropwizard/metrics/metrics-core/3.2.2/metrics-core-3.2.2.jar:/home/treinamento/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-ffi/2.1.7/jnr-ffi-2.1.7.jar:/home/treinamento/.m2/repository/com/github/jnr/jffi/1.2.16/jffi-1.2.16.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm/5.0.3/asm-5.0.3.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm-commons/5.0.3/asm-commons-5.0.3.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm-analysis/5.0.3/asm-analysis-5.0.3.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm-tree/5.0.3/asm-tree-5.0.3.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm-util/5.0.3/asm-util-5.0.3.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-x86asm/1.0.2/jnr-x86asm-1.0.2.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-posix/3.0.44/jnr-posix-3.0.44.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-constants/0.9.9/jnr-constants-0.9.9.jar:/home/treinamento/.m2/repository/org/apache/kafka/kafka-clients/2.2.0/kafka-clients-2.2.0.jar:/home/treinamento/.m2/repository/com/github/luben/zstd-jni/1.3.8-1/zstd-jni-1.3.8-1.jar:/home/treinamento/.m2/repository/org/lz4/lz4-java/1.5.0/lz4-java-1.5.0.jar:/home/treinamento/.m2/repository/org/xerial/snappy/snappy-java/1.1.7.2/snappy-java-1.1.7.2.jar:/home/treinamento/.m2/repository/org/slf4j/slf4j-log4j12/1.7.25/slf4j-log4j12-1.7.25.jar:/home/treinamento/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar:/home/treinamento/.m2/repository/com/datastax/cassandra/cassandra-driver-core/3.1.0/cassandra-driver-core-3.1.0.jar:/home/treinamento/.m2/repository/io/netty/netty-handler/4.0.37.Final/netty-handler-4.0.37.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-buffer/4.0.37.Final/netty-buffer-4.0.37.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-common/4.0.37.Final/netty-common-4.0.37.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-transport/4.0.37.Final/netty-transport-4.0.37.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-codec/4.0.37.Final/netty-codec-4.0.37.Final.jar:/home/treinamento/.m2/repository/com/google/guava/guava/16.0.1/guava-16.0.1.jar:/home/treinamento/.m2/repository/io/dropwizard/metrics/metrics-core/3.1.2/metrics-core-3.1.2.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-ffi/2.0.7/jnr-ffi-2.0.7.jar:/home/treinamento/.m2/repository/com/github/jnr/jffi/1.2.10/jffi-1.2.10.jar:/home/treinamento/.m2/repository/com/github/jnr/jffi/1.2.10/jffi-1.2.10-native.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-posix/3.0.27/jnr-posix-3.0.27.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-constants/0.9.0/jnr-constants-0.9.0.jar:/home/treinamento/.m2/repository/org/twitter4j/twitter4j-core/4.0.7/twitter4j-core-4.0.7.jar HelloTweet
Hello, Cassandra!
log4j:WARN No appenders could be found for logger (com.datastax.driver.core).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
3.11.4
Create repository
Using repository tweetLibrary
createTable - init
createTable - command: CREATE TABLE IF NOT EXISTS tweets(tweetId int PRIMARY KEY,tweetDate date,tweetUsername text,tweetText text,tweetSource text,isTweetTruncated boolean,isTweetFavorited boolean,tweetGeoLat double,tweetGeoLong double);
createTable - end
Create table tweets
createTableTweetsByUsername - init
createTableTweetsByUsername - command: CREATE TABLE IF NOT EXISTS tweetsByUsername(tweetId int, tweetDate date, tweetUsername text, tweetText text,tweetSource text,isTweetTruncated boolean,isTweetFavorited boolean,tweetGeoLat double,tweetGeoLong double,PRIMARY KEY (tweetUsername, tweetId));
createTableTweetsByUsername - end
Create table tweets by username
2019-02-04
insertTweet - init
insertTweet - command: INSERT INTO tweets(tweetId, tweetDate, tweetUsername, tweetText, tweetSource, isTweetTruncated, isTweetFavorited, tweetGeoLat, tweetGeoLong) VALUES (1, '2019-02-04', 'UserT', 'Get REKT!', 'From IPhone', false, false, -22.984408, -43.219379);
insertTweet - end
2019-02-04
insertTweetByUsername - init
insertTweetByUsername - command: INSERT INTO tweetsByUsername(tweetId, tweetDate, tweetUsername, tweetText, tweetSource, isTweetTruncated, isTweetFavorited, tweetGeoLat, tweetGeoLong) VALUES (1, '2019-02-04', 'UserT', 'Get REKT!', 'From IPhone', false, false, -22.984408, -43.219379);
insertTweetByUsername - end
insertTweet - init
insertTweet - command: INSERT INTO tweets(tweetId, tweetDate, tweetUsername, tweetText, tweetSource, isTweetTruncated, isTweetFavorited, tweetGeoLat, tweetGeoLong) VALUES (2, '2019-02-05', 'UserT1', 'Get lost!', 'From IPhone', false, true, -22.983267, -43.22336);
insertTweet - end
insertTweetByUsername - init
insertTweetByUsername - command: INSERT INTO tweetsByUsername(tweetId, tweetDate, tweetUsername, tweetText, tweetSource, isTweetTruncated, isTweetFavorited, tweetGeoLat, tweetGeoLong) VALUES (2, '2019-02-05', 'UserT1', 'Get lost!', 'From IPhone', false, true, -22.983267, -43.22336);
insertTweetByUsername - end
insertTweet - init
insertTweet - command: INSERT INTO tweets(tweetId, tweetDate, tweetUsername, tweetText, tweetSource, isTweetTruncated, isTweetFavorited, tweetGeoLat, tweetGeoLong) VALUES (3, '2019-02-07', 'UserT7', 'Hello.', 'From IPhone', false, false, -22.926466, -43.209413);
insertTweet - end
insertTweetByUsername - init
insertTweetByUsername - command: INSERT INTO tweetsByUsername(tweetId, tweetDate, tweetUsername, tweetText, tweetSource, isTweetTruncated, isTweetFavorited, tweetGeoLat, tweetGeoLong) VALUES (3, '2019-02-07', 'UserT7', 'Hello.', 'From IPhone', false, false, -22.926466, -43.209413);
insertTweetByUsername - end
insertTweet - init
insertTweet - command: INSERT INTO tweets(tweetId, tweetDate, tweetUsername, tweetText, tweetSource, isTweetTruncated, isTweetFavorited, tweetGeoLat, tweetGeoLong) VALUES (4, '2019-02-12', 'UserJ', 'Goodbye.', 'From IPhone', false, false, -21.243262, -42.973869);
insertTweet - end
insertTweetByUsername - init
insertTweetByUsername - command: INSERT INTO tweetsByUsername(tweetId, tweetDate, tweetUsername, tweetText, tweetSource, isTweetTruncated, isTweetFavorited, tweetGeoLat, tweetGeoLong) VALUES (4, '2019-02-12', 'UserJ', 'Goodbye.', 'From IPhone', false, false, -21.243262, -42.973869);
insertTweetByUsername - end
insertTweet - init
insertTweet - command: INSERT INTO tweets(tweetId, tweetDate, tweetUsername, tweetText, tweetSource, isTweetTruncated, isTweetFavorited, tweetGeoLat, tweetGeoLong) VALUES (5, '2019-02-17', 'UserT7', 'Yep.', 'From IPhone', false, false, -21.386346, -59.366491);
insertTweet - end
insertTweetByUsername - init
insertTweetByUsername - command: INSERT INTO tweetsByUsername(tweetId, tweetDate, tweetUsername, tweetText, tweetSource, isTweetTruncated, isTweetFavorited, tweetGeoLat, tweetGeoLong) VALUES (5, '2019-02-17', 'UserT7', 'Yep.', 'From IPhone', false, false, -21.386346, -59.366491);
insertTweetByUsername - end
Insert tweets
Select tweets
selectAllTweets - init
Tweet = 5, 2019-02-17, UserT7, Yep., From IPhone, false, false, -21.386346, -59.366491
Tweet = 1, 2019-02-04, UserT, Get REKT!, From IPhone, false, false, -22.984408, -43.219379
Tweet = 2, 2019-02-05, UserT1, Get lost!, From IPhone, false, true, -22.983267, -43.22336
Tweet = 4, 2019-02-12, UserJ, Goodbye., From IPhone, false, false, -21.243262, -42.973869
Tweet = 3, 2019-02-07, UserT7, Hello., From IPhone, false, false, -22.926466, -43.209413
selectAllTweets - end
Select tweets by username
selectAllTableByUsername - init
TweetByUsername = 2, 2019-02-05, UserT1, Get lost!, From IPhone, false, true, -22.983267, -43.22336
TweetByUsername = 4, 2019-02-12, UserJ, Goodbye., From IPhone, false, false, -21.243262, -42.973869
TweetByUsername = 3, 2019-02-07, UserT7, Hello., From IPhone, false, false, -22.926466, -43.209413
TweetByUsername = 5, 2019-02-17, UserT7, Yep., From IPhone, false, false, -21.386346, -59.366491
TweetByUsername = 1, 2019-02-04, UserT, Get REKT!, From IPhone, false, false, -22.984408, -43.219379
selectAllTableByUsername - end
Select tweet by username UserT7
selectTweetByUsername - init
selectTweetByUsername - command: SELECT * FROM tweetsByUsername WHERE tweetUsername = 'UserT7' ALLOW FILTERING;
TweetSelectByUsername = 3, 2019-02-07, UserT7, Hello., From IPhone, false, false, -22.926466, -43.209413
selectTweetByUsername - end
Delete tweet by id 5 from tweets
deleteTweetById - init
deleteTweetById - exec command DELETE FROM tweets WHERE tweetId = 5;
deleteTweetById - end
Delete tweet by username UserT7 from tweets by username
selectTweetByUsername - init
selectTweetByUsername - command: SELECT * FROM tweetsByUsername WHERE tweetUsername = 'UserT7' ALLOW FILTERING;
TweetSelectByUsername = 3, 2019-02-07, UserT7, Hello., From IPhone, false, false, -22.926466, -43.209413
selectTweetByUsername - end
deleteTweetByUsername - init
deleteTweetByUsername - exec command DELETE FROM tweetsByUsername WHERE tweetUsername = 'UserT7';
deleteTweetByUsername - end
Select tweets
selectAllTweets - init
Tweet = 1, 2019-02-04, UserT, Get REKT!, From IPhone, false, false, -22.984408, -43.219379
Tweet = 2, 2019-02-05, UserT1, Get lost!, From IPhone, false, true, -22.983267, -43.22336
Tweet = 4, 2019-02-12, UserJ, Goodbye., From IPhone, false, false, -21.243262, -42.973869
Tweet = 3, 2019-02-07, UserT7, Hello., From IPhone, false, false, -22.926466, -43.209413
selectAllTweets - end
Select tweets by username
selectAllTableByUsername - init
TweetByUsername = 2, 2019-02-05, UserT1, Get lost!, From IPhone, false, true, -22.983267, -43.22336
TweetByUsername = 4, 2019-02-12, UserJ, Goodbye., From IPhone, false, false, -21.243262, -42.973869
TweetByUsername = 1, 2019-02-04, UserT, Get REKT!, From IPhone, false, false, -22.984408, -43.219379
selectAllTableByUsername - end
deleteTable - init
deleteTable - exec command DROP TABLE IF EXISTS tweets
deleteTable - end
Delete tweets
deleteTable - init
deleteTable - exec command DROP TABLE IF EXISTS tweetsByUsername
deleteTable - end
Delete tweetsByUsername

Process finished with exit code 0
