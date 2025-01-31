package com.example.cryptoapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_coin_detail.*

class CoinDetailActivity : AppCompatActivity() {

    private lateinit  var viewModel: CoinViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_detail)
        if (!intent.hasExtra(EXTRA_FROM_SYMBOL)){
            finish()
            return
        }
        val fromSymbol = intent.getStringExtra(EXTRA_FROM_SYMBOL)
        viewModel = ViewModelProviders.of(this)[CoinViewModel::class.java]
        viewModel.getDetailInfo(fromSymbol.toString()).observe(this, Observer {
            tvPriceValue.text = it.price.toString()
            tvMinPriceValue.text = it.lowDay.toString()
            tvMaxPriceValue.text = it.highDay.toString()
            tvLastStockMarketValue.text = it.lastMarket.toString()
            tvUpdateTimeValue.text = it.getFormattedTime()
            tvFromSymbol.text = it.fromSymbol
            tvCurrency.text = it.toSymbol
            Picasso.get().load(it.getFullImageURL()).into(ivLogoCoin)

        })
    }

    companion object{
        private const val EXTRA_FROM_SYMBOL = "fSym"

        fun newIntent (context: Context, fromSymbol: String): Intent {
            val intent = Intent(context, CoinDetailActivity::class.java)
            intent.putExtra(EXTRA_FROM_SYMBOL,fromSymbol)
            return intent
        }
    }
}