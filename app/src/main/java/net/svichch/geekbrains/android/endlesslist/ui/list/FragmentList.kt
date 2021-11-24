package net.svichch.geekbrains.android.endlesslist.ui.list

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import net.svichch.geekbrains.android.endlesslist.R
import net.svichch.geekbrains.android.endlesslist.databinding.FragmentListBinding
import net.svichch.geekbrains.android.endlesslist.network.api.ApiHolder
import net.svichch.geekbrains.android.endlesslist.network.api.hot.Child
import net.svichch.geekbrains.android.endlesslist.network.api.retrofit.RetrofitHot

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
        addLine()
        getHot()
    }

    private fun getHot() {
        RetrofitHot(ApiHolder().api).getHot()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ hot ->

                hot.data?.children?.let { addAdapter(it) }
            }, {
                Toast.makeText(context, it.message, Toast.LENGTH_SHORT).show()
            })
    }

    private fun addAdapter(results: List<Child>) {
        val adapter = ListAdapter(results)
        binding.list.adapter = adapter
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