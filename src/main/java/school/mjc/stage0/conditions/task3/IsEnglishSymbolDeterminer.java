package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
     
        if ((symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z')) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }

    public static void main(String[] args) {
        IsEnglishSymbolDeterminer determiner = new IsEnglishSymbolDeterminer();

        determiner.isEnglishSymbol('A');
        determiner.isEnglishSymbol('8');
    }
}

