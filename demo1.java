class demo1{
    public static void main(String args[]){
     int[] a={1,6,4,9,5};
     int n=a.length;
     int largest=a[0];
     for(int i=0;i<n-1;i++){
         if(a[i]>largest)
         largest = a[i];
     }
     System.out.println(largest);
       
    } 
 }