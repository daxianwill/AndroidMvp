package com.androidmvp.local.dao;

import com.androidmvp.api.WeatherApi;
import com.androidmvp.local.table.WeatherInfo;
import com.androidmvp.module.main.MainPresenter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 获取天气数据
 */
public class WeatherDao {

    //地址：http://www.weather.com.cn/adat/sk/101010100.html
    private String baseUrl="http://www.weather.com.cn/adat/sk/";
    private List<WeatherInfo> list = new ArrayList<>();
    private MainPresenter mainPresenter;

    public WeatherDao(MainPresenter mainPresenter){
        this.mainPresenter = mainPresenter;
    }

    public void getData(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        WeatherApi weatherApi = retrofit.create(WeatherApi.class);
        weatherApi.getModelBean("101010100")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MySubscriber());
    }

    class MySubscriber extends Subscriber<WeatherInfo> {
        @Override
        public void onCompleted() {
            mainPresenter.loadDataSuccess(list);
        }

        @Override
        public void onError(Throwable e) {
            mainPresenter.loadDataFailure();
        }

        @Override
        public void onNext(WeatherInfo mainModelBean) {
            list.add(mainModelBean);
        }
    }
}