/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonaccinumber;

/**
 *
 * @author Sanele
 */
// 0 3 3 6 9 15 24 39 63 102


public class FibonacciNumber {

    public static void main(String[] args) {
        
        int n1=0, n2=3, sum=0;
        
        System.out.println(n1+" "+n2);//1
        
        for(int i=2;i<10;i++)
        {
          sum=n1+n2; //0+3
          System.out.println(" "+sum); // 0 3 3 6 9 15 24 39 63 102
          n1=n2; //3
          n2=sum; //6
        }
    }
}
