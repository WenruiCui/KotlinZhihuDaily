package com.wenrui.kotlinzhihudaily.bean

import java.util.*

/**
 * 知乎日报列表item
 * author:崔文睿
 * mail:cuiwenrui@meituan.com
 * Created on 2018/4/28
 */
data class DalyItem(
        val id: Long,
        val image: Array<String>,
        val title: String,
        val type: String,
        val gaPerfix: String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DalyItem

        if (id != other.id) return false
        if (!Arrays.equals(image, other.image)) return false
        if (title != other.title) return false
        if (type != other.type) return false
        if (gaPerfix != other.gaPerfix) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + Arrays.hashCode(image)
        result = 31 * result + title.hashCode()
        result = 31 * result + type.hashCode()
        result = 31 * result + gaPerfix.hashCode()
        return result
    }
}