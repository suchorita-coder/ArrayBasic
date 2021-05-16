package ArrayNo;

public class DuplicateArrayNo {
	public static void main(String args[]) {
		
		int a[] = { 23,43,75,23,75,57,43};
		System.out.println("The length of array :" + a.length);
		System.out.println("The duplicate element are :");
		
		  for(int i = 0; i < a.length; i++) {  
	            for(int j = i + 1; j < a.length; j++) {  
	                if(a[i] == a[j])  
	                    System.out.println(a[j]); 
				}
			}
		}
	

}
