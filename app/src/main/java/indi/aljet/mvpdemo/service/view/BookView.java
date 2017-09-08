package indi.aljet.mvpdemo.service.view;

import indi.aljet.mvpdemo.service.entity.Book;

/**
 * Created by PC-LJL on 2017/9/7.
 */

public interface BookView extends View {

    void onSuccess(Book mBook);
    void onError(String result);
}
