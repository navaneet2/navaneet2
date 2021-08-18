package com.flightsexpert.app.modules.splashanimate.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.flightsexpert.app.modules.splashanimate.`data`.model.SplashAnimateModel

public class SplashAnimateVM : ViewModel() {
  public val splashAnimateModel: MutableLiveData<SplashAnimateModel> =
      MutableLiveData(SplashAnimateModel())
}
