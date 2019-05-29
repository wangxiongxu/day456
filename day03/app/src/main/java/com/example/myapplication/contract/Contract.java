package com.example.myapplication.contract;

import com.example.myapplication.base.BasePresenter;
import com.example.myapplication.base.BaseView;
import com.example.myapplication.base.BasecallBack;
import com.example.myapplication.bean.Bean;

import java.util.List;

public interface Contract {
    interface Model {
        void getModel(BasecallBack<List<Bean>> beanBasecallBack);
    }

    interface View extends BaseView<Presenter> {
        void getIfView(List<Bean> bean);
    }

    interface Presenter extends BasePresenter<View> {
    }
}
