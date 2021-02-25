package com.example.cryptoapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders




class CoinPriceKistActivity : AppCompatActivity() {

    private lateinit  var viewModel: CoinViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_price_list)
        viewModel = ViewModelProviders.of(this)[CoinViewModel::class.java]


        viewModel.getDetailInfo("BTC").observe(this,Observer{
            Log.d("TEST_OF_LOADING_DATA", "Success $it")
        })


    }
}



