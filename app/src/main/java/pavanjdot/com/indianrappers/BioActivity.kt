package pavanjdot.com.indianrappers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bio.*

class BioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bio)

        var receiveData = intent.extras
        var actorstagename = receiveData.getString(ACTOR_STAGE_NAME)
        var actorDes = receiveData.getString(ACTOR_DES)
        var actorImage = receiveData.getInt(ACTOR_IMAGE)
        var actor_orignalname = receiveData.getString(ACTOR_ORIGNAL_NAME)

        bioActorImage.setImageResource(actorImage)
        lblBio.text = "$actor_orignalname - $actorstagename - $actorDes"
    }

    companion object {
        val ACTOR_STAGE_NAME = "name"
        val ACTOR_DES = "des"
        val ACTOR_IMAGE = "image"
        val ACTOR_ORIGNAL_NAME = "orignalname"
    }

}



