package net.svichch.geekbrains.android.endlesslist.ui.list

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import net.svichch.geekbrains.android.endlesslist.R
import net.svichch.geekbrains.android.endlesslist.databinding.FragmentListBinding
import net.svichch.geekbrains.android.endlesslist.placeholder.PlaceholderContent

class FragmentList : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ListAdapter(PlaceholderContent.ITEMS)
        binding.list.adapter = adapter
        addLine()

    }

    // Добавляем полоску
    @SuppressLint("UseCompatLoadingForDrawables")
    private fun addLine() {
        val dividerItemDecoration = DividerItemDecoration(this.context, RecyclerView.VERTICAL)
        dividerItemDecoration.setDrawable(resources.getDrawable(R.drawable.divider_drawable, null))
        binding.list.addItemDecoration(dividerItemDecoration)
    }

    companion object {
        @JvmStatic
        fun newInstance() = FragmentList()
    }
}