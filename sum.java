import javax.swing.JOptionPane;


public class sum{
    public static void main(String args[]) {
       int a,b;
       a=Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
       b=Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
       int c= a+b;
       System.out.println("Sum of two number is : "+a+"+"+b+"="+c);


    }
    public int summation(int a, int b)
    {
        return a+b;
    }
}