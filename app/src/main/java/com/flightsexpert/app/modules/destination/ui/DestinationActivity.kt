package com.flightsexpert.app.modules.destination.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.flightsexpert.app.R
import com.flightsexpert.app.databinding.ActivityDestinationBinding
import com.flightsexpert.app.modules.destination.`data`.viewmodel.DestinationVM
import com.flightsexpert.app.modules.rateus.ui.RateUsActivity
import kotlin.String
import kotlin.Unit

public class DestinationActivity : AppCompatActivity() {
  private lateinit var binding: ActivityDestinationBinding

  private val viewModel: DestinationVM by viewModels<DestinationVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_destination)
    binding.lifecycleOwner = this
    binding.destinationVM = viewModel
    binding.image1.setOnClickListener {

      val destIntent = RateUsActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "DESTINATION_ACTIVITY"
  }
}
