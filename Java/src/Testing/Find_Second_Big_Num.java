package Testing;

public class Find_Second_Big_Num {
	
	public static void main(String[] args) {
		
		System.out.println("Welocome...!");
	        int arr[]={34,25,23,58,45,17,18,21,46,533};
	        int big=arr[0];
	        int sec_big=arr[0];
	        for(int i=1;i<arr.length;i++)
	        {
	            if(arr[i]>big)
	                big=arr[i];
	        }
	        for(int i=1;i<arr.length;i++)
	        {
	            if(arr[i]>sec_big && arr[i]<big)
	                sec_big=arr[i];
	        }
	        System.out.println("second big number is: "+sec_big);
	    }
	}


