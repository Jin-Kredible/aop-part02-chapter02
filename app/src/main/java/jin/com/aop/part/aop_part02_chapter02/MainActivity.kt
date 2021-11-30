package jin.com.aop.part.aop_part02_chapter02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker

class MainActivity : AppCompatActivity() {

    private val clearButton : Button by lazy {
        findViewById(R.id.clearButton)

    }
    private val addButton : Button by lazy {
            findViewById(R.id.addButton)
    }

    private val runButton : Button by lazy {
        findViewById(R.id.runButton)
    }

    private val numberPicker : NumberPicker by lazy {
            findViewById(R.id.numberPick)
    }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            numberPicker.minValue = 1
            numberPicker.maxValue= 45

        }
    }
