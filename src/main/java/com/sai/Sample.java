/* IMPORTANT: Multiple classes and nested static classes are supported */

package com.sai;
 //uncomment this if you want to read input.
//imports for BufferedReader



class Sample {
    public static void main(String args[] )  {
        
      Sample t=new Sample();  

       int arr[]={4,9,4};
        t.sum(arr,3,4);
        
        System.out.println("Hello World!");
    }
    
    public void sum(int arr[],int n,int k) {

		boolean maxElementFound=false;
		int totalSum=0;
		int count=0;
		int i=0;
		while(i<n) {
			count=0;
			maxElementFound=false;
					
			while(i<n && arr[i]<=k) {
				count++;
				if(arr[i]==k)
					maxElementFound=true;
				i++;
			}
			
			if(maxElementFound)
				totalSum=totalSum+count;
		while(i<n && arr[i]>k)
			i++;
		}
		System.out.println(totalSum);
	}

}
