package com.example.weknot_android.widget.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.weknot_android.R
import com.example.weknot_android.databinding.OpenChatItemBinding
import com.example.weknot_android.model.entity.OpenChat.OpenChatRoom
import com.example.weknot_android.widget.recyclerview.holder.OpenChatViewHolder


class OpenChatAdapter : Adapter<OpenChatViewHolder>() {
    private lateinit var openChatRooms: List<OpenChatRoom>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OpenChatViewHolder {
        return OpenChatViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.open_chat_item, parent, false))
    }

    override fun onBindViewHolder(holder: OpenChatViewHolder, position: Int) {
        holder.bind(openChatRooms[position])
    }

    fun updateList(openChatRooms: List<OpenChatRoom>) {
        this.openChatRooms = openChatRooms
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return if(::openChatRooms.isInitialized) openChatRooms.size else 0
    }

}