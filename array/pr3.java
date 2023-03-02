// Q3. Write a program Given an array, Find the average of elements present at even position.


class Main {
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    int n=arr.length;
    int sum=0;
    int count=0;
    for(int i=0;i<n;i++){
      if(arr[i]%2==0){
        sum=sum+arr[i];
        count++;
      }
    }
     System.out.println(sum/count);
  }
}