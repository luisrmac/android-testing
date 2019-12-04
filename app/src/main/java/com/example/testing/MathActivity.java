package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MathActivity extends AppCompatActivity
implements MathContract.View {

    private MathContract.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MathPresenter(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.add(2, 2);
        presenter.subtract(5,2);
        presenter.multiply(6,5);
        presenter.divide(4,2);
        presenter.divide(4,0);
    }

    @Override
    public void showResult(int result) {
        Toast.makeText(this,
                String.valueOf(result),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this,
                error,
                Toast.LENGTH_SHORT).show();
    }
}
