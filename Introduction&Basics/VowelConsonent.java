//Write a Java program to check whether a character is a vowel or consonant.
public class VowelConsonent{
    public static void main(String[]args)
    {
        char alphabet='K';
        alphabet=Character.toLowerCase(alphabet);
        if(alphabet>='a' && alphabet<='z')
        {
            if(alphabet=='a' || alphabet=='e' || alphabet=='i' ||   alphabet=='o' ||alphabet=='u')
            {
            System.out.println("Vowel");
            }

            else
            {
                System.out.println("Consonent");
            }

    }
}
}