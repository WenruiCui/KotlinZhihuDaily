package com.wenrui.kotlinzhihudaily.bean

import java.util.*

/**
 * author:崔文睿
 * mail:cuiwenrui@meituan.com
 * Created on 2018/4/28
 */
data class ListResult(
        val date: String,
        val stories: Array<DalyItem>,
        val top_stories: Array<TopDalyItem>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ListResult

        if (date != other.date) return false
        if (!Arrays.equals(stories, other.stories)) return false
        if (!Arrays.equals(top_stories, other.top_stories)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = date.hashCode()
        result = 31 * result + Arrays.hashCode(stories)
        result = 31 * result + Arrays.hashCode(top_stories)
        return result
    }
}