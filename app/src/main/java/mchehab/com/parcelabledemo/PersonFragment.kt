package mchehab.com.parcelabledemo

import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText

class PersonFragment : Fragment() {

    lateinit var editTextFirstName: EditText
    lateinit var editTextLastName: EditText
    lateinit var editTextAge: EditText

    lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_person, container, false)

        editTextFirstName = view.findViewById(R.id.editTextFirstName)
        editTextLastName = view.findViewById(R.id.editTextLastName)
        editTextAge = view.findViewById(R.id.editTextAge)

        getPersonArgument()

        editTextFirstName.setText(person.firstName)
        editTextLastName.setText(person.lastName)
        editTextAge.setText(" ${person.age}")

        return view
    }

    private fun getPersonArgument(){
        val bundle = arguments
        if(bundle != null){
            person = bundle.getParcelable("person")
        }
    }

}// Required empty public constructor
