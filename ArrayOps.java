public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {

        boolean flag = false;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if (array[j] == i)
                {
                    flag = true;
                }
            }
            if (!flag)
            {
                return i;
            }
            flag = false;
        }
        // Write your code here:
        return 0;
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
