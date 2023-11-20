package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if (second != 0 && first % second == 0) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not Aliquot");
        }
    }

    public static void main(String[] args) {
        AliquotNumbers aliquotNumbers = new AliquotNumbers();
       
        aliquotNumbers.isFirstAliquot(10, 5);  
        aliquotNumbers.isFirstAliquot(15, 7);  
        aliquotNumbers.isFirstAliquot(20, 0);  
    }
}
