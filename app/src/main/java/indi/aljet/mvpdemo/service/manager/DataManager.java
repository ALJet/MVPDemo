package indi.aljet.mvpdemo.service.manager;

import android.content.Context;

import indi.aljet.mvpdemo.service.RetrofitHelper;
import indi.aljet.mvpdemo.service.RetrofitService;
import indi.aljet.mvpdemo.service.entity.Book;
import io.reactivex.Observable;

/**
 * Created by PC-LJL on 2017/9/7.
 */

public class DataManager {

    private RetrofitService mRetrofitService;
    public DataManager(Context context){
        this.mRetrofitService = RetrofitHelper
                .getInstance(context)
                .getServer();
    }

    public Observable<Book> getSearchBooks(String name,String tag
    ,int start,int count){
        return mRetrofitService.getSearchBooks(name,
                tag,start,count);
    }

}
