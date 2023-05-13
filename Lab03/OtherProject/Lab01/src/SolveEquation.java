import javax.swing.JOptionPane;
import java.util.*;
import java.lang.Math;
public class SolveEquation {
    public static void main(String[] args)
    {
        int choice;
        double a, b, c, a11, a12, a21, a22, b1, b2;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("\nEnter the choice\n"
                    + "1.The first-degree equation (linear equation) with one variable: a*x + b = 0\n"
                    + "2.The system of first-degree equations (linear system) with two variables: (a11*x1 + a12*x2 = b1) and (a21*x1 + a22*x2 = b2)\n"
                    + "3.The second-degree equation with one variable: a*x^2 + b*x + c = 0\n"
                    + "0. Exit the program\n");
            choice = sc.nextInt();
            if (choice == 1)
            {
                System.out.print ("Enter a (different from 0) and b: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                double x = -b/a;
                System.out.print("\n\tResult: x = " + x + '\n');
            }
            else if (choice == 2)
            {
                System.out.print ("Enter a11 a12 b1 a21 a22 b2: ");
                a11 = sc.nextDouble();
                a12 = sc.nextDouble();
                b1 = sc.nextDouble();
                a21 = sc.nextDouble();
                a22 = sc.nextDouble();
                b2 = sc.nextDouble();
                double d = a11*a22 - a21*a12;
                double d1 = b1*a22 - b2*a12;
                double d2 = a11*b2 - a21*b1;
                if (d != 0) {
                    System.out.print ("\nResult:\nx1 = " + d1/d + "\tx2 = " + d2/d + '\n');
                }
                else System.out.print ("\nResult:\nThe system has infinitely many solutions\n");
            }
            else if (choice == 3) {
                System.out.print("Enter a(different from 0) b c: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                if (a == 0) {
                    double x = -c/b;
                    System.out.print("\n\tResult: x = " + x + '\n');
                } else {
                    double delta = b * b - a * c * 4;
                    if (delta == 0)
                        System.out.printf("\n\tResult:\nThis equation has one double root: x = " + -b / (a * 2));
                    else if (delta < 0)
                        System.out.printf("\n\tResult:\nThis equation has NO solution\n");
                    else {
                        double x1 = (-b + Math.sqrt(delta)) / (a * 2);
                        double x2 = (-b - Math.sqrt(delta)) / (a * 2);
                        System.out.printf("\n\tResult:\nThis equation has two distinct root: \n\tx1 = " + x1 + " \tand\t x2 = " + x2 + '\n');
                    }
                }
            }
        } while (choice != 0);
    }
}
