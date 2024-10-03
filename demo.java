class demo{
    public static void main(String args[]){
        //Largest Element in an Array 
        // int[] arr = {3,6,2,4,0};
        // int n=arr.length;
        // int largest = arr[0];
        // for(int i=1;i<n-1;i++){
        //     if(arr[i]>largest)
        //         largest=arr[i];
        // }
        // System.out.println("Largest Element in an Array "+largest);
        int[] arr = {3,6,2,4,0};
        int n=arr.length;
        int largest = arr[0];
        for(int i=1;i<n-1;i++){
            if(arr[i]>largest)
                largest=arr[i];
                
        }
        int slargest=-1;    
        for(int i=0;i<n-1;i++){
            if((arr[i] > slargest) && (arr[i]<largest)){
                slargest = arr[i];
            }
        }
        System.out.println("Second Largest Element in an Array "+slargest);
    }
}



