package pavanjdot.com.indianrappers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private var rapperAdapter: rapperListAdepter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rapperAdapter = rapperListAdepter(this@MainActivity)

        rapperListview.adapter = rapperAdapter
    }
}
