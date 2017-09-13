package com.zark.android.tinytrailersutilitynew.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.zark.android.tinytrailersutilitynew.models.User;

/**
 * Created by Zark on 9/12/2017.
 *
 */

/**
 * When a class is annotated with @Entity and is referenced in the entities property
 * of a @Database annotation, Room creates a database table for that entity in the database.
 */
@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
