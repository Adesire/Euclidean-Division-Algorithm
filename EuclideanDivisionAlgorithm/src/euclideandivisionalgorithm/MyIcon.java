/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclideandivisionalgorithm;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author desil
 */
public class MyIcon {
    public MyIcon(){
        
    }
    public Image getIconImage(){
        
        ImageIcon LogoImage2=new ImageIcon(getClass().getResource("/euclideandivisionalgorithm/images/ITgcd.gif"));
        
        return LogoImage2.getImage();
    }
}
