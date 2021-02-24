package com.example.cryptoapp.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "full_price_list")
data class CoinPriceInfo (

    @SerializedName("TYPE")
    @Expose
    private val type: String? = null,

    @SerializedName("MARKET")
    @Expose
    private val market: String? = null,
    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    @Expose
    private val fromSymbol: String? = null,

    @SerializedName("TOSYMBOL")
    @Expose
    private val toSymbol: String? = null,

    @SerializedName("FLAGS")
    @Expose
    private val flags: String? = null,

    @SerializedName("PRICE")
    @Expose
    private val price: Double? = null,

    @SerializedName("LASTUPDATE")
    @Expose
    private val lastUpdate: Int? = null,

    @SerializedName("MEDIAN")
    @Expose
    private val median: Double? = null,

    @SerializedName("LASTVOLUME")
    @Expose
    private val lastVolume: Double? = null,

    @SerializedName("LASTTRADEID")
    @Expose
    private val lastTradeID: String? = null,

    @SerializedName("VOLUMEDAY")
    @Expose
    private val volumeDay: Double? = null,

    @SerializedName("VOLUME24HOUR")
    @Expose
    private val volume24Hour: Double? = null,

    @SerializedName("OPENDAY")
    @Expose
    private val openDay: Double? = null,

    @SerializedName("HIGHDAY")
    @Expose
    private val highDay: Double? = null,

    @SerializedName("LOWDAY")
    @Expose
    private val lowDay: Double? = null,

    @SerializedName("OPEN24HOUR")
    @Expose
    private val open24Hour: Double? = null,

    @SerializedName("HIGH24HOUR")
    @Expose
    private val high24Hour: Double? = null,

    @SerializedName("LOW24HOUR")
    @Expose
    private val low24Hour: Int? = null,

    @SerializedName("LASTMARKET")
    @Expose
    private val lastMarket: String? = null,

    @SerializedName("VOLUMEHOUR")
    @Expose
    private val volumeHour: Double? = null,

    @SerializedName("OPENHOUR")
    @Expose
    private val openHour: Double? = null,

    @SerializedName("HIGHHOUR")
    @Expose
    private val highHour: Double? = null,

    @SerializedName("LOWHOUR")
    @Expose
    private val lowHour: Double? = null,

    @SerializedName("CHANGE24HOUR")
    @Expose
    private val change24Hour: Double? = null,

    @SerializedName("CHANGEDAY")
    @Expose
    private val changeDay: Double? = null,

    @SerializedName("CHANGEHOUR")
    @Expose
    private val changeHour: Double? = null,

    @SerializedName("CONVERSIONTYPE")
    @Expose
    private val conversionType: String? = null,

    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    private val conversionSymbol: String? = null,

    @SerializedName("SUPPLY")
    @Expose
    private val supply: Int? = null,

    @SerializedName("TOTALVOLUME24H")
    @Expose
    private val totalVolume24H: Double? = null,

    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    private val totalTopTierVolume24H: Double? = null,

    @SerializedName("IMAGEURL")
    @Expose
    private val imageURL: String? = null
)