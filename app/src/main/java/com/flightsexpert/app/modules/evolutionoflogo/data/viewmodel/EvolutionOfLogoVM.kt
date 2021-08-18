package com.flightsexpert.app.modules.evolutionoflogo.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.flightsexpert.app.modules.evolutionoflogo.`data`.model.EvolutionOfLogoModel

public class EvolutionOfLogoVM : ViewModel() {
  public val evolutionOfLogoModel: MutableLiveData<EvolutionOfLogoModel> =
      MutableLiveData(EvolutionOfLogoModel())
}
