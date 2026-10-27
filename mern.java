public class mern{
    public static void main(String[] args) {

        //print index value
        int[] arr = {1,2,3,4,5,9,5,4,2,10,25};
        // System.out.println(arr[1]);
        // System.out.println(arr[0]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[5]);
        // System.out.println(arr.length);

        //reverse arr value
        // for(int i = arr.length-1; i>=0; i--){
        // System.out.println(arr[i]);
        // }

        //sum of arr value
        // int sum=0;
        // for(int i=0; i<arr.length; i++){
        //     sum=sum+arr[i];
        // }
        //  System.out.println(sum);


        //find smallest value
        int small =200;
        for(int i=0; i<arr.length; i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println(small);
    } 
}