public class Removedublicet 
{
     public static int removeDuplicates(int[] nums) 
    {   
       if(nums.length==0)
       {
        return 0;
       }
       int i=0;
       for(int j=0;j<nums.length;j++)
       {
        if(nums[j]!=nums[i])
        {
            i++;
            nums[i]=nums[j];

        }
       }
       return  i+1;
        
    }


    public static void main(String[] args) 
    {

      int   nums[] = {0, 0, 3, 3, 5, 6};
        System.out.print(removeDuplicates(nums)); 
        
    }
    
}
