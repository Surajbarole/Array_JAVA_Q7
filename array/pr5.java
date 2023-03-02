// Q5. Write a program Given an even size array, Find the difference of sum of first half of the array from second half of the array.



class Main {
  public static void main(String[] args) {
    int[] arr={1,6,3,2,5,6,2,6};
    int n=arr.length;
    int fhalf=0;
    int shalf=0;
    for(int i=0;i<n/2;i++){
    fhalf+=arr[i];
     // System.out.println(fhalf);
    }
    for(int i=0;i<n/2;i++){
      shalf+=arr[i];
    //  System.out.println(shalf);
    }
    int diff=fhalf-shalf;
    System.out.println(diff);
  }
}