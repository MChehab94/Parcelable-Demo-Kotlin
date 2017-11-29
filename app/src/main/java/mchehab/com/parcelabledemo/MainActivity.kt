package mchehab.com.parcelabledemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val personFragment = PersonFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            val person = Person("first name", "last name", 20)
            val bundle = Bundle()
            bundle.putParcelable("person", person)
            personFragment.arguments = bundle
            fragmentManager.beginTransaction().add(R.id.frameLayout, personFragment).commit()
        }
    }
}
