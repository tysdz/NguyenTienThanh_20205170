import javax.swing.JOptionPane;

public class CaculateTwoDoubleNumber {
    public static void main(String[] args){
        String strNum1,strNum2;
        String strNotification = "You 've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null,
                "Please enter first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,
                "Please enter first number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        System.out.println("The sum of two num is "+ (num1+num2) + "!");
        System.out.println("The difference, of two num is "+ (num1-num2) + "!");
        System.out.println("The product of two num is "+ (num1*num2) + "!");
        if (num2 == 0){
            System.out.println("The quotient of two num is error !");
        }
        else
            System.out.println("The quotient of two num is "+ (num1/num2) + "!");

        System.exit(0);
    }
}
