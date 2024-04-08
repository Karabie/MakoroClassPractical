/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package makoroclasspractical;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class MakoroClassPractical {

    public static void main(String[] args) {
        
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter Number one"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter Number two"));     
        JOptionPane.showMessageDialog(null,"Sum is: " + (a+b));
        JOptionPane.showMessageDialog(null,"Average: " + ((a + b)/2));//calculate average
        
    }
    
}
