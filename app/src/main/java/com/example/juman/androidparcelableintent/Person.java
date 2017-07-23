package com.example.juman.androidparcelableintent;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Juman on 7/18/2017.
 */

public class Person implements Parcelable {
    private String firstName;
    private String lastName;
    private String qualification;

    private int height;

    //enum types
    private GENDER gender;
    enum GENDER{MALE,FEMALE};

    private List<String> qualifications;
    private boolean hostelPreference;
    private List<CityLivedIn> residenceHistory;


    public Person() {

    }
    public Person(Parcel parcel) {
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.qualification = parcel.readString();
        this.height = parcel.readInt();
        this.qualifications = parcel.readArrayList(null);
        this.gender = (parcel.readByte()==1?GENDER.MALE:GENDER.FEMALE);
        this.hostelPreference = parcel.readByte()==1?true:false;
        this.residenceHistory = parcel.createTypedArrayList(CityLivedIn.CREATOR);
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
        parcel.writeInt(this.height);
        parcel.writeList(this.qualifications);
        parcel.writeByte(this.gender==GENDER.MALE?(byte)1:(byte)0);
        parcel.writeByte(this.hostelPreference==true?(byte)1:(byte)0);
        parcel.writeTypedList(this.residenceHistory);
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public List<String> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<String> qualifications) {
        this.qualifications = qualifications;
    }

    public boolean isHostelPreference() {
        return hostelPreference;
    }

    public void setHostelPreference(boolean hostelPreference) {
        this.hostelPreference = hostelPreference;
    }

    public List<CityLivedIn> getResidenceHistory() {
        return residenceHistory;
    }

    public void setResidenceHistory(List<CityLivedIn> residenceHistory) {
        this.residenceHistory = residenceHistory;
    }
}
