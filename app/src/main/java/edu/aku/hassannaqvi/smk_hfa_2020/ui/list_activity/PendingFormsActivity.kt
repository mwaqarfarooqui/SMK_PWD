package edu.aku.hassannaqvi.smk_hfa_2020.ui.list_activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import edu.aku.hassannaqvi.smk_hfa_2020.R
import edu.aku.hassannaqvi.smk_hfa_2020.adapter.PendingListAdapter
import edu.aku.hassannaqvi.smk_hfa_2020.contracts.FormsContract
import edu.aku.hassannaqvi.smk_hfa_2020.core.MainApp
import edu.aku.hassannaqvi.smk_hfa_2020.databinding.ActivityPendingFormsBinding


class PendingFormsActivity : AppCompatActivity() {

    lateinit var bi: ActivityPendingFormsBinding
    lateinit var adapter: PendingListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bi = DataBindingUtil.setContentView(this, R.layout.activity_pending_forms)
        bi.callback = this

        val unclosedForms = MainApp.appInfo.dbHelper.unclosedForms
        setupRecyclerView(unclosedForms)
    }

    private fun setupRecyclerView(forms_lst: MutableList<FormsContract>) {
        adapter = PendingListAdapter(this, forms_lst)
        bi.recyclerView.layoutManager = LinearLayoutManager(this)
        bi.recyclerView.adapter = adapter
    }
}
