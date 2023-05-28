package com.giseys.tweet_clone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.giseys.tweet_clone.databinding.ContactListItemBinding

class TweetAdapter(var contactList:List<TweetData>):RecyclerView.Adapter<TweetAdapter.ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ContactViewHolder {
        val binding=
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact=contactList.get(position)
        val binding=holder.binding
        binding.tvAllNames.text=currentContact.AllNames
        binding.tvPhoneNumber.text =currentContact.phoneNumber
        binding.tvEmailAdress.text=currentContact.emailAddress
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
class ContactViewHolder(var binding: ContactListItemBinding):RecyclerView.ViewHolder(binding.root)}