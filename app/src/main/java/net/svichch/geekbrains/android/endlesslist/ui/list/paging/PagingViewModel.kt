package net.svichch.geekbrains.android.endlesslist.ui.list.paging

import androidx.lifecycle.ViewModel
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import net.svichch.geekbrains.android.endlesslist.data.HotDao
import net.svichch.geekbrains.android.endlesslist.data.HotEntity

class PagingViewModel(private val dao: HotDao) : ViewModel() {

    val allCheeses: Flow<PagingData<HotEntity>> = Pager(
        config = PagingConfig(
            pageSize = 10,
            enablePlaceholders = true,
            maxSize = dao.getCount()
        )
    ) {
        dao.getPaging()
    }.flow.cachedIn(CoroutineScope(Dispatchers.IO))

}
