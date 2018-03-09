package q01_binarySearch;

public class Solution {
    public boolean contains(int[] arr, int value){
        return  binarySearchR(arr, 0 , arr.length, value);
    }

    private boolean binarySearchR(int[] a, int i, int j, int q) {
        if(i==j)//empty
        {
            return  false;
        }
        int mid=(i+(j-1))/2;
        if (a[mid]>q)//left
        {
            return binarySearchR(a,i,mid,q);
        }
        else if(a[mid]<q)//right
        {
            return binarySearchR(a,mid+1,j,q);
        }
        else if(a[mid]==q)
            return true;


        return false;

    }
}
