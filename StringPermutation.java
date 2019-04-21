import java.util.Scanner;

//acmicpc2016 - B

public class StringPermutation {
    public static void main(String[] args) {
        int test_case;
        String input_char;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        test_case = scanner.nextInt();
        System.out.print("\n");

        while(test_case>0) {
            System.out.print("Enter characters: ");
            input_char = scanner.next();
          //  System.out.print("\n");

            int n = input_char.length();
            StringPermutation permutation = new StringPermutation();
            permutation.permute(input_char, 0, n - 1);
            test_case--;
        }
    }

    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */

    private void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}



