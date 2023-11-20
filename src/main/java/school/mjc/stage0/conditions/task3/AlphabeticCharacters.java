package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
       
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
           
            char lowercaseChar = Character.toLowerCase(character);

            if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i'
                    || lowercaseChar == 'o' || lowercaseChar == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Wrong alphabet!");
        }
    }

    public static void main(String[] args) {
        AlphabeticCharacters alphabetCharacters = new AlphabeticCharacters();

        alphabetCharacters.vowelDeterminer('A');  
        alphabetCharacters.vowelDeterminer('b');  
        alphabetCharacters.vowelDeterminer('3');   
    }
}
