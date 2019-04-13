package pavanjdot.com.indianrappers

class rapperDatabase {

    var rapperList: ArrayList<rapper>? = null

    constructor(){

        rapperList = ArrayList()
        rapperList?.add(rapper("Divin", "He is the King of the underground rapping," +
                " and he has a Record Label called Gully Gang", R.drawable.divin,
            "Vivin Farnandis", false))

        rapperList?.add(rapper("Naezy", "He is a Underground talented Rapper, he basically rap about the practical issues", R.drawable.naezy,
            "Naved Shek", false))

        rapperList?.add(rapper("Bohimiya", "First person to Rap in " +
                "Panajabi, hence the first person to Rap  ", R.drawable.bohimiya,
            "Roger David", false))

        rapperList?.add(rapper("Broda V", "He is the Rapper in the South part of the country, he signed with sony music & collabed with so many star artists", R.drawable.brodav,
            "Vighnesh Shivanand", false))

        rapperList?.add(rapper("Ikka", "He is probably the main stream rapper who did a lot of songs in Bollywod", R.drawable.ikka,
            "Ankit Singh Patyal", false))

        rapperList?.add(rapper("Emiway", "A Rapper who became famous/Viral because of his diss tracks", R.drawable.emiway,
            "Sharuk shaik", false))

        



    }


}