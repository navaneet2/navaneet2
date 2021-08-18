package com.flightsexpert.app.modules.splashanimate.`data`.model

import com.flightsexpert.app.R
import com.flightsexpert.app.appcomponents.di.MyApp
import kotlin.String

public data class SplashAnimateModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFlightSExper: String? =
      MyApp.getInstance().resources.getString(R.string.msg_flight_s_exper)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhatDoYouKno: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_do_you_kno)

)
