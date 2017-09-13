package com.zark.android.tinytrailersutilitynew.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Zark on 9/12/2017.
 *
 */

/**
 * By default, Room creates a column for each field that's defined in the entity.
 * If an entity has fields that you don't want to persist, you can annotate them using @Ignore
 */

/**
 * By default, Room uses the class name as the database table name. If you want the table to have
 * a different name, set the tableName property of the @Entity annotation.
 */
@Entity
public class User {

    /**
     * Each entity must define at least 1 field as a primary key. Even when there is only 1 field,
     * you still need to annotate the field with the @PrimaryKey annotation. Also, if you want Room
     * to assign automatic IDs to entities, you can set the @PrimaryKey's autoGenerate property.
     */
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
