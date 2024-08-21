package com.harsh.copcompose.Model

import com.google.gson.annotations.SerializedName

data class TrendingModelModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemTrendModel?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataItemTrendModel(

	@field:SerializedName("model_name")
	val modelName: String? = null,

	@field:SerializedName("price")
	val price: PriceTrending? = null,

	@field:SerializedName("car_stage")
	val carStage: String? = null,

	@field:SerializedName("model_image")
	val modelImage: String? = null,

	@field:SerializedName("rating_value")
	val ratingValue: String? = null,

	@field:SerializedName("model_type")
	val modelType: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null,

	@field:SerializedName("launch_date")
	val launchDate: String? = null,

	@field:SerializedName("wishlist")
    var wishlist: Boolean? = null,

	@field:SerializedName("rating_type_name")
	val ratingTypeName: String? = null
)

data class PriceTrending(

	@field:SerializedName("min_ex_showroom_price")
	val minExShowroomPrice: String? = null,

	@field:SerializedName("price_filter")
	val priceFilter: Int? = null,

	@field:SerializedName("max_ex_showroom_price")
	val maxExShowroomPrice: String? = null
)