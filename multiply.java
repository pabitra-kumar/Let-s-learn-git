import javax.swing.*;
public class multiply {
    public static void main(String[] args) {
        int a,b;
       a=Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
       b=Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
       int c= a*b;
       System.out.println("Sum of two number is : "+a+"*"+b+" = "+c);
    }
}
