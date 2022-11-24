/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.risentertainment.mathutil.core;

/**
 *
 * @author lequa
 */
// ta sẽ clone bộ thư viên công cự mathUtil của JDK
// gia lap cac ham cua class math của jdk
//cong cu nhung gi mà là cong cu dung chi nguoi khac ham khac class khac thi thuong
//se duoc thiet ke lai (static)
// static . truoc tiep qua ten class ,éo có new
public class MathUtil {

    public static final double PI = 3.141592653589793;

    public static long getFactorial(int n) {
        // ham tinh n dai thua 
        // quy uoc: ko cho so am, 0! = 1! = 1
        // 21! vuot 18 so 0 vuot long
        // ham cua chung ta chi chap nhan tinh n! cua n tu 2-20
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalue N, n >= 0, n < 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1; //bien con heo dat, acc: accumulation
        for (int i = 2; i <= n; i++) //tab
        {
            product *= i;
        }
        return product;

    }
}
// ky thuat lap trinh kieu moi van giu nguyen nhubng kien thuc lap trinh da co
// 1 plugin moi viet code cam ket code co chat luong 
// ky thuat TDD - Test driven development => cv
// viet code de test code , moi ham viet ra phai viet ngay test case, phai viet ngay hanh fong kiem thu ham, de biet rang ham vua viet chay sai hay dung
