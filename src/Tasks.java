public class Tasks {
    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] primes1 = {1, 2, 3, 4, 5, 6, 7, 8};
        printReversArray(primes);
        printReversArray(primes1);

        int res = sumOddArray(primes);
        System.out.println(res);
        res = sumOddArray(primes1);
        System.out.println(res);
        res = productAllArrayElementsWithEvenIndices(primes);
        System.out.println(res);
        res = productAllArrayElementsWithEvenIndices(primes1);
        System.out.println(res);

    }

    public static void printReversArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("[" + i + "]= " + arr[i]);
        }
        System.out.println("=================");
    }

    public static int sumOddArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                sum += arr[i];
        }
        return sum;

    }

    public static int productAllArrayElementsWithEvenIndices(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                count *= arr[i];
        }

        return count;
    }


}
