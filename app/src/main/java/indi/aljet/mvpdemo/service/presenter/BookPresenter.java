package indi.aljet.mvpdemo.service.presenter;

import android.content.Context;
import android.content.Intent;

import indi.aljet.mvpdemo.service.entity.Book;
import indi.aljet.mvpdemo.service.manager.DataManager;
import indi.aljet.mvpdemo.service.view.BookView;
import indi.aljet.mvpdemo.service.view.View;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by PC-LJL on 2017/9/7.
 */

public class BookPresenter implements Presenter {


    private DataManager manager;
    private CompositeDisposable mCompositeDisposable;
    private Context mContext;
    private BookView mBookView;
    private Book mBook;

    public BookPresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void onCreate() {
        manager = new DataManager(mContext);
        mCompositeDisposable = new
                CompositeDisposable();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {
//        if(mCompositeDisposable.isDisposed()){
//            mCompositeDisposable.dispose();
//        }
        if(mCompositeDisposable != null) {
            mCompositeDisposable.clear();
        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void attachView(View view) {
        mBookView = (BookView) view;
    }

    @Override
    public void attachIncomingIntent(Intent intent) {
    }


    public void getSearchBooks(String name,String tag,
                               int start,int count){
        Observable<Book> observable =
                manager.getSearchBooks(name,tag,start,
                        count);

        DisposableObserver<Book> disposableObserver = new
                DisposableObserver<Book>() {
                    @Override
                    public void onNext(Book value) {
                        mBook = value;
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        mBookView.onError("请求失败！！");
                    }

                    @Override
                    public void onComplete() {
                        if(mBook != null){
                            mBookView.onSuccess(mBook);
                        }
                    }
                };
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(disposableObserver);

        mCompositeDisposable.add(disposableObserver);


    }
}
