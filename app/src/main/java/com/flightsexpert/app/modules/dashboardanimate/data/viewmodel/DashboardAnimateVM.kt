package com.flightsexpert.app.modules.dashboardanimate.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.flightsexpert.app.modules.dashboardanimate.`data`.model.DashboardAnimateModel

public class DashboardAnimateVM : ViewModel() {
  public val dashboardAnimateModel: MutableLiveData<DashboardAnimateModel> =
      MutableLiveData(DashboardAnimateModel())
}
