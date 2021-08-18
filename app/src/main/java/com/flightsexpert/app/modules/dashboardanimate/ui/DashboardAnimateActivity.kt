package com.flightsexpert.app.modules.dashboardanimate.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.flightsexpert.app.R
import com.flightsexpert.app.databinding.ActivityDashboardAnimateBinding
import com.flightsexpert.app.modules.aboutairindia.ui.AboutAirIndiaActivity
import com.flightsexpert.app.modules.dashboardanimate.`data`.viewmodel.DashboardAnimateVM
import kotlin.String
import kotlin.Unit

public class DashboardAnimateActivity : AppCompatActivity() {
  private lateinit var binding: ActivityDashboardAnimateBinding

  private val viewModel: DashboardAnimateVM by viewModels<DashboardAnimateVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_dashboard_animate)
    binding.lifecycleOwner = this
    binding.dashboardAnimateVM = viewModel
    binding.btnClickHere.setOnClickListener {

      val destIntent = AboutAirIndiaActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "DASHBOARD_ANIMATE_ACTIVITY"
  }
}
