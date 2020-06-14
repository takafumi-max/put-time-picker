package jp.wings.nikkeibp.put_time_picker

import android.app.TimePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.TimePicker
import androidx.fragment.app.FragmentActivity
// need to import for Kotlin Android Extensions
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : FragmentActivity(), TimePickerDialog.OnTimeSetListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {

        val str = String.format(Locale.US, "%d:%d", hourOfDay, minute)

        // use the plug in of Kotlin Android Extensions
        textView.text = str

    }

    // called by Buttton tapping
    fun showTimePickerDialog(v: View) {
        val newFragment = TimePick()
        newFragment.show(supportFragmentManager, "timePicker")

    }
}