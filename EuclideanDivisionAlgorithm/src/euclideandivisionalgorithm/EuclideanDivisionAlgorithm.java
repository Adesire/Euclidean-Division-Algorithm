/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclideandivisionalgorithm;

import euclideandivisionalgorithm.view.EuclideanAlgorithm;
import javax.swing.UIManager;

/**
 *
 * @author desil
 */
public class EuclideanDivisionAlgorithm {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try{
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        }catch(Exception e){
            System.out.println("Error in setting WLAF"+e);
        }
        
        
        Implementation gcd = new Implementation();
        int a=2598;int b=1124;        
       /* if(a<b){
            int temp = a;
            a=b;
            b=temp;
            int answer2 = gcd.algorithm(a,b);
        System.out.println("THE gcd of ("+b+","+a+") = "+answer2);
        }else{
            int answer = gcd.algorithm(a,b);6
        System.out.println("THE gcd of ("+a+","+b+") = "+answer);
        }*/
        gcd.testing(a, b);
        
        gcd.redo(2598,1124);
        
        EuclideanAlgorithm view = new EuclideanAlgorithm();
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        
        
    }
    
}
