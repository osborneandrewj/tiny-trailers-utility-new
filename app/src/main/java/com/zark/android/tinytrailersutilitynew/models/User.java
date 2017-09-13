package com.zark.android.tinytrailersutilitynew.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Zark on 9/12/2017.
 *
 */

@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    private int _id;

    @ColumnInfo(name = "user_money")
    private long userMoney;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public long getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(long userMoney) {
        this.userMoney = userMoney;
    }
}
