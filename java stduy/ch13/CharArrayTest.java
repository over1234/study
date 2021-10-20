package ch13;

public class CharArrayTest {
    public static void main(String[] args)
    {
        char word[] = new char[26];

        for(int i = 0; i < word.length; i++) {
            word[i] = (char) (65 + i);
        }

        for(char a : word)
        {
            System.out.println(a+ " ");
        }
        
    }
}
