package com.flightsexpert.app.modules.aboutairindia.`data`.model

import com.flightsexpert.app.R
import com.flightsexpert.app.appcomponents.di.MyApp
import kotlin.String

public data class AboutAirIndiaModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAirIndiaForm: String? =
      MyApp.getInstance().resources.getString(R.string.msg_air_india_form)

)
