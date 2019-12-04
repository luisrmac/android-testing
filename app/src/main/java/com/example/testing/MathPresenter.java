package com.example.testing;

public class MathPresenter implements MathContract.Presenter {

    private Calculator calculator;
    private final MathContract.View view;
    int result;

    MathPresenter(MathContract.View view) {
        this.view = view;
        calculator = new AndroidCalculator();
    }

    @Override
    public void add(int a, int b) {
        result = calculator.sum(a,b);
        view.showResult(result);
    }

    @Override
    public void subtract(int a, int b) {
        view.showResult(calculator.subtract(a, b));
    }

    @Override
    public void multiply(int a, int b) {
        view.showResult(calculator.multiply(a,b));
    }

    @Override
    public void divide(int a, int b) {
        try {
            view.showResult(calculator.divide(a, b));
        } catch (IllegalArgumentException e) {
            view.showError(e.getMessage());
        }
    }
}
