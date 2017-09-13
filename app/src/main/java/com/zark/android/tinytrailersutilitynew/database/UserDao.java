package com.zark.android.tinytrailersutilitynew.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.zark.android.tinytrailersutilitynew.models.User;

import java.util.List;

/**
 * Created by Zark on 9/12/2017.
 *
 */

@Dao
public interface UserDao {

    // This name is from the class name of User.java. This is case insensitive
    @Query("SELECT * FROM user")
    List<User> getAll();

    @Insert
    void insertAll(User...users);

    @Delete
    void delete(User user);
}
