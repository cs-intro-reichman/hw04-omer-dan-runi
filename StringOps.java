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
        int charInt;
        char currentChar;
        for (int i = 0; i < string.length(); i++)
        {
            charInt = (int) string.charAt(i);

            // Checking if the letter is Caps
            if (charInt < 90 && charInt > 65)
            {
                // Diff in the ASCII table between lower and upper
                charInt += 32;
            }
            currentChar = (char) charInt;

            switch (currentChar)
            {
                case 'a': capsVow = capsVow + "A"; break;
                case 'e': capsVow = capsVow + "E"; break;
                case 'i': capsVow = capsVow + "I"; break;
                case 'o': capsVow = capsVow + "O"; break;
                case 'u': capsVow = capsVow + "U"; break;

                default: capsVow = capsVow + currentChar;
            }
        }

        return capsVow;
    }

    public static String camelCase (String string) {
        // Write your code here:
        String camString = "";
        boolean newWord = false;
        boolean firstWord = true;
        int charInt;
        char currentChar;

        for (int i = 0; i < string.length(); i++)
        {
            charInt = (int) string.charAt(i);

            if (string.charAt(i) != ' ')
            {
                if (firstWord)
                {
                    if (charInt < 90 && charInt > 65)
                    {
                        charInt += 32;
                    }
                    currentChar = (char) charInt;

                    camString = camString + currentChar;

                    if ((i < string.length() + 1) && (string.charAt(i + 1) == ' '))
                    {
                        firstWord = false;
                    }
                }
                else
                {
                    // Checking if the letter is Caps
                    if (charInt < 90 && charInt > 65)
                    {
                        // Caps on new word
                        if (newWord)
                        {
                            newWord = false;
                        }
                        else
                        {
                            // Diff in the ASCII table between lower and upper
                            charInt += 32;
                        }
                    }
                    else
                    {
                        if (newWord)
                        {
                            charInt -= 32;
                            newWord = false;
                        }
                    }
                    
                    currentChar = (char) charInt;
                    camString = camString + currentChar;
                }
            }
            else if (!firstWord)
            {
                newWord = true;
            }
        }

        return camString;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int indexCount = 0; 
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == chr)
            {   
                indexCount++;
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
