/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.risentertainment.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author lequa
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20};
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}};
        int c[][] = {{1, 0},
        {1, 1},
        {2, 2},
        {6, 3},
        {24, 4},
        {120, 5}};

        return new Integer[][]{{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}};
        // ta phải map 2 cột của từng dòng vào ???
        //Assert.assertEqual(cột 0, MathUtil.getFactorial(cột 1))
    }
    @Parameterized.Parameter(value = 0)
    public long expected;

    @Parameterized.Parameter(value = 1)
    public int n;

    @Test //fill data và gọi hàm so sánh
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}
