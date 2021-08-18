package com.flightsexpert.app.modules.thankyou.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.flightsexpert.app.modules.thankyou.`data`.model.ThankYouModel

public class ThankYouVM : ViewModel() {
  public val thankYouModel: MutableLiveData<ThankYouModel> = MutableLiveData(ThankYouModel())
}
