package indi.aljet.mvpdemo.service;

import indi.aljet.mvpdemo.service.entity.Book;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by PC-LJL on 2017/9/7.
 */

public interface RetrofitService {

    @GET("book/search")
    Observable<Book> getSearchBooks(@Query("q") String name,
                                    @Query("tag") String tag,
                                    @Query("start") int start,
                                    @Query("count") int count);


}
