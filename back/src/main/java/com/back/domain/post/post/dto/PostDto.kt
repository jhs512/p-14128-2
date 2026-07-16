package com.back.domain.post.post.dto

import com.back.domain.post.post.entity.Post
import java.time.LocalDateTime

@JvmRecord
data class PostDto(
    val id: Int,
    val createDate: LocalDateTime,
    val modifyDate: LocalDateTime,
    val authorId: Int,
    val authorName: String,
    val title: String
) {
    constructor(post: Post) : this(
        post.getId(),
        post.getCreateDate(),
        post.getModifyDate(),
        post.getAuthor().getId(),
        post.getAuthor().getName(),
        post.getTitle()
    )
}
