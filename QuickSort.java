public class QuickSort {
    static int partion(int arr[],int l,int h)
    {
        int pivot=arr[l];
        int i=l;
        int j=h;

        while(i<j)
        {
            while(arr[i]<=pivot && i<=h-1)
            {
                i++;
            }
            while(arr[j]>pivot && j>=l+1)
            {
                j--;
            }

            if(i<j)//swaping i & j
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //modifying on original array
            int temp=arr[j];
            arr[j]=arr[l];
            arr[l]=temp;
        
        return j;

    }
    static void qs(int arr[],int l,int h)
    {
        if(l<h){
            int pindx=partion(arr,l,h);
            qs(arr,l,pindx-1);
            qs(arr,pindx+1,h);
        }
    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        System.out.println("Original array:");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sorted array:");
        
        qs(arr,0,arr.length-1);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
/*
Procedure:
1.pick up pivot that can be any random.
then place it in its correct place in its sorted array..
cases:
    1st element of array
    last element of array
    median of array
    random element of array

2.smaller on left and larger on right for every pivot element. divide into two separate arrays
there fore after one step pivot is in it's correct place of sort.
hence all the left values are smaller and right values are larger.

3.repeat on all smaller array found




----------------------------------------
QuickSort has an average time complexity of O(n log n), making it quite efficient for large datasets. However, its worst-case time complexity is O(n^2) if poorly chosen pivots lead to unbalanced partitioning. To mitigate this, various strategies for selecting pivot elements, such as the "median of three" method, are often employed.



*/