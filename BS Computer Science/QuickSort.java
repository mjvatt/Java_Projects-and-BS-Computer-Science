import java.util.Arrays;

public class QuickSort {
	
	static int counter = 0;

    public static void main(String[] args) {
    	
        int[] to_sort = new int[] {12,9,4,99,120,1,3,10,23,45,75,69,31,88,101,14,29,91,2,0,77};
        System.out.println("Unsorted Array: ");
        System.out.println("[12, 9, 4, 99, 120, 1, 3, 10, 23, 45, 75, 69, 31, 88, 101, 14, 29, 91, 2, 0, 77]\n");
        quickSort(to_sort, 0, to_sort.length-1);
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(to_sort) + "\n");
        System.out.println("Amount of exchanges: " + counter);
    
    }
 
    public static void quickSort(int[] a, int start, int end) {
    	
        if (a == null || a.length == 0) {

        	return;
        
        }
         
        if (start >= end) {
        
        	return;
        
        }
 
        int pivot_index = start + (end - start) / 2;
        int pivot = a[pivot_index];
        int i = start;
        int j = end;
        
        while (i <= j) {
        	
            while (a[i] < pivot) {
            
            	i++;
            
            }
            
            while (a[j] > pivot) {
            
            	j--;
            
            }
            
            if (i <= j) {
            
            	exchange(a, i, j);
                i++;
                j--;
            
            }
        
        }
        
        if (start < j) {
        
        	quickSort(a, start, j);
        
        }
        
        if (end > i) {
        
        	quickSort(a, i, end);
        
        }
    
    }
     
    public static int exchange(int[] a, int x, int y) {
    	
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
        counter++;
        return counter;
        
    }
    
}