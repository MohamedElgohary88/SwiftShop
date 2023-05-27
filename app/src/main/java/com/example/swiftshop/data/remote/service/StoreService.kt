package com.example.shoppingstore.model.store_service

import com.example.shoppingstore.model.data.carts.CartsItem
import com.example.shoppingstore.model.data.products.ProductsItem
import com.example.shoppingstore.model.data.users.LoginResponse
import com.example.shoppingstore.model.data.users.UsersItem
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface StoreService {

        @GET("products")
        fun getAllProducts(): Single<List<ProductsItem>>

        @GET("products/{id}")
        fun getProduct(
            @Path("id") id: Int
        ): Single<ProductsItem>

        @GET("products")
        fun getLimitedProducts(
            @Query("limit") limit: Int
        ): Single<List<ProductsItem>>

        @GET("products")
        fun getProductsItemsBySort(
            @Query("sort") sort: String
        ): Single<List<ProductsItem>>

        @GET("products/categories")
        fun getAllCategories(): Single<List<String>>

        @GET("products/category/{category_name}")
        fun getProductsByCategory(
            @Path(
                "category_name"
            ) categoryName: String
        ): Single<List<ProductsItem>>

        @POST("products")
        fun createProduct(
            @Body product: ProductsItem
        ): Single<ProductsItem>

        @PUT("products/{product_id}")
        fun updateProduct(
            @Path("product_id") productId: Int,
            @Body product: ProductsItem
        ): Single<ProductsItem>

        @PATCH("products/{product_id}")
        fun partiallyUpdateProduct(
            @Path("product_id") productId: Int,
            @Body product: ProductsItem
        ): Single<ProductsItem>

        @DELETE("products/{product_id}")
        fun deleteProduct(
            @Path(
                "product_id"
            ) productId: Int
        ): Completable

        @GET("carts/{id}")
        fun getCarts(
            @Path("id") id: Int
        ): Single<CartsItem>

        @GET("carts")
        fun getAllCartsItems(): Single<List<CartsItem>>

        @GET("carts")
        fun getCartsItemsByLimit(
            @Query("limit") limit: Int
        ): Single<List<CartsItem>>

        @GET("carts")
        fun getCartsItemsBySort(
            @Query("sort") sort: String
        ): Single<List<CartsItem>>

        @GET("CartsItems")
        fun getCartsItemsByDateRange(
            @Query("startdate") startDate: String,
            @Query("enddate") endDate: String
        ): Single<List<CartsItem>>

        @GET("CartsItems/user/{userId}")
        fun getCartsItemsByUser(
            @Path("userId") userId: Int
        ): Single<List<CartsItem>>

        @POST("CartsItems")
        fun addNewCartsItem(
            @Body CartsItem: CartsItem
        ): Single<CartsItem>

        @PUT("CartsItems/{CartsItemId}")
        fun updateCartsItem(
            @Path("CartsItemId") CartsItemId: Int,
            @Body CartsItem: CartsItem
        ): Single<CartsItem>

        @DELETE("CartsItems/{CartsItemId}")
        fun deleteCartsItem(
            @Path("CartsItemId") CartsItemId: Int
        ): Single<Completable>

        @GET("users")
        fun getAllUsers(): Single<List<UsersItem>>

        @GET("users/{id}")
        fun getSingleUser(
            @Path("id") id: Int
        ): Single<UsersItem>

        @GET("users")
        fun getUsersLimited(
            @Query("limit") limit: Int
        ): Single<List<UsersItem>>

        @GET("users")
        fun getUsersSorted(
            @Query("sort") sort: String
        ): Single<List<UsersItem>>

        @POST("users")
        fun addUser(
            @Body newUser: UsersItem
        ): Single<UsersItem>

        @PUT("users/{id}")
        fun updateUser(
            @Path("id") id: Int,
            @Body updatedUser: UsersItem
        ): Single<UsersItem>

        @DELETE("users/{id}")
        fun deleteUser(
            @Path("id") id: Int
        ): Single<Completable>

        @POST("auth/login")
        fun loginUser(
            @Body body: UsersItem
        ): Single<LoginResponse>
}