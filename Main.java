package com.company;


import java.util.Scanner;

public class Main {
    public static void options()
    {
        System.out.println("please select an option below with 1, 2 or 0 \n 1) encryption \n 2) decryption \n 0) exit the program"  );
        String optionNumber = GetString();

        if(optionNumber.equals("1"))
        {
            System.out.println("welcome to the encryption menu");
            chooseEncryption();
        }
       else if(optionNumber.equals("2"))
        {
            System.out.println("welcome to the decryption menu");
           //decrypt();
        }
        else if(optionNumber.equals("0"))
        {
            System.out.println("thank you for using our services");

        }
        else
        {
            String inputNumber = GetString();
            boolean startLoop = true;
            int s = 0;
            while(startLoop)
            {
                if(inputNumber.matches("0|1|2|3" ))
                {
                    startLoop = false;
                    s = Integer.parseInt(inputNumber);
                }
                else
                {
                    System.out.println("please enter a number between 0 and 3");
                    inputNumber = GetString();
                }
            }

        }
    }


    public static void chooseEncryption()
    {
        System.out.println("please choose your encryption method");
        System.out.println("press 1 for Ceacar, press 2 for Vigenère or 0 to go back to the previous menu");
        if(GetString().equals(1))
        {
            encryptCeacer();
        }
        else if(GetString().equals(2))
        {
            //todo insert Vigenère code part
        }
        else if(GetString().equals(0))
        {
            options();
        }
        else
        {
            boolean loopEncryptionChoise = true;
            while(loopEncryptionChoise)
            {
                System.out.println("please choose an option \n 1 for ceacar \n 2 for Vigenère \n 0 to return to previous menu");
                loopEncryptionChoise = true;
                GetString();
            }
        }
    }


    public static String GetString()
    {
        Scanner input = new Scanner(System.in);
        ;
        String inputString = input.nextLine();
        return inputString;
    }

    //encrypts text using a shift od s
    public static StringBuffer encryptCeacer(String inputString, int s)
    {

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < inputString.length(); i++)
        {
            if (Character.isUpperCase(inputString.charAt(i)))
            {
                char ch = (char)(((int)inputString.charAt(i) + s -65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)inputString.charAt(i)+ s -97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }


        public static StringBuffer decrypt(String inputString, int s)
        {

            StringBuffer resultDecrypt = new StringBuffer();

            for (int i = 0; i < inputString.length(); i++)
            {
                if (Character.isUpperCase(inputString.charAt(i)))
                {
                    char ch = (char)(((int)inputString.charAt(i) + s +65) % 26 - 65);
                    resultDecrypt.append(ch);
                }
                else
                {
                    char ch = (char)(((int)inputString.charAt(i)+ s +97) % 26 - 97);
                    resultDecrypt.append(ch);
                }
            }
            return resultDecrypt;
        }

    //Driver code
    public static void main(String[] args) {
        System.out.println("welcome to the cipherMachine, please choose your option");
        options();
        System.out.println("please enter your text to encrypt");
        String input = GetString();
        System.out.println("enter your cipher to shift");
        String inputNumber = GetString();

        boolean ceacer = true;
        int s = 0;
        while(ceacer)
        {
            if(inputNumber.matches("0|1|2|3|4|5|6|7|8|9" ))
            {
                ceacer = false;
                s = Integer.parseInt(inputNumber);
            }
            else
            {
                System.out.println("please enter a number between 0 and 9");
                inputNumber = GetString();
            }
        }

        System.out.println("text : " + input);
        System.out.println("shift : " + s);
        System.out.println("Cipher :" + encryptCeacer(input,s));
        System.out.println("Deciper");



    }

}

//todo do a wrap the whole project with a whileloop to continue asking if someone wants to convert again