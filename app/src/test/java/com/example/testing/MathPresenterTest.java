package com.example.testing;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.Any;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathPresenterTest {

    private MathPresenter presenter;

    // These are our Mock candidates
    @Mock
    Calculator calculator;
    @Mock
    MathContract.View view;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        presenter = new MathPresenter(view);
    }

    @Test
    public void add() {
        // verify that we interacted with the calculator
        when(calculator.sum(anyInt(), anyInt())).thenReturn(anyInt());
        // perform the operation
        presenter.add(2, 2);
        // Verify that the result is given to the view
        verify(view).showResult(anyInt());
    }

    @Test
    public void subtract() {
        // verify that we interacted with the calculator
        when(calculator.subtract(anyInt(), anyInt())).thenReturn(anyInt());
        // perform the operation
        presenter.subtract(2, 2);
        // Verify that the result is given to the view
        verify(view).showResult(anyInt());
    }

    @Test
    public void multiply() {
        // verify that we interacted with the calculator
        when(calculator.multiply(anyInt(), anyInt())).thenReturn(anyInt());
        // perform the operation
        presenter.multiply(2, 2);
        // Verify that the result is given to the view
        verify(view).showResult(anyInt());
    }

    @Test
    public void divide() {
        // verify that we interacted with the calculator
        when(calculator.divide(anyInt(), anyInt())).thenReturn(anyInt());
        // perform the operation
        presenter.divide(2, 2);
        // Verify that the result is given to the view
        verify(view).showResult(anyInt());
    }

    @Test
    public void divideShouldThrowException() {
        when(calculator.divide(anyInt(), anyInt()))
                .thenThrow(new IllegalArgumentException());
        presenter.divide(2,0);
        verify(view).showError(anyString());
    }

}