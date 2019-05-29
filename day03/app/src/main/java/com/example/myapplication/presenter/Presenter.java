package com.example.myapplication.presenter;

import com.example.myapplication.base.BasecallBack;
import com.example.myapplication.bean.Bean;
import com.example.myapplication.contract.Contract;
import com.example.myapplication.model.Model;

import java.util.List;

public class Presenter implements Contract.Presenter {
    @Override
    public void attachView(final Contract.View view) {
        Model model = new Model();
        model.getModel(new BasecallBack<List<Bean>>() {
            @Override
            public void onSuccess(List<Bean> data) {
                view.getIfView(data);
            }
        });
    }

    @Override
    public void detachView(Contract.View view) {

    }
}
