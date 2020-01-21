package com.example.przygotowaniedokolosa

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val listView = findViewById<ListView>(R.id.Lista)

        listView.adapter = MyCustomAdapter(this)



    }
}
private class MyCustomAdapter(context: Context) : BaseAdapter(){
    private val mContext:Context
    init{
        mContext = context
    }
    override fun getCount(): Int {
        return 5
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItem(position: Int): Any {
        return "TEST STRING"
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(mContext)
        textView.text = "HERERERE"
        return textView
    }
}
