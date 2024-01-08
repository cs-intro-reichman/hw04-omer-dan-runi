public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String capsVow = "";
        for (int i = 0; i < string.length(); i++)
        {
            switch (string.charAt(i))
            {
                case 'a': capsVow = capsVow + "A"; break;
                case 'e': capsVow = capsVow + "E"; break;
                case 'i': capsVow = capsVow + "I"; break;
                case 'o': capsVow = capsVow + "O"; break;
                case 'u': capsVow = capsVow + "U"; break;
                default: capsVow = capsVow + string.charAt(i);
            }
        }

        return capsVow;
    }

    public static String camelCase (String string) {
        // Write your code here:
        String camString = "";
        boolean newWord = true;
        int charInt;
        char charBack;

        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) != ' ')
            {

                charInt = (int) string.charAt(0);

                // Checking if the letter is Caps
                if (charInt < 90 && charInt > 65)
                {
                    // Diff in the ASCII table between lower and upper
                    charInt -= 32;
                }
                // Caps on new word
                if (newWord)
                {
                    charInt += 32;
                    newWord = false;
                }

                charBack = (char) charInt;
                camString = camString + charBack;
            }
            else
            {
                newWord = true;
            }
        }

        return camString;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int indexCount = 0; 
        String checkingString = string;
        for (int i = 0; i < string.length(); i++)
        {
            if (checkingString.indexOf(chr) == i)
            {   
                indexCount++;
                checkingString = checkingString.substring(i);
            }
        }

        int [] indexes = new int[indexCount];
        int current = 0;

        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == chr)
            {
                indexes[current] = i;
                current++;
            }
        }

        return indexes;
    }
}
