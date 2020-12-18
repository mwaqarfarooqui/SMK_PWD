package edu.aku.hassannaqvi.smk_pwd.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import edu.aku.hassannaqvi.smk_pwd.R
import edu.aku.hassannaqvi.smk_pwd.databinding.PendingformLayoutBinding
import edu.aku.hassannaqvi.smk_pwd.models.Forms

class PendingListAdapter(private val mContext: Context, private var mList: List<Forms>) : RecyclerView.Adapter<PendingListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val bi: PendingformLayoutBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.pendingform_layout, viewGroup, false)
        return ViewHolder(bi)
    }

    override fun onBindViewHolder(holder: ViewHolder, i: Int) {
        holder.bi.parentLayout.tag = i
        holder.bi.cluster.text = "Health Facility: ".plus(mList[i].hf)
        holder.bi.hhno.text = mList[i].sysdate
        holder.bi.istatus.text = "Incomplete"
        holder.bi.sysdate.visibility = View.INVISIBLE
        holder.bi.istatus.setTextColor(Color.RED)

    }

    override fun getItemCount(): Int {
        return mList.size
    }

    fun setMList(members: List<Forms>) {
        mList = members
        notifyDataSetChanged()
    }

    class ViewHolder(val bi: PendingformLayoutBinding) : RecyclerView.ViewHolder(bi.root)

}