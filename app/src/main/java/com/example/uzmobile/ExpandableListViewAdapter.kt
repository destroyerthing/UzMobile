package com.example.uzmobile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView


class ExpandableListViewAdapter(
    val context: Context,
    private val titles: List<String>,
    private val subItems: List<List<String>>
) : BaseExpandableListAdapter() {


    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupCount(): Int = titles.size


    override fun getChildrenCount(groupPosition: Int): Int {
        return subItems[groupPosition].size
    }

    override fun getGroup(groupPosition: Int): Any {
        return titles[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return subItems[groupPosition][childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }


    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        p3: ViewGroup?
    ): View {
        var view = convertView
        if (convertView == null) {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.title_layout, null)
        }
        val textTitle = view!!.findViewById<TextView>(R.id.txt_title)
        textTitle.text = getGroup(groupPosition).toString()
        return view
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        p2: Boolean,
        convertView: View?,
        p4: ViewGroup?
    ): View {
        var view = convertView
        if (convertView == null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

            view = inflater.inflate(R.layout.child_layout, null)
        }
        val textSubItem = view!!.findViewById<TextView>(R.id.txt_subtitle)
        textSubItem.text = getChild(groupPosition,childPosition).toString()
        return view
    }


}