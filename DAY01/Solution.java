class Solution {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,8,6};
        int min = arr[0]; 
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        System.out.println("maximum: " + max+"\nminimum: "+min);
    }
}