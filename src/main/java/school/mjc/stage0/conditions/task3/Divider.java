package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        if (number == 0) {
            System.out.println("Cannot divide by zero");
        } else if (number % 5 == 0 && number % 11 == 0) {
            System.out.println("Dividable");
        } else {
            System.out.println("Non-dividable");
        }
    }

    public static void main(String[] args) {
        Divider divider = new Divider();

        divider.isDividableBy5And11(55);    
        divider.isDividableBy5And11(30);   
        divider.isDividableBy5And11(0);     
    }
}
