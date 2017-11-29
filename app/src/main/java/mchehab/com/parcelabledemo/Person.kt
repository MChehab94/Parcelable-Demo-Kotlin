package mchehab.com.parcelabledemo

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by muhammadchehab on 11/29/17.
 */

class Person : Parcelable {

    var firstName: String? = null
    var lastName: String? = null
    var age: Int = 0

    constructor() {
        lastName = ""
        firstName = lastName
        age = 0
    }

    constructor(firstName: String, lastName: String, age: Int) {
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }

    protected constructor(`in`: Parcel) {
        firstName = `in`.readString()
        lastName = `in`.readString()
        age = `in`.readInt()
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(firstName)
        dest.writeString(lastName)
        dest.writeInt(age)
    }

    companion object {

        val CREATOR: Parcelable.Creator<Person> = object : Parcelable.Creator<Person> {
            override fun createFromParcel(`in`: Parcel): Person {
                return Person(`in`)
            }

            override fun newArray(size: Int): Array<Person?> {
                return arrayOfNulls(size)
            }
        }
    }
}
