package swiftshop.di

import android.content.Context
import androidx.room.Room
import com.example.local.room.SwiftDao
import com.example.local.room.SwiftDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    private const val DATABASE_NAME = "swift_database"

    @Singleton
    @Provides
    fun provideShopDatabase(
        @ApplicationContext context: Context
    ): SwiftDatabase {
        return Room.databaseBuilder(
            context,
            SwiftDatabase::class.java,
            DATABASE_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun provideSwiftDao(database: SwiftDatabase): SwiftDao = database.getSwiftDao()

}