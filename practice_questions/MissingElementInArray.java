/*
 * Find the missing elements in a given integer array.
 * Author: Komal Soham Wadekar
 */
public class MissingElementInArray {
	
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,7,8,11,12,13,20};
		
		int current=0;
		int next=0;
		int diff=0;
		for(int i=0;i<arr.length-1;i++){
			current = arr[i];
			next = arr[i+1];
			diff = next-current;
			if((diff)>1){
				diff = diff - 1;
				for(int j=1;j<=diff;j++){
					System.out.println("Missing Element is: "+(current+j));
				}
			}
		}
	}
}
