package com.example.catsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

class MainAdapter(val context: Context, val catList: ArrayList<Cat>) :RecyclerView.Adapter<MainAdapter.Holder>() {
    // 화면을 최초로 로딩하여 만들어진 View가 없는 경우, xml파일을 inflate하여 ViewHolder를 생성한다.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder{
        val view = LayoutInflater.from(context).inflate(R.layout.item, parent,false)
        return Holder(view)
    }

    // RecyclerView로 만들어진 item의 총 개수
    override fun getItemCount(): Int {
        return catList.size
    }

    // 위의 onCreateViewHolder에서 만든 view와 실제 입력되는 각각의 데이터를 연결한다.
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(catList[position], context)
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val catPhoto = itemView.findViewById<ImageView>(R.id.catphoto)
        val catBreed = itemView.findViewById<TextView>(R.id.catbreed)
        val catAge = itemView.findViewById<TextView>(R.id.catage)
        val catGender = itemView.findViewById<TextView>(R.id.catgender)

        fun bind(cat:Cat, context: Context){
            if (cat.photo != ""){
                val resId = context.resources.getIdentifier(cat.photo, "drawable", context.packageName)
                catPhoto?.setImageResource(resId)
            }else{
                catPhoto?.setImageResource(R.mipmap.ic_launcher)
            }
            catBreed?.text = cat.breed
            catAge?.text = cat.age
            catGender?.text = cat.gender
        }
    }

}