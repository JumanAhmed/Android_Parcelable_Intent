package com.example.juman.androidparcelableintent;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Juman on 7/18/2017.
 */

public class Person implements Parcelable {
    private String firstName;
    private String lastName;
    private String qualification;

    public Person() {

    }
    public Person(Parcel parcel) {
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.qualification = parcel.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.qualification);
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel parcel) {
            return new Person(parcel);
        }

        @Override
        public Person[] newArray(int i) {
            return new Person[i];
        }
    };



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


}
