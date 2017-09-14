package com.zark.android.tinytrailersutilitynew;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zark.android.tinytrailersutilitynew.database.UserDatabase;
import com.zark.android.tinytrailersutilitynew.models.User;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private UserDatabase mUserDatabase;

    @BindView(R.id.btn_new_player) Button mBtnNewPlayer;
    @BindView(R.id.tv_player_name) TextView mPlayerNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Setup database
        if (mUserDatabase == null) {
            mUserDatabase = Room.databaseBuilder(
                    getApplicationContext(),
                    UserDatabase.class,
                    // TODO: remove main thread queries with LiveData
                    "user-database").allowMainThreadQueries().build();
        }

        mBtnNewPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User newUser = new User();
                newUser.setUserMoney(1000);
                mUserDatabase.userDao().insertAll(newUser);
                ArrayList<User> arrayList = (ArrayList<User>) mUserDatabase.userDao().getAll();
                String userMoney = String.valueOf(arrayList.get(0).getUserMoney());
                mPlayerNameTextView.setText(String.valueOf(arrayList.size()));
            }
        });

    }
}
