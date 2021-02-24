package com.example.cryptoapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.cryptoapp.api.apiFactory
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers


class MainActivity : AppCompatActivity() {

    private  val  compositeDisposable = CompositeDisposable()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val disposable = apiFactory.apiService.getTopCoinInfo()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
               // TextViewCenter.setText(it.toString())
                Log.d("TEST_OF_LOADING_DATA", it.toString())
            },{
                Log.d("TEST_OF_LOADING_DATA", it.message.toString())
            })
            compositeDisposable.add(disposable)

    }
}



