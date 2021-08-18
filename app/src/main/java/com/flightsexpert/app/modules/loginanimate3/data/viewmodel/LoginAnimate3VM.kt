package com.flightsexpert.app.modules.loginanimate3.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.flightsexpert.app.modules.loginanimate3.`data`.model.LoginAnimate3Model

public class LoginAnimate3VM : ViewModel() {
  public val loginAnimate3Model: MutableLiveData<LoginAnimate3Model> =
      MutableLiveData(LoginAnimate3Model())
}
