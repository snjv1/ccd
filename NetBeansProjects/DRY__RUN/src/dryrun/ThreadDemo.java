/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dryrun;

/**
 *
 * @author sanje
 */
class ThreadDemo {
     public void m1(int i, float j){
        System.out.println("float");
    }
    public void m1(float f , int i ){
        System.out.println("float in method");
    }
    public static void main(String[] args) {
        ThreadDemo s= new ThreadDemo();
        s.m1(20,20);
    }
   
}

