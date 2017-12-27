/**
 * 
 * Semester :A171
 * Course:STIW3054
 * Group:A
 * Task:Assignment1
 * Matric:233131
 * Name:Muhammad Amsyar
 */
package com.uum._a1;


import java.io.File;
//import java.util.ArrayList;
//import java.util.Collection;

public class Assignment_1_RT{
   
   
    
    public static void main(String[] args) {

        File f = new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\233131_A1\\test\\Assignment1");
        Keyword k = new Keyword(f);        
        int num ;
        Count c = new Count();
        num = c.count(f);
        System.out.println("Number of java file :" + num);
        System.out.println("Number of issues :" + k.calculate);
    }



}