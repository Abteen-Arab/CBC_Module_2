public class main {
    public static void main(String[] args) {
        int[] boo = {0, 1, 2, 3, 4};

        int[] testVarName = new int[100];
        for (int i = 0; i < 100; i++) {
            testVarName[i] = i;
        }

        System.out.println("The number of even numbers in boo is:\n" + countEvenNum(boo, 5));
        System.out.println("The number of even numbers in testVarName is:\n" + countEvenNum(testVarName, 100));
    }

    private static int countEvenNum(int[] arr, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}