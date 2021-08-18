package com.flightsexpert.app.modules.destination.`data`.model

import com.flightsexpert.app.R
import com.flightsexpert.app.appcomponents.di.MyApp
import kotlin.String

public data class DestinationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCurrentDestina: String? =
      MyApp.getInstance().resources.getString(R.string.msg_current_destina)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPreviouslyServ: String? =
      MyApp.getInstance().resources.getString(R.string.msg_previously_serv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIndia: String? = MyApp.getInstance().resources.getString(R.string.lbl_india)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAsOfDecember: String? =
      MyApp.getInstance().resources.getString(R.string.msg_as_of_december)

)
