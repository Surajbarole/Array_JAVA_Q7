// Q2. Write a program Given an array, count the Even and odd elements



class Main {
  public static void main(String[] args) {
    int[] arr={1,5,3,2,6,49,8,7,2,6};
    int count=0;
    int n=arr.length;
    // Even count for code 
    for(int i=0;i<n;i++){
      if(arr[i]%2==0){
        count++;
      }
    }
    System.out.println("Even count is "+ count);
// odd code for count
    int n1=arr.length;
    for(int i=0;i<n1;i++){
      if(arr[i]%2==1){
        count++;
      }
    }
    System.out.println("Odd count is "+ count);
  }
}