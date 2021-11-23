package com.homework.calculator;

import android.os.Parcel;
import android.os.Parcelable;

public class CodeStyleActivity implements Parcelable {
    protected CodeStyleActivity(Parcel in) {
        themeCode = in.readInt();
    }

    public static final Creator<CodeStyleActivity> CREATOR = new Creator<CodeStyleActivity>() {
        @Override
        public CodeStyleActivity createFromParcel(Parcel in) {
            return new CodeStyleActivity(in);
        }

        @Override
        public CodeStyleActivity[] newArray(int size) {
            return new CodeStyleActivity[size];
        }
    };

    public CodeStyleActivity() {

    }

    public int getThemeCode() {
        return themeCode;
    }

    public void setThemeCode(int themeCode) {
        this.themeCode = themeCode;
    }

    int themeCode = 0;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(themeCode);
    }
}
