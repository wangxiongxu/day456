package com.example.myapplication.model;

import com.example.myapplication.MyApp;
import com.example.myapplication.base.BasecallBack;
import com.example.myapplication.bean.Bean;
import com.example.myapplication.contract.Contract;
import com.example.myapplication.dao.DaoSession;

import java.util.List;

public class Model implements Contract.Model {

    @Override
    public void getModel(BasecallBack<List<Bean>> beanBasecallBack) {
        DaoSession daoSession = MyApp.getDaoSession();
        List<Bean> beans = daoSession.loadAll(Bean.class);
        beanBasecallBack.onSuccess(beans);
    }
}
