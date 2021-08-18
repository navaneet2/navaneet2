package com.flightsexpert.app.modules.destination.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.flightsexpert.app.modules.destination.`data`.model.DestinationModel

public class DestinationVM : ViewModel() {
  public val destinationModel: MutableLiveData<DestinationModel> =
      MutableLiveData(DestinationModel())
}
