package Demo;

import java.util.Scanner;

public class Main {

        Scanner input = new Scanner(System.in);


        // 0 er lagt i starten af String alfabeth, for at opfylde
// at den skal have værdi 0 som ønsket i opgaven
        String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";


        int encrypt(char characterToEncrypt)
        {
            //laver en variable og operationen på en linje
            int number = alphabet.indexOf(characterToEncrypt);

            return number;
        }

        char decryption(int numberToDencrypt)
        {
            char character = alphabet.charAt(numberToDencrypt);
            return character;
        }

    public static void main(String[] args) {
        System.out.println(new Main().encrypt('A'));
        System.out.println(new Main().decryption(1));

    }
}
