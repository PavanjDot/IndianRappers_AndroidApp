package pavanjdot.com.indianrappers

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.rapper_layout.view.*

class rapperListAdepter: BaseAdapter{

    private var rapperdatabase: rapperDatabase? = null

    private var context: Context? = null

    constructor(context: Context){
        rapperdatabase = rapperDatabase()
        this.context = context
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {


        val Rapper: rapper = rapperdatabase?.rapperList?.get(position) ?:
                rapper("No Rapper", "nothing to show", R.drawable.placeholder, "no name", false)


        var rapperview: View

        var layoutinflater: LayoutInflater = context?.getSystemService(
            Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        if(Rapper.status == true){
            rapperview = layoutinflater.inflate(R.layout.starrapper_row, null)

        }
        else{
            rapperview = layoutinflater.inflate(R.layout.rapper_layout, null)

        }

        rapperview.actorImage.setImageResource(Rapper?.image ?: R.drawable.placeholder)
        rapperview.lblActorDes.setText(Rapper.des)
        rapperview.lblActorName.setText(Rapper.stagename)
        rapperview.lblActorstagename.setText(Rapper.orignalname)

        rapperview.setOnClickListener {

            val rapperBioIntent = Intent(context, BioActivity::class.java )
            rapperBioIntent.putExtra(BioActivity.ACTOR_STAGE_NAME, Rapper.stagename)
            rapperBioIntent.putExtra(BioActivity.ACTOR_DES, Rapper.des)
            rapperBioIntent.putExtra(BioActivity.ACTOR_IMAGE, Rapper.image)
            rapperBioIntent.putExtra(BioActivity.ACTOR_ORIGNAL_NAME, Rapper.orignalname)

            startActivity(context!!, rapperBioIntent, null)
        }




        return rapperview
    }

    override fun getItem(position: Int): Any {
        return rapperdatabase?.rapperList?.get(position) ?:
        rapper("No Rapper", "nothing to show", R.drawable.placeholder, "no name", false)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return rapperdatabase?.rapperList?.size ?: 0
    }



}