package com.example.cryptoapp

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.example.cryptoapp.api.apiFactory
import com.example.cryptoapp.database.AppDatabase
import io.reactivex.disposables.CompositeDisposable

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class CoinViewModel(application: Application) : AndroidViewModel(application){

    private val db = AppDatabase.getInstance(application)
    private  val compositeDisposable = CompositeDisposable()

    val priceList = db.coinPriceInfoDao().getPriceList()

    fun loadData() {
        val disposable = apiFactory.apiService.getTopCoinInfo(limit = 50)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                val a = it.data?.map{ it.coinInfo?.name }?.joinToString(",")

                Log.d("TEST_OF_LOADING_DATA", a.toString())
            },{
                Log.d("TEST_OF_LOADING_DATA", it.message.toString())
            })
        compositeDisposable.add(disposable)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}