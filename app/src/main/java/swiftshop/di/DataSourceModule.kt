package swiftshop.di

import com.example.local.datastore.UserDataStoreDataSource
import com.example.local.source.RoomDatabaseDataSource
import com.example.remote.source.RetrofitDataSource
import com.example.repository.source.LocalDataSource
import com.example.repository.source.RemoteDataSource
import com.example.repository.source.UserPreferencesDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {
    @Singleton
    @Binds
    abstract fun bindLocalDataSource(
        roomDatabaseDataSource: RoomDatabaseDataSource
    ): LocalDataSource

    @Singleton
    @Binds
    abstract fun bindRemoteDataSource(
        retrofitDataSource: RetrofitDataSource
    ): RemoteDataSource

    @Singleton
    @Binds
    abstract fun bindDataSourceDataSource(
        userDataStoreDataSource: UserDataStoreDataSource
    ): UserPreferencesDataSource

}