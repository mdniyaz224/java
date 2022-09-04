public class oddnointhearray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6};
        for(int i=0; i<=arr.length; i++)
        {
               if(arr[i]%2==0)
               {
               
                arr[i]=arr[i+1];
                System.out.println(arr[i]);
               }
               else if(arr[i]%2!=0){
                arr[i]=arr[i+1];
                System.out.println(arr[i]);
               }
        }
        
    }
}
