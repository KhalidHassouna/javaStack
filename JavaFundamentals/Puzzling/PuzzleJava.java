import java.util.Random ;
import java.util.ArrayList;

public class PuzzleJava{

    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomTenNumbers = new ArrayList<Integer>();
        Random rand = new Random();

        for(int i=1;i<=10;i++){
            randomTenNumbers.add(rand.nextInt(20) + 1);
        }
        return randomTenNumbers ;

    }

    public char getRandomLetter(){
        ArrayList<Character> letters = new ArrayList<Character>();
        for(int i=0; i<26 ; i++){
            letters.add((char)(i+97));
            
        }
    
        
        
        Random rand = new Random();
        return letters.get(rand.nextInt(26) );





    }
    public String generatePassword(){
        String passWord = "";
        for (int i = 0; i<= 8 ; i++){
            passWord = passWord + getRandomLetter() ;
        }
        return passWord ;

    }
    public ArrayList<String> getNewPasswordSet(int length){           ///this code is wrong missed some built-in function
        ArrayList<String> newPassword = new ArrayList<String>();
        for (int i=0; i<=8 ; i++){
            newPassword.add.(generatePassword());
        }
        return newPassword ; 

    }
}
