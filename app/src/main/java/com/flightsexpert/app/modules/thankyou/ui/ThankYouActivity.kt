package com.flightsexpert.app.modules.thankyou.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.flightsexpert.app.R
import com.flightsexpert.app.databinding.ActivityThankYouBinding
import com.flightsexpert.app.modules.thankyou.`data`.viewmodel.ThankYouVM
import kotlin.String
import kotlin.Unit

public class ThankYouActivity : AppCompatActivity() {
  private lateinit var binding: ActivityThankYouBinding

  private val viewModel: ThankYouVM by viewModels<ThankYouVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_thank_you)
    binding.lifecycleOwner = this
    binding.thankYouVM = viewModel
  }

  public companion object {
    public const val TAG: String = "THANK_YOU_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ThankYouActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
