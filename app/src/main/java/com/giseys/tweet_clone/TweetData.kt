package com.giseys.tweet_clone

data class TweetData(
    var avatar:String,
    var displayName:String,
    var handle:String,
    var tweet:String,
    var commentCount:Int,
    var rtCount:Int,
    var likeCount:Int
)
