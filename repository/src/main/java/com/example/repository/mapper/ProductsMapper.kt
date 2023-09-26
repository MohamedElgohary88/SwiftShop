package com.example.repository.mapper

import com.example.entities.product.Category
import com.example.entities.product.Product
import com.example.entities.product.ProductRequest
import com.example.entities.product.ProductRequestUpdate
import com.example.entities.product.UploadFile
import com.example.repository.request.ProductRequestDto
import com.example.repository.request.ProductRequestUpdateDto
import com.example.repository.response.CategoryDto
import com.example.repository.response.ProductDto
import com.example.repository.response.UploadFileDto

fun ProductDto.toEntity(): Product {
    return Product(
        categoryDto.toEntity(),
        description = description, id = id, images = images, price = price, title = title
    )
}

fun CategoryDto.toEntity(): Category {
    return Category(id = id, image = image, name = name)
}

fun UploadFileDto.toEntity(): UploadFile {
    return UploadFile(originalName = originalName, fileName = fileName)
}

fun ProductRequest.toDto(): ProductRequestDto {
    return ProductRequestDto(
        title = title,
        price = price,
        description = description,
        categoryId = categoryId,
        images = images
    )
}

fun ProductRequestUpdate.toDto(): ProductRequestUpdateDto {
    return ProductRequestUpdateDto(
        title = title,
        price = price,
        images = images
    )
}