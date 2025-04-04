public class basicBacktracking {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[], int i, int val) {
        // Base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // Recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); // Function call
        arr[i] -= 2; // Backtracking step
    }

    public static void findSubsets(String str, String s, int i) {
        // Base case
        if (i == str.length()) {
            if (s.length() == 0) {
                System.out.println(".");
            } else {
                System.out.println(s);
            }
            return;
        }
        // Recursion
        // Yes choice
        findSubsets(str, s + str.charAt(i), i + 1);
        // No choice
        findSubsets(str, s, i + 1);
    }

    public static void findPermutation(String str, String s) {
        // Base case
        if (str.length() == 0) {
            System.out.println(s);
            return;
        }
        // Recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, s + curr);
        }
    }

    public static void main(String args[]) {

        int arr[] = new int[5];
        // Simple depiction of backtracking
        changeArr(arr, 0, 1);
        printArr(arr);

        String str = "abc";
        System.out.println("Subsets of \"" + str + "\":");
        findSubsets(str, "", 0);

        System.out.println("Permutations of \"" + str + "\":");
        findPermutation(str, "");
    }
}
