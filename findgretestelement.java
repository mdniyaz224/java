public class findgretestelement {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,8,4,5};
        int max=1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
