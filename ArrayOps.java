public class ArrayOps {
    public static void main(String[] args) {
    }
    
    // TODO: will return wrong answer for findMissingInt(new int[] {0,1,2}); should be 3
    public static int findMissingInt (int [] array) {

        boolean flag = false;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if (array[j] == i)
                {
                    // TODO: you can return i here allready, then you will not need the rest of the code
                    flag = true;
                }
            }
            if (!flag)
            {
                return i;
            }
            flag = false; // TODO: not need this anyway
        }
        return 1;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max, secMax;

        if (array[0] > array[1])
        {
            max = array[0];
            secMax = array[1];
        }
        else
        {
            secMax = array[0];
            max = array[1];
        }

        for (int i = 2; i < array.length; i++)
        {
            if (array[i] > max)
            {
                secMax = max;
                max = array[i];
            }
            else if (array[i] > secMax)
            {
                secMax = array[i];
            }
        }
        return secMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        boolean flag = false;
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if (array1[i] == array2[j])
                {
                    flag = true;
                }
            }
            if (!flag)
            {
                return false;
            }
            flag = false;
        }

        // TODO: you repeat your code. It's not good practice. Can make helper function
        for (int j = 0; j < array2.length; j++)
        {
            for (int i = 0; i < array1.length; i++)
            {
                if (array1[i] == array2[j])
                {
                    flag = true;
                }
            }
            if (!flag)
            {
                return false;
            }
            flag = false;
        }

        return true;
    }

    // TODO: nice solution
    public static boolean isSorted(int [] array) {
        // Write your code here:
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < array.length - 1; i++)
        {
            // if there is an increase
            if (array[i] > array[i+1])
            {
                increasing = false;
            }

            // if there is a decrease
            if (array[i] < array[i+1])
            {
                decreasing = false;
            }
        }

        boolean res = (increasing || decreasing);
        return res;
    }

}
