package Lec7;

public class Merge {
    public static void merge(int[] arr1,int[] arr2)
    {
        //time complexity -> o(n1 + n2)
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr = new int[n1 + n2];
        //pointer for arr1
        int left = 0;
        //pointer for arr2
        int right = 0;
        //pointer for arr
        int index = 0;
        while(left < n1 && right < n2)
        {
            if(arr1[left] < arr2[right])
            {
                arr[index] = arr1[left];
                left++;
                index++;
            }
            else {
                arr[index] = arr2[right];
                right++;
                index++;
            }
        }
        while(left < n1)
        {
            arr[index] = arr1[left];
            left++;
            index++;
        }
        while(right < n2)
        {
            arr[index]  = arr2[right];
            right++;
            index++;
        }
        //print arr
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{10,15,20,30};
        int[] arr2 = new int[]{5,15,50,80};
        merge(arr1,arr2);
    }
}
