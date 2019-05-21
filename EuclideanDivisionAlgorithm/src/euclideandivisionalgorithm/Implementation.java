/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclideandivisionalgorithm;

import java.util.ArrayList;

/**
 *
 * @author desil
 */
public class Implementation {
   public static int a,b,u,v;
   static ArrayList<Integer> list1 = new ArrayList<Integer>();
   static ArrayList<Integer> list2 = new ArrayList<Integer>();
   static ArrayList<Integer> list3 = new ArrayList<Integer>();
   static ArrayList<Integer> list4 = new ArrayList<Integer>();
   
   int myA,myB,myQ,myR;
   
    public Implementation(){
        
    }
    public int algorithm(int a,int b){
        this.a = a;
        this.b = b;
        int q=a/b;
        int r=a-(b*q);
        a=(b*q)+r;
        //a=b;r=b;q=a/b;r=a-(b*q);
        if(r!=0){
            //a=b;r=b;q=a/b;r=a-(b*q);
            System.out.println(a+" = "+(b*q)+" + "+r);
            return algorithm(b,r);
        }
        if(r==0){
            return b;
        } 
        return 0;
    }
    
    public void linearity(){
        int d = algorithm(a, b);
    }
    
    public int testing(int a,int b){
        
        int q = a/b;
        int r = a-(b*q);
        a=(b*q)+r;
       //String[] try =;
       int i = 10;
        while(r!=0){
            /*int temp1=a;//int temp2=b;
            a=b;b=r;q=a/b;
           // System.out.println(a+" = "+(b*q)+" + "+r);*/
            int myA,myB,myQ,myR;
            this.myA=a;
            this.myB=b;
            this.myQ=q;
            this.myR=r;
            
            String eqn = a+" = "+b+"("+q+")"+" + "+r;
            //list.add(eqn);
            list1.add(a);
            //System.out.println(eqn);
            return testing(b, r);
        }
        if(r!=0){
            System.out.println("The gcd is "+b);
            //return b;
            for(int x: list1){
                System.out.println(x);
        }
        }
        
        return 0;
    }
    
    
    public void redo(int a,int b){
        //FOR A     FOR B
        int x=0;   int x1=1;
        int y =1;  int y1=0; int temp;
        
        while(b!=0){ 
         int q = a/b;
         int r = a-(b*q);
         a=b;
         b=r;
         temp = x;
         x = x1-(q*x);
         x1 = temp;
        
         temp = y;
         y = y1 - (q*y);
         y1 = temp;
         System.out.println("X : "+x1+" Y : "+y1);
        }
        u=x1;v=y1;
        //return "X : "+x1+" Y : "+y1);
    }
   
}
