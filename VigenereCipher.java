/*package com.company;

class VigenereCipher {


   // This function generate the key in a cyclic manner
   // until its length isn't equal to the length of the original text

    public String generateKey(String str, String key) {
        int x = str.length();

        for (int i = 0; ; i++)
        {
            if (x == i) {
                i = 0;
            }
            if (key.length() == str.length()) {
                break;
                key += (key.charAt(i));
            }
            return key;

        }

//this function returns the encrypted text
//generate with the help of the key

        public String cipherText(String str, String key)
        {
            String textToCipher = "";

            for (int i = 0; i < str.length(); i++)
            {
                //convert in range 0-25
                int x = (str.charAt(i) + key.charAt(i)) %26;

                //convert into alphabets (ASCII)
                x += 'A';
                textToCipher += (char)(x);
            }
            return textToCipher;
        }
        //this function will convert the lowercase characters to upper case
        public String originalText(String textToCipher, String key)
        {
            String origText = "";

            for (int i = 0; i < textToCipher.length() && i < key.length(); i++)
            {
                //converting in range 0-25
                int x = (textToCipher.charAt(i) - key.charAt(i)+26)%26;

                //convert into alphabets (ASCII)
                x += 'A';
                originalText += (char)(x);
            }
            return originalText;

            //this function will convert the lower case character to upper case
public String LowerToUpper(String low)
            {
                StringBuffer str = new StringBuffer(low);
                for (int i = 0; i < low.length(); i++)
                {
                if(Character.isLowerCase(low.charAt(i)))
                {
                    str.setCharAt(i, Character.toUpperCase(low.charAt(i)));
                }
                }
                low = str.toString();
                return low;
            }

            //driver code put in main
            String str "geesforgeeks"
            String keyword = "ayush";
            str = LowerToUpper(Str);
            String keyword = LowerToUpper(keyword);

            String key = generateKey (str, keyword);
            String textToCipher = cipherText(str, key);

            System.out.println("Ciphertext :" + textToCipher + "\n");
            System.out.println("original/decrypted text : " + originalText(textToCipher, key));

        }

    }
}
*/