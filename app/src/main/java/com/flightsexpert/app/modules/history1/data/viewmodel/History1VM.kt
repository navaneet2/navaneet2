package com.flightsexpert.app.modules.history1.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.flightsexpert.app.modules.history1.`data`.model.History1Model

public class History1VM : ViewModel() {
  public val history1Model: MutableLiveData<History1Model> = MutableLiveData(History1Model())
}
