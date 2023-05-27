package com.example.shoppingstore.model.repo

import com.example.shoppingstore.model.data.carts.CartsItem
import com.example.shoppingstore.model.data.products.ProductsItem
import com.example.shoppingstore.model.data.users.LoginResponse
import com.example.shoppingstore.model.data.users.UsersItem
import com.example.shoppingstore.model.store_service.StoreApi
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

class ShoppingRepoImpl : ShoppingRepo {
    private val storeService by lazy { StoreApi().apiService }

    override fun getAllProducts(): Single<List<ProductsItem>> {
        return storeService.getAllProducts()
    }

    override fun getProduct(id: Int): Single<ProductsItem> {
        return storeService.getProduct(id)
    }

    override fun getLimitedProducts(limit: Int): Single<List<ProductsItem>> {
        return storeService.getLimitedProducts(limit)
    }

    override fun getProductsItemsBySort(sort: String): Single<List<ProductsItem>> {
        return storeService.getProductsItemsBySort(sort)
    }

    override fun getAllCategories(): Single<List<String>> {
        return storeService.getAllCategories()
    }

    override fun getProductsByCategory(categoryName: String): Single<List<ProductsItem>> {
        return storeService.getProductsByCategory(categoryName)
    }

    override fun createProduct(product: ProductsItem): Single<ProductsItem> {
        return storeService.createProduct(product)
    }

    override fun updateProduct(productId: Int, product: ProductsItem): Single<ProductsItem> {
        return storeService.updateProduct(productId, product)
    }

    override fun partiallyUpdateProduct(productId: Int, product: ProductsItem):
            Single<ProductsItem> {
        return storeService.partiallyUpdateProduct(productId, product)
    }

    override fun deleteProduct(productId: Int): Completable {
        return storeService.deleteProduct(productId)
    }

    override fun getCarts(id: Int): Single<CartsItem> {
        return storeService.getCarts(id)
    }

    override fun getAllCartsItems(): Single<List<CartsItem>> {
        return storeService.getAllCartsItems()
    }

    override fun getCartsItemsByLimit(limit: Int): Single<List<CartsItem>> {
        return storeService.getCartsItemsByLimit(limit)
    }

    override fun getCartsItemsBySort(sort: String): Single<List<CartsItem>> {
        return storeService.getCartsItemsBySort(sort)
    }

    override fun getCartsItemsByDateRange(
        startDate: String,
        endDate: String
    ): Single<List<CartsItem>> {
        return storeService.getCartsItemsByDateRange(startDate, endDate)
    }

    override fun getCartsItemsByUser(userId: Int): Single<List<CartsItem>> {
        return storeService.getCartsItemsByUser(userId)
    }

    override fun addNewCartsItem(cartsItem: CartsItem): Single<CartsItem> {
        return storeService.addNewCartsItem(cartsItem)
    }

    override fun updateCartsItem(cartsItemId: Int, cartsItem: CartsItem): Single<CartsItem> {
        return storeService.updateCartsItem(cartsItemId, cartsItem)
    }

    override fun deleteCartsItem(cartsItemId: Int): Single<Completable> {
        return storeService.deleteCartsItem(cartsItemId)
    }

    override fun getAllUsers(): Single<List<UsersItem>> {
        return storeService.getAllUsers()
    }

    override fun getSingleUser(id: Int): Single<UsersItem> {
        return storeService.getSingleUser(id)
    }

    override fun getUsersLimited(limit: Int): Single<List<UsersItem>> {
        return storeService.getUsersLimited(limit)
    }

    override fun getUsersSorted(sort: String): Single<List<UsersItem>> {
        return storeService.getUsersSorted(sort)
    }

    override fun addUser(newUser: UsersItem): Single<UsersItem> {
        return storeService.addUser(newUser)
    }

    override fun updateUser(id: Int, updatedUser: UsersItem): Single<UsersItem> {
        return storeService.updateUser(id, updatedUser)
    }

    override fun deleteUser(id: Int): Single<Completable> {
        return storeService.deleteUser(id)
    }

    override fun loginUser(userItem: UsersItem): Single<LoginResponse> {
        return storeService.loginUser(userItem)
    }

}