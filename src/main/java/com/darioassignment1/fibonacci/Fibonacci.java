/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.darioassignment1.fibonacci;
import java.util.Scanner;
/**
 *
 * @author darioperez
 */
public class Fibonacci {
    private static long[]fibonacchiCache;
    
    public static void main(String[] args) {
        // The Fibonacci sequence is the series of numbers where each number is the sum of the two preceding numbers. For example, 0, 1, 1, 2, 3, 5, 8, 13, 21
        
        //getting input from user
        Scanner scanner = new Scanner(System.in);
        
       
        int n;
                
        System.out.println("Please enter between 1 and 92:");
        n = scanner.nextInt();
        
        System.out.println("The fibinacchi sequeunce of" + " " + n + " is :");
        //int n = 13;
        
        //declaring Cache method prevent method from crashing
        fibonacchiCache = new long[n + 1];
        
        //declaring method
        for(int i = 0; i <= n; i++){
            System.out.println(fibonacchi(i));
        }
    }
    // creating method for calculating fib seq
    
    private static long fibonacchi(int n){
    
        if(n <= 1){
            return n;
        }
        //saving results
        if (fibonacchiCache[n] != 0){
            return fibonacchiCache[n];
        }
        //checking for fib seq 
        long nthFibanacciNumber = (fibonacchi(n-1) + fibonacchi(n -2));
        fibonacchiCache[n] = nthFibanacciNumber;
        
        return nthFibanacciNumber;
    }
}
