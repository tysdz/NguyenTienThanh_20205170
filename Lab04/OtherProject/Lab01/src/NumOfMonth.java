import java.util.Scanner;

public class NumOfMonth {
    public static void main(String[] strings) {
        int numOfMonth = 0;
        String month;
        int year;

        System.out.print("Input month: ");
        Scanner keyboard = new Scanner(System.in);
        month = keyboard.nextLine();

        System.out.print("Input year: ");
        year = keyboard.nextInt();

        switch (month) {
            case "January": case "Jan.": case "Jan": case "1":
                numOfMonth = 31;
                break;
            case "February": case "Feb.": case "Feb": case "2":
                if (checkLeapYear(year))
                    numOfMonth = 29;
                else
                    numOfMonth = 28;
                break;
            case "March": case "Mar.": case "Mar": case "3":
                numOfMonth = 31;
                break;
            case "April": case "Apr.": case "Apr": case "4":
                numOfMonth = 30;
                break;
            case "May": case "5":
                numOfMonth = 31;
                break;
            case "June": case "Jun": case "6":
                numOfMonth = 30;
                break;
            case "July": case "Jul": case "7":
                numOfMonth = 31;
                break;
            case "August": case "Aug.": case "Aug": case "8":
                numOfMonth = 31;
                break;
            case "September": case "Sep": case "Sep.": case "9":
                numOfMonth = 30;
                break;
            case "October": case "Oct.": case "Oct": case "10":
                numOfMonth = 31;
                break;
            case "November": case "Nov.": case "Nov": case "11":
                numOfMonth = 30;
                break;
            case "December": case "Dec.": case "Dec": case "12":
                numOfMonth = 31;
                break;
            default:
                System.out.println("Invalid value!\nTry again");
        }
        System.out.println("This month has " + numOfMonth + " days");
        keyboard.close();
    }

    public static boolean checkLeapYear(int year) {
        boolean isLeapYear = year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0);
        return isLeapYear;
    }
}
