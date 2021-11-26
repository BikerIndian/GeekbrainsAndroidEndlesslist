package net.svichch.geekbrains.android.endlesslist.util

import net.svichch.geekbrains.android.endlesslist.data.HotEntity
import net.svichch.geekbrains.android.endlesslist.network.api.hot.Child
import net.svichch.geekbrains.android.endlesslist.network.api.hot.Data02

class ChildToHotEntity {

    companion object {
        fun getHot(child: List<Child>): List<HotEntity> {
            val hotEntity = arrayListOf<HotEntity>()

            child.forEach {
                val content: String = it.data?.title ?: "No info"
                val starNum: String = (it.data?.numCrossposts ?: "0").toString()
                val comment_size: String = (it.data?.numComments ?: "0").toString()
                val hot = HotEntity(content, starNum, comment_size)
                hotEntity.add(hot)
            }

            return hotEntity
        }

        fun getChild(hot: List<HotEntity>): List<Child> {
            val childList = arrayListOf<Child>()

            hot.forEach {

                var data = Data02()
                val child = Child()
                child.data = data

                data.title =  it.content
                data.numCrossposts =   it.starNum.toLong()
                data.numComments = it.comment_size?.toLong()

                childList.add(child)
            }

            return childList
        }

    }
}