package com.example.cryptoapp.pojo

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "full_price_list")
data class CoinPriceInfo (

    @SerializedName("TYPE")
    @Expose
    public
    val type: String?,

    @SerializedName("MARKET")
    @Expose
    public
    val market: String?,

    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    @Expose
    public
    val fromSymbol: String,

    @SerializedName("TOSYMBOL")
    @Expose
    public
    val toSymbol: String?,

    @SerializedName("FLAGS")
    @Expose
    public
    val flags: String?,

    @SerializedName("PRICE")
    @Expose
    public
    val price: Double?,

    @SerializedName("LASTUPDATE")
    @Expose
    public
    val lastUpdate: Int?,

    @SerializedName("MEDIAN")
    @Expose
    public
    val median: Double?,

    @SerializedName("LASTVOLUME")
    @Expose
    public
    val lastVolume: Double?,

    @SerializedName("LASTTRADEID")
    @Expose
    public
    val lastTradeID: String?,

    @SerializedName("VOLUMEDAY")
    @Expose
    public
    val volumeDay: Double?,

    @SerializedName("VOLUME24HOUR")
    @Expose
    public
    val volume24Hour: Double?,

    @SerializedName("OPENDAY")
    @Expose
    public
    val openDay: Double?,

    @SerializedName("HIGHDAY")
    @Expose
    public
    val highDay: Double?,

    @SerializedName("LOWDAY")
    @Expose
    public
    val lowDay: Double?,

    @SerializedName("OPEN24HOUR")
    @Expose
    public
    val open24Hour: Double?,

    @SerializedName("HIGH24HOUR")
    @Expose
    public
    val high24Hour: Double?,

    @SerializedName("LOW24HOUR")
    @Expose
    public
    val low24Hour: Int?,

    @SerializedName("LASTMARKET")
    @Expose
    public
    val lastMarket: String?,

    @SerializedName("VOLUMEHOUR")
    @Expose
    public
    val volumeHour: Double?,

    @SerializedName("OPENHOUR")
    @Expose
    public
    val openHour: Double?,

    @SerializedName("HIGHHOUR")
    @Expose
    public
    val highHour: Double?,

    @SerializedName("LOWHOUR")
    @Expose
    public
    val lowHour: Double?,

    @SerializedName("CHANGE24HOUR")
    @Expose
    public
    val change24Hour: Double?,

    @SerializedName("CHANGEDAY")
    @Expose
    public
    val changeDay: Double?,

    @SerializedName("CHANGEHOUR")
    @Expose
    public
    val changeHour: Double?,

    @SerializedName("CONVERSIONTYPE")
    @Expose
    public
    val conversionType: String?,

    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    public
    val conversionSymbol: String?,

    @SerializedName("SUPPLY")
    @Expose
    public
    val supply: Int?,

    @SerializedName("TOTALVOLUME24H")
    @Expose
    public
    val totalVolume24H: Double?,

    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    public
    val totalTopTierVolume24H: Double?,

    @SerializedName("IMAGEURL")
    @Expose
    public
    val imageURL: String?
)
