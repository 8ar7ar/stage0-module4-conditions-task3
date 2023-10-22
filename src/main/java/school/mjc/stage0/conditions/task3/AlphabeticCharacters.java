package school.mjc.stage0.conditions.task3;


public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

        if (!((character >= 'A' && character <= 'Z')
                || (character >= 'a' && character <= 'z'))){
            System.out.println("wrong alphabet!");}
        else {
            whileLoop:
            while (true){
                for (char c: vowels) {
                    if (c == character) {
                        System.out.println("Vowel");
                        break whileLoop;
                    }
                }
                System.out.println("Consonant");
                break;
            }
        }
    }
}
