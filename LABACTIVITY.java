/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coursework;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class LABACTIVITY {
    
    public static void main(String[]args){
        int PIN;
        Scanner scn= new Scanner(System.in);
        System.out.println("WELCOME TO XYZ BANK" );
        System.out.println("SELECT YOUR MOST PREFFERABLE ACCOUNT");
        System.out.println("9001 REGULAR ACCOUNT");
        System.out.println("9002 INTEREST ACCOUNT");
        System.out.println("9003 CHECK IN ACCOUNT");
        System.out.println("9004 CD ACCOUNT");
        System.out.println("PLEASE ENTER PIN");
        PIN=scn.nextInt();
        if (PIN==9001){
            System.out.println("REGULAR ACCOUNT");
            System.out.println("10% Of Balance at The End Of The Month");
            System.out.println("Zero Interest Rate");
            System.out.println("Penalty Of 10.00 When The Balance Goes Below Minimum Of 50000.00");
          }
        else if(PIN==9002){
            System.out.println("INTEREST ACCOUNT");
            System.err.println("Charges are 10% of The Balance At The End Of The Month");
            System.out.println("7% is Paid Monthly");
            System.out.println("There Is No Minimum Balance");
               }
        else if (PIN==9003){
            System.out.println("CHECK IN ACCOUNT");
            System.out.println("Same Charges");
            System.out.println("The Annual Interest Is 7% Paid Monthly");
            System.out.println("Penalty Of 10.00 If Balance Falls Below 10000.00");
            System.out.println("Charges Of 0.10 for each Transaction"); 
        }
        else if(PIN==9004){
            System.out.println("CD ACCOUNT");
            System.out.println("Charges Are 10% Of The Balance");
            System.out.println("Interest Of 15%");
            System.out.println("There Is No Minimum Balance");
            System.out.println("Penalty is 20% Of The Current Balance if You Withdraw Before 12Months00");
        }
        else{
            System.err.println("INCORRECT PIN RETRY");
            main(null);
        }
            
        
        
            
    }
        
  
        
    }
    

        