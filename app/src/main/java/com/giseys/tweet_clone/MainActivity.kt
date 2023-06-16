package com.giseys.tweet_clone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.giseys.tweet_clone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var btnTop : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        showContact()
        binding.btnTop.setOnClickListener {
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
        }

    }
    fun showContact(){
        val contact1=TweetData("Gisemba Faith","0734672838","gisemnahdy@gmail.com","https://images.unsplash.com/photo-1438761681033-6461ffad8d80?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8cHJvZmlsZSUyMHBpY3R1cmVzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact2=TweetData("Henry Kylie","073456783","kyliehen@gmail.com","https://images.unsplash.com/photo-1463453091185-61582044d556?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBpY3R1cmVzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact3=TweetData("Johnsons Brick","074578290","brickhdgs@gmail.com","https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8cHJvZmlsZSUyMHBpY3R1cmVzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact4=TweetData("Neymar Laddin","0784933536","laddinhdd@gmail.com","https://images.unsplash.com/photo-1614289371518-722f2615943d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val contact5=TweetData("Rodgers Hillax","076351839","rodgershillax@gmail.com","https://images.unsplash.com/photo-1500648767791-00dcc994a43e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val contact6 = TweetData("Eunice Mjera","077832576","faithmgidt","https://images.unsplash.com/photo-1519011985187-444d62641929?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8QWZyaWNhbiUyMGFmcHJvZmlsZSUyMHBpY3R1cmVzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact7 = TweetData("Grace Kazungu","072319853","gracegdvgdskjh7","https://images.unsplash.com/photo-1607746882042-944635dfe10e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80")
        val contact8 = TweetData("Kelvin Son","0743890128","hhgdfttf@gmail.com","https://images.unsplash.com/photo-1471898554234-bcbfedd35134?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val contact9 = TweetData("Becky hulop","08653435","faiassdki@gmail.com","https://images.unsplash.com/photo-1521252659862-eec69941b071?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9)
        val teeAdapter=TweetAdapter(contactList)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=teeAdapter

    }

}




