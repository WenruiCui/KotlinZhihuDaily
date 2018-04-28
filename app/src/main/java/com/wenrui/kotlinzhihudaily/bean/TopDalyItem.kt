package com.wenrui.kotlinzhihudaily.bean

/**
 * 知乎日报置顶item
 * author:崔文睿
 * mail:cuiwenrui@meituan.com
 * Created on 2018/4/28
 */
data class TopDalyItem(
        val id: Long,
        val image: String,
        val title: String,
        val type: String,
        val gaPerfix: String)
