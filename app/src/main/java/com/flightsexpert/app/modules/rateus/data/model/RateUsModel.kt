package com.flightsexpert.app.modules.rateus.`data`.model

import com.flightsexpert.app.R
import com.flightsexpert.app.appcomponents.di.MyApp
import kotlin.String

public data class RateUsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDoRateUs: String? = MyApp.getInstance().resources.getString(R.string.lbl_do_rate_us)

)
