import javax.swing.JOptionPane;


public class sum{
    public static void main(String args[]) {
       int a,b;
       a=Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
       b=Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
       System.out.println("Sum of two number is : "+a+"+"+b+"="+(a+b));


    }
}