package com.giseys.tweet_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.giseys.tweet_clone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        showContact()
    }
    fun showContact(){
        val contact1=TweetData("Gisemba Faith","0734672838","gisemnahdy@gmail.com")
        val contact2=TweetData("Henry Kylie","073456783","kyliehen@gmail.com")
        val contact3=TweetData("Johnsons Brick","074578290","brickhdgs@gmail.com")
        val contact4=TweetData("Neymar Laddin","0784933536","laddinhdd@gmail.com")
        val contact5=TweetData("Rodgers Hillax","076351839","rodgershillax@gmail.com")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5)
        val teeAdapter=TweetAdapter(contactList)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=teeAdapter

    }

}