package com.flightsexpert.app.modules.dashboardanimate.`data`.model

import com.flightsexpert.app.R
import com.flightsexpert.app.appcomponents.di.MyApp
import kotlin.String

public data class DashboardAnimateModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFlightSExper: String? =
      MyApp.getInstance().resources.getString(R.string.msg_flight_s_exper)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtKnow: String? = MyApp.getInstance().resources.getString(R.string.lbl_know)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAbout: String? = MyApp.getInstance().resources.getString(R.string.lbl_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAirIndia: String? = MyApp.getInstance().resources.getString(R.string.lbl_air_india)

)
