// import java.util.*;
public class binary {
    public static int binarysearch(int number[], int key){
        int start = 0, end = number.length;
        while(start <= end){
            int mid = (start+end)/2;
            if(number[mid]==key){
                 return mid;
            }
            if(number[mid]<= key){
                start = mid+1;
            }
            if(number[mid]>=key){
                end = mid-1;
                
            }

        }
        return 0;
    }
    public static void main(String[] args){
        int number[] = {1,3,5,7,9,16,17,28};
        int key = 5;
        System.out.println(binarysearch(number,key));
    }
}
