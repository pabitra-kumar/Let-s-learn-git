import javax.swing.*;
public class sum1 extends sum  {
    public static void main(String[] args) {
        sum n= new sum();
        int a,b;
       a=Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
       b=Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
       System.out.println("Sum of two number is : "+a+"+"+b+"="+n.summation(a,b));
    }
}
