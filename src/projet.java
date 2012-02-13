
package ex2jframe;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class Ex2JFrame extends JFrame implements ActionListener
{
      private JPanel pan;
       private JButton [] boutons ;
      private boolean[] boutSelec ;
      private JButton b; private JButton bb;
      int com=0;      
     int nBoutMax=20;
      static Scanner s =new Scanner(System.in);
     
   Ex2JFrame(){ 
    setTitle ("Creation - suppression de boutons (maxi " + nBoutMax + ")") ;
      setSize (500, 180) ;
      Container contenu = getContentPane() ;
    b = new JButton ("CREATION") ;
    contenu.add (b, "North") ;
    b.addActionListener (this) ;
    bb = new JButton ("SUPPRESSION") ;
    contenu.add (bb, "South") ;
    bb.addActionListener (this) ;
    pan = new JPanel () ;
    contenu.add (pan);
    pan.setLayout(new FlowLayout());
     boutons = new JButton [nBoutMax] ;
     boutSelec = new boolean [nBoutMax] ;
         
   }
    public static void main(String[] args) {
        
      
        Ex2JFrame f = new Ex2JFrame();
        //ImageIcon image = new ImageIcon("book.gif");
         // f.setIconImage(image.getImage());
          f.setSize(400,250);
          f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source=ae.getSource();
        if(source==b){
         
            boutons[com] = new JButton ("BOUTON " + (com+1)) ;
            boutons[com].setBackground (Color.yellow) ;
            boutSelec[com] = false ;
            pan.add (boutons[com]) ;
            boutons[com].addActionListener (this) ;
             pan.validate(); // pour forcer le recalcul par le gestionnaire

             com++;
        }
        else{
         if(source==bb){
             for(int i=0;i<com;i++){
                if(boutSelec[i] ){
                    pan.remove(boutons[i]);
             pan.validate(); // pour forcer le recalcul par le gestionnaire

             com--;
        }
         }}}
   for(int i=0;i<com;i++)
        { 
       if (source == boutons[i])
       if (boutSelec[i])
    { boutSelec[i] = false ;
    boutons[i].setBackground(Color.yellow) ;
    }
   else
    { boutSelec[i] = true ;
      boutons[i].setBackground (Color.red) ;
}
}
}}

