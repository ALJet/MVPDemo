package indi.aljet.mvpdemo.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import indi.aljet.mvpdemo.R;
import indi.aljet.mvpdemo.service.entity.Book;
import indi.aljet.mvpdemo.service.presenter.BookPresenter;
import indi.aljet.mvpdemo.service.view.BookView;

public class MainActivity extends AppCompatActivity {


    TextView tvInfo;
    Button btnInfo;
    private BookPresenter mBookPresenter = new
            BookPresenter(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvInfo = (TextView) findViewById(R.id.tv_info);
        btnInfo = (Button)findViewById(R.id.btn_click);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBookPresenter.getSearchBooks("金瓶梅",
                        null,0,1);
            }
        });

        mBookPresenter.onCreate();
        mBookPresenter.attachView(mBookView);
    }


    private BookView mBookView = new BookView() {
        @Override
        public void onSuccess(Book mBook) {
            tvInfo.setText(mBook.toString());
        }

        @Override
        public void onError(String result) {
            Toast.makeText(MainActivity.this,result
            ,Toast.LENGTH_SHORT).show();
        }
    };


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBookPresenter.onStop();
    }
}
