import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();


        ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);

        char randomletter = generator.getRandomLetter();
        System.out.println(randomletter);
        
		String passcode = generator.generatePassword();
        System.out.println(passcode);

        String newPasscode = generator.getNewPasswordSet(8);
        System.out.println(newPasscode);
    
	}
}