package com.zark.android.tinytrailersutilitynew.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.zark.android.tinytrailersutilitynew.models.User;

/**
 * Created by Zark on 9/12/2017.
 *
 */

@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
