package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val c: Context, private val items : Array<Int> ) : BaseAdapter() {

//    val context = _context
//    val items = _items

    override fun getCount(): Int {
       return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?)=
        if(convertView!=null){ convertView as TextView}
        else{
            TextView(c)
        }.apply{
            text = items[position].toString()
            textSize = 22f
        }
//       val textView : TextView
//
//       if(convertView != null){
//           textView = convertView as TextView
//
//       }else{
//           textView  = TextView(context)
//           textView.textSize = 22f
//           textView.setPadding(5,10,0,10)
//       }
//
//       textView.text =  textSize[position].toString()
//
//
//
//        return textView





    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        return getView(position, convertView, parent).apply{
            textSize = items[position].toFloat()

        }
    }


}