package id.ac.poliban.mi.va.Prima024.simplecalchomework;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Test for simple addition
     */

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }

    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = mCalculator.add(1.111f, 1.111d);
        assertThat(resultAdd, is(closeTo(2.222, 0.01)));
    }

    @Test
    public void subTwoNumbers() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }

    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = mCalculator.sub(1d, 17d);
        assertThat(resultSub, is(equalTo(-16d)));
    }

    @Test
    public void mulTwoNumbers() {
        double resultMul = mCalculator.mul(32d, 2d);
        assertThat(resultMul, is(equalTo(64d)));
    }

    @Test
    public void divTwoNumbers() {
        double resultDiv = mCalculator.div(32d,2d);
        assertThat(resultDiv, is(equalTo(16d)));
    }

    @Test
    public void divTwoNumbersZero() {
        double resultDiv = mCalculator.div(32d,0);
        assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void powTwoPositiveNumber() {
        double resultPow = mCalculator.pow(2,3);
        assertThat(resultPow, is(equalTo(8d)));
    }

    @Test
    public void powNegativeOperand() {
        double resultPow = mCalculator.pow(-2,3);
        assertThat(resultPow, is(equalTo(-8d)));
    }

    @Test
    public void powNegativeSecondOperand() {
        double resultPow = mCalculator.pow(2,-3);
        assertThat(resultPow, is(equalTo(0.125d)));
    }

    @Test
    public void powZeroFirstOperand() {
        double resultPow = mCalculator.pow(0,999);
        assertThat(resultPow, is(equalTo(0d)));
    }

    @Test
    public void powZeroSecondOperand() {
        double resultPow = mCalculator.pow(2,0);
        assertThat(resultPow, is(equalTo(1d)));
    }

    @Test
    public void powZeroFirstOperandAndNegativeOneSecondOperand() {
        double resultPow = mCalculator.pow(0,-1);
        assertThat(resultPow, is(equalTo(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void powNegativeZeroFirstOperandAndNegativeNumberSecondOperand() {
        double resultPow = mCalculator.pow(-0,-2);
        assertThat(resultPow, is(equalTo(Double.POSITIVE_INFINITY)));
    }
}