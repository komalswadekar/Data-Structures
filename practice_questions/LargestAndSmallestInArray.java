
public class LargestAndSmallestInArray {
	
	public void findLargeAndSmall(int arr[]){
		int small = arr[0];
		int large = arr[0];
		
		for(int i=1; i<arr.length;i++){
			if(arr[i]<small){
				small = arr[i];
			}
			if(arr[i]>large){
				large = arr[i];
			}
			
		}
		System.out.println("Smallest number is: "+small);
		System.out.println("Largest number is: "+large);
	}
	
	public static void main(String args[]){
		LargestAndSmallestInArray inst = new LargestAndSmallestInArray();
		int arr[] = {9,2,0,9,8,4,6};
		inst.findLargeAndSmall(arr);
	}
}
