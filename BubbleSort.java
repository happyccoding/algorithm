/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javademo;

import java.lang.*;
import java.util.*;

/**
 *
 * @author Hyunm
 */
public class JavaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrNumbers[] = { 13, 24, 5, 1, 2, 40, 30, 11 };
        
        bubbleSort(arrNumbers);
        
        for (int i=0; i < arrNumbers.length; i++) {
            System.out.println((arrNumbers[i]));
        }
        
    }
    
    public static void bubbleSort(int[] arr) {        
        int curIndex = arr.length;
        int tmpNumber = 0;
        while (curIndex>0) {
            for (int i=0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    tmpNumber = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmpNumber;
                }
            }
            curIndex--;
        }
    }    
}

