package com.flightsexpert.app.modules.loginanimate3.`data`.model

import com.flightsexpert.app.R
import com.flightsexpert.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginAnimate3Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWelcomeBack: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFlightexpertGm: String? =
      MyApp.getInstance().resources.getString(R.string.msg_flightexpert_gm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLbl: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)

)
