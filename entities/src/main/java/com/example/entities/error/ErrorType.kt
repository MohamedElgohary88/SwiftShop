package com.example.entities.error

open class SwiftShopException(message: String?): Exception(message)

class NullResultException(message: String?) : SwiftShopException(message)
class BadRequestException(message: String?) : SwiftShopException(message)
open class ValidationException(message: String?): SwiftShopException(message)
class NotFoundException(message: String?): SwiftShopException(message)
open class NetworkException(message: String?): SwiftShopException(message)
class  NoInternetException(message: String?): NetworkException(message)
class ServerException(message: String?) : NetworkException(message)
class DeleteException(message: String?) : SwiftShopException(message)