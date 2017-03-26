/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

/**
 *
 * @author student
 */
public class TestRel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int x =99;
         int y =100;
         System.out.println("x>y ="+ (x>y));
         System.out.println("x<y ="+ (x<y));
         System.out.println("x>=y ="+ (x>=y));
         System.out.println("x<=y ="+ (x<=y));
         System.out.println("x==y ="+(x==y));
         System.out.println("x!=y ="+(x!=y));
         if(x>y){
             System.out.println("x大於y");
         } else{
             System.out.println("x小於或等於y");
         }
         if(x>0 && y >0){
             System.out.println("x,y都大於0");
         } 
         if(x<0 && y <0){
             System.out.println("x,y都小於0");
         }
         if(x>0 || y>0){
             System.out.println("x大於0或y大於0");
         }
         if(! (x>y)){
             System.out.println("x沒有大於y");
         }
         
    }
    
}
