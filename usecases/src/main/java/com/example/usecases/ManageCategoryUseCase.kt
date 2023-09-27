package com.example.usecases

import com.example.entities.product.Category
import com.example.usecases.repository.ProductsRepository
import javax.inject.Inject

class ManageCategoryUseCase @Inject constructor(
    private val productsRepository: ProductsRepository
) {

    suspend fun getCategories(): List<Category> {
        return productsRepository.getCategories()
    }

    suspend fun getCategoryById(categoryId: String): Category {
        return productsRepository.getCategoryById(categoryId)
    }

    suspend fun createCategory(name: String, image: String): Category {
        return productsRepository.createCategory(name, image)
    }

    suspend fun updateCategory(categoryId: String, name: String): Category {
        return productsRepository.updateCategory(categoryId, name)
    }
}