package br.com.rodrigo.cartao

import android.app.Application
import br.com.rodrigo.cartao.data.AppDatabase
import br.com.rodrigo.cartao.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}