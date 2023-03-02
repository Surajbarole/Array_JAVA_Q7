// Q1. Write a program to copy the elements of one array into another array.


class Main {
  public static void main(String[] args) {
    int[] arr1={5,3,4,6,7,9};
    int n=arr1.length;
    for(int j=0;j<n;j++){
    System.out.print("This is 1st array"+"  ");
      System.out.println(arr1[j]);
    }
    int[] arr2=new int[n];
    for(int i=0;i<n;i++){
      arr2[i]=arr1[i];
      System.out.print("This is 2nd array"+"  ");
      System.out.println(arr2[i]);
    }
  }
}