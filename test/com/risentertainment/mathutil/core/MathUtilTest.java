/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.risentertainment.mathutil.core;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author lequa
 */
public class MathUtilTest {

    // class nay ta sẽ viết các đoạn code như bình thường nhưng code này dùng để test cái code chính bên mathUtil
    // viết code để tét code chính thì cái đoạn code này là test scrip => được vuieets ra để tét các code khác
    // những code này sẽ gọi các hàm bên code chính và test các giá trị cần test với giá trị kỳ vọng 
    // những đoạn code này phải bao gồm các test case 
    // test scip chứa các test case 
    @Test // @Test được gọi là annotation kí hiệu , flag để đánh dấu đoạn code mang 1 ý nghĩa nào đó 
    // complier tự generate thành public static void main() 
    // kĩ thuật dùng thư viện, bí ép phải theo cú pháp của nó qua những @, gọi là framework
    // FW: là thư viện ép người dùng sài theo cách của nó , theo đúng khung code mà nó quy ước
    // thư viện: jar.dll ta thoải mái dùng hàm của nó theo cách của ta
    public void testFactorialGivenRightArgumentReturnsWell() {
        // tên hàm test bao hàm luôn ý nghĩa test cái gì 
        // quy ước dân kiểm thử
        // hàm này tui muốn test hàm giai thừa khi đưa tham số đúng 
        // mày phải trả về đúng , viết code phải theo quy tắc - CODING CONVENTION
        //Test case #1: kiểm thử tình huống 0! 
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);
        
        
       Assert.assertEquals(2, MathUtil.getFactorial(2));
    }
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        Assert.assertEquals(720, MathUtil.getFactorial(6));
    }
@Test(expected = IllegalArgumentException.class)
// khi chạy hàm này kiểm tra dùm xem có obj nào thuộc class Ille.. không
// nếu nó xuất hiện sẽ đc new ở đâu đó
// hàm getF() được thiết kế trả về con long nếu n đưa vào 0..20
// hàm getF() được thiết kế ra exception nếu ta đưa vào N < 0 || N > 20
//đưa cà chớn nhận ngoại lệ
public void testFactorialGivenWrongArgumentThrowException(){
    MathUtil.getFactorial(-5);
}
    @Test
    public void tryJUnitFirst() {

        Assert.assertEquals(0, 0);

    }
//DDT: data driven testing
    //tách bộ data , kiểm thử ra 1 chỗ
    // fill vào chỗ kiểm thử
    // Assert.assertEquals(???, MathUtil.getFactorial(???));
    // code gọn hơn, đẹp hơn , dễ bảo trị hơn, kiểm soát đủ thiếu các case =? PARAMETERIZED
    /*
    1  1
    2  2
    3  6
    4  24
    5  120
    [] []
    */
}
