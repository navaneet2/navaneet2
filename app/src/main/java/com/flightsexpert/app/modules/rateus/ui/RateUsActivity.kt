package com.flightsexpert.app.modules.rateus.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.flightsexpert.app.R
import com.flightsexpert.app.databinding.ActivityRateUsBinding
import com.flightsexpert.app.modules.rateus.`data`.viewmodel.RateUsVM
import com.flightsexpert.app.modules.thankyou.ui.ThankYouActivity
import kotlin.String
import kotlin.Unit

public class RateUsActivity : AppCompatActivity() {
  private lateinit var binding: ActivityRateUsBinding

  private val viewModel: RateUsVM by viewModels<RateUsVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_rate_us)
    binding.lifecycleOwner = this
    binding.rateUsVM = viewModel
    binding.btnClickHere.setOnClickListener {

          val destIntent = ThankYouActivity.getIntent(this, null)
          startActivity(destIntent)

        }
  }

  public companion object {
    public const val TAG: String = "RATE_US_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RateUsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
