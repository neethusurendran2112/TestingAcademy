package Tasks.Stringdemo;

public class Maxvaluearr {
    public static void main(String[] args) {
        int arr[] = {1, 5, 67, 98, 34,43};
        int temp;
        int maxi = findmax(arr);
        int min = findmin(arr);
        System.out.println(maxi);
        System.out.println(min);
    }

    private static int findmax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    private static int findmin(int[] arr)
    {
        int min  = arr[0];
        for (int i = 1; i<arr.length;i++)
        {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

}

