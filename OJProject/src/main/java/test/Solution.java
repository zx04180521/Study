package test;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            if(map.containsKey(target-temp)){
                return new int[]{map.get(target-temp),i};
            }
            map.put(temp,i);
        }
        return new int[]{-1,-1};
    }

//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] arr = {2,7,11,15};
//        int target = 9;
//        int[] result = solution.twoSum(arr, 9);
//        if (result.length == 2 && result[0] == 0 && result[1] == 1) {
//            System.out.println("TestCase OK!");
//        } else {
//            System.out.println("TestCase Failed! arr: {2, 7, 11, 15}, target: 9");
//        }
//
//        int[] arr2 = {3,2,4};
//        int target2 = 6;
//        int[] result2 = solution.twoSum(arr2, target2);
//        if (result2.length == 2 && result2[0] == 1 && result2[1] == 2) {
//            System.out.println("TestCaseOK!");
//        } else {
//            System.out.println("TestCaseFailed!");
//        }
//    }

//    public static void main(String[] args) {
//        Solution solution=new Solution();
//        int a=123;
//        int res=solution.reverse(a);
//        if(res==321){
//            System.out.println("TestCaseOK!");
//        }else{
//            System.out.println("TestCaseFailed!");
//        }
//    }
}