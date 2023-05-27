package com.example.shoppingstore.model.repo

import com.example.shoppingstore.model.data.carts.CartsItem
import com.example.shoppingstore.model.data.products.ProductsItem
import com.example.shoppingstore.model.data.users.LoginResponse
import com.example.shoppingstore.model.data.users.UsersItem
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single


interface ShoppingRepo {

    fun getAllProducts(): Single<List<ProductsItem>>

    fun getProduct(id: Int): Single<ProductsItem>

    fun getLimitedProducts(limit: Int): Single<List<ProductsItem>>

    fun getProductsItemsBySort(sort: String): Single<List<ProductsItem>>

    fun getAllCategories(): Single<List<String>>

    fun getProductsByCategory(categoryName: String): Single<List<ProductsItem>>

    fun createProduct(product: ProductsItem): Single<ProductsItem>

    fun updateProduct(productId: Int, product: ProductsItem): Single<ProductsItem>

    fun partiallyUpdateProduct(productId: Int, product: ProductsItem): Single<ProductsItem>

    fun deleteProduct(productId: Int): Completable

    fun getCarts(id: Int): Single<CartsItem>

    fun getAllCartsItems(): Single<List<CartsItem>>

    fun getCartsItemsByLimit(limit: Int): Single<List<CartsItem>>

    fun getCartsItemsBySort(sort: String): Single<List<CartsItem>>

    fun getCartsItemsByDateRange(startDate: String, endDate: String): Single<List<CartsItem>>

    fun getCartsItemsByUser(userId: Int): Single<List<CartsItem>>

    fun addNewCartsItem(cartsItem: CartsItem): Single<CartsItem>

    fun updateCartsItem(cartsItemId: Int, cartsItem: CartsItem): Single<CartsItem>

    fun deleteCartsItem(cartsItemId: Int): Single<Completable>

    fun getAllUsers(): Single<List<UsersItem>>

    fun getSingleUser(id: Int): Single<UsersItem>

    fun getUsersLimited(limit: Int): Single<List<UsersItem>>

    fun getUsersSorted(sort: String): Single<List<UsersItem>>

    fun addUser(newUser: UsersItem): Single<UsersItem>

    fun updateUser(id: Int, updatedUser: UsersItem): Single<UsersItem>

    fun deleteUser(id: Int): Single<Completable>

    fun loginUser(userItem: UsersItem): Single<LoginResponse>
}