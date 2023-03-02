// Q6. Write a program Given an array and an element x, Find the frequency of x in that array. Frequency means How many times that element is exist in that array.



class Main {
  public static void main(String[] args) {
    int count=0;
    int x=5;
    int[] arr={2,5,3,5,7,8,5,2,5};
    int n=arr.length;
    for(int i=0;i<n;i++){
      if(arr[i]==x){
        count++;
      }
    }
    System.out.println(count);
  }
}