package com.flightsexpert.app.modules.rateus.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.flightsexpert.app.modules.rateus.`data`.model.RateUsModel

public class RateUsVM : ViewModel() {
  public val rateUsModel: MutableLiveData<RateUsModel> = MutableLiveData(RateUsModel())
}
