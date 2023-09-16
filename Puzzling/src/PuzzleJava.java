import java.util.Random;
public class PuzzleJava {
    public static int getTenRolls(){
        
        Random randMachine = new Random();
        int arr[] = new int[10];
        for (int i=0; i<arr.length; i++){
            arr[i] = randMachine.nextInt(20);
        }
        for (int i=0; i<arr.length; i++){
           System.out.println(arr[i]);
        }
        return 1;
    }
    public static String generatePassword() {
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            char randomLetter = getRandomLetter();
            randomString.append(randomLetter);
        }
        return randomString.toString();
    }
    public static String generatePassword(int num) {
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < num; i++) {
            char randomLetter = getRandomLetter();
            randomString.append(randomLetter);
        }
        return randomString.toString();
    }
    public static char getRandomLetter() {
        char[] alphabet = new char[26];
        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabet[letter - 'a'] = letter;
        }
        
        Random random = new Random();
        int randomIndex = random.nextInt(26);
        
        return alphabet[randomIndex];
    }
    
    public static void main(String[] args) {
        int randomNumber = getTenRolls();
        System.out.println(randomNumber);
        char randomLetter = getRandomLetter();
        System.out.println("Random letter: " + randomLetter);
        String randomPassword = generatePassword();
        System.out.println("Random Password: " + randomPassword);
        String randomPasswordByNum = generatePassword(15);
        System.out.println("Random Password by Number: " + randomPasswordByNum);


    }
}
