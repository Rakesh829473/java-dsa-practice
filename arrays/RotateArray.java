public class RotateArray 
{


     public static void rotate(int[] nums, int k)
      {
        int n=nums.length;
       
        for(int t = 0; t < k; t++) // k times rotate
        {
            int last = nums[n - 1];

            for(int i = n - 1; i > 0; i--)
            {
                nums[i] = nums[i - 1];
            }

            nums[0] = last;
        }


        for(int j=0;j<nums.length ;j++)
        {
            System.out.print(nums[j]+" ");
        }
      }  

    public static void main(String[] args)
    {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        
    }
    
}
