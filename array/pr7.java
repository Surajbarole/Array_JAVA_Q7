// Q7. Write a program Given an array X[] , Create an another array Y[] which stores the X[] array elements in reverse order.


 class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
        }
         for(int j=arr2.length;j>=0;j--){
           System.out.println(arr2[j]);
         }
       
    }
}
