package com.example.testing;

public interface MathContract {

    interface View {
        void showResult(int result);
        void showError(String error);
    }

    interface Presenter {
        void add(int a, int b);
        void subtract(int a, int b);
        void multiply(int a, int b);
        void divide(int a, int b);
    }
}
