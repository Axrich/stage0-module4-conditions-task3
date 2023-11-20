package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 or 29 days");  
                break;
            default:
                System.out.println("Incorrect number!");
        }
    }

    public static void main(String[] args) {
        DaysInMonthPrinter daysInMonthPrinter = new DaysInMonthPrinter();

        daysInMonthPrinter.amountOfDays(3);   
        daysInMonthPrinter.amountOfDays(6);  
        daysInMonthPrinter.amountOfDays(2);  
        daysInMonthPrinter.amountOfDays(13);  
    }
}
