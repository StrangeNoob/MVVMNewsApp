package dev.strangenoob.mvvmnewsapp.repository

import dev.strangenoob.mvvmnewsapp.api.RetrofitInstance
import dev.strangenoob.mvvmnewsapp.db.ArticleDatabase


class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) = RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)
}