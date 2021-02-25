package com.example.cryptoapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptoapp.R
import com.example.cryptoapp.pojo.CoinPriceInfo
import com.example.cryptoapp.pojo.Coininfo
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_coin_info.view.*

class CoinInfoAdapter(private val context: Context) : RecyclerView.Adapter<CoinInfoAdapter.CoinViewHolder>() {

    var coinInfoList: List<CoinPriceInfo> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    var onCoinClickListener: OnCoinClickListener? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_coin_info, parent, false)
        return CoinViewHolder(view)
    }

    override fun getItemCount(): Int = coinInfoList.size

    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
        val coin = coinInfoList[position]
        with(holder) {
            with(coin) {
                val symbolsTemplate = context.resources.getString(R.string.symbols_template)
                val lastUpdateTemplate = context.resources.getString(R.string.last_update_template)
                tvSymbols.text = String.format(symbolsTemplate, fromSymbol, toSymbol)
                coinPrice.text = price.toString()
                upTime.text = String.format(lastUpdateTemplate, getFormattedTime())
                Picasso.get().load(getFullImageURL()).into(ivLogoCoin)
                itemView.setOnClickListener { onCoinClickListener?.onCoinClick(this) }
        }

        }
    }

    inner class CoinViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivLogoCoin = itemView.ivLogoCoin
        val tvSymbols = itemView.tvSymbols
        val coinPrice = itemView.coinPrice
        val upTime = itemView.upTime
    }

    interface OnCoinClickListener {
        fun onCoinClick(coinPriceInfo: CoinPriceInfo)
    }
}