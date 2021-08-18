package com.flightsexpert.app.modules.aboutairindia.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.flightsexpert.app.modules.aboutairindia.`data`.model.AboutAirIndiaModel

public class AboutAirIndiaVM : ViewModel() {
  public val aboutAirIndiaModel: MutableLiveData<AboutAirIndiaModel> =
      MutableLiveData(AboutAirIndiaModel())
}
