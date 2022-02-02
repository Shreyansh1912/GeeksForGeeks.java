package com.company;

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];

            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            int key = sc.nextInt();

            System.out.println(new Solution().search(A, 0, n - 1, key));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class ABC
{
    int search(int A[], int l, int h, int key)
    {
        int low=0;int high=A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == key) return mid;   //binary search
            if(A[low] < A[mid]){
                if(A[low] <= key && key < A[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(A[mid] < key && key <= A[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
