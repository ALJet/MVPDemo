package indi.aljet.mvpdemo.service.presenter;

import android.content.Intent;

import indi.aljet.mvpdemo.service.view.View;

/**
 * Created by PC-LJL on 2017/9/7.
 */

public interface Presenter {

    void onCreate();

    void onStart();

    void onStop();

    void pause();

    void attachView(View view);

    void attachIncomingIntent(Intent intent);


}
