package com.example.myapplication;

import android.app.Application;

import com.example.myapplication.bean.Bean;
import com.example.myapplication.dao.DaoMaster;
import com.example.myapplication.dao.DaoSession;

public class MyApp extends Application {

    private static DaoSession daoSession;

    public static DaoSession getDaoSession() {
        return daoSession;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        getdata();
        for (int i = 0; i < 20; i++) {
            Bean bean = new Bean("小明", "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=234634259,4236876085&fm=27&gp=0.jpg");
            daoSession.insert(bean);
        }
    }

    private void getdata() {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "ui.db");
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        daoSession = daoMaster.newSession();
    }
}
