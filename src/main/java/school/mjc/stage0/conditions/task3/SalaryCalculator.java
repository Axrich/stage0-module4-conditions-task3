package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary >= 0) {
            double taxRate;
            if (salary <= 10000) {
                taxRate = 0.15;
            } else if (salary <= 20000) {
                taxRate = 0.18;
            } else {
                taxRate = 0.20;
            }

            double taxes = salary * taxRate;
            double netSalary = salary - taxes;

            System.out.println("Net Salary after taxes: " + netSalary);
        } else {
            System.out.println("Wrong input!");
        }
    }

    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();

        // Example usage
        calculator.calculateSalary(8000);   
        calculator.calculateSalary(18000);  
        calculator.calculateSalary(21000); 
        calculator.calculateSalary(-300);   
    }
}
