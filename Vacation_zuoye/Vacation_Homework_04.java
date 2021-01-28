package Vacation_zuoye;

import com.sun.org.apache.bcel.internal.generic.LADD;

import java.util.Arrays;

public class Vacation_Homework_04 {
    public static void main(String[] args) {
        //给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。最高位数字存放在数组的首位， 数
        //组中每个元素只存储单个数字。(注意：你要防止的是第一个数字是9或者最后一个是9哈！这种情况会有进位滴)
//        int[] a={1,1,9};
//        System.out.println(Arrays.toString(plusOne(a)));

//        给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
//        int[] nums = {1};
//        System.out.println(thirdMax(nums));


        //字符串转换整数
//        String str="  0000000000012345678";
//        System.out.println(myAtoi(str));

        //给定一个按照升序排列的整数数组 nums ，和一个目标值 target 。找出给定目标值在数组中的开始位置和结
//束位置。你的算法时间复杂度必须是 O(log n) 级别。如果数组中不存在目标值，返回 [-1, -1] .
//        int[] nums = {5, 7, 7, 8, 8, 10};
//        System.out.println(Arrays.toString(searchRange(nums, 5)));

    }

    //给定一个按照升序排列的整数数组 nums ，和一个目标值 target 。找出给定目标值在数组中的开始位置和结
//束位置。你的算法时间复杂度必须是 O(log n) 级别。如果数组中不存在目标值，返回 [-1, -1] .
    public static int[] searchRange(int[] nums, int target) {
        //暴力搜索解决

//        int cur = -1;
//        int count = -1;
//        int i = 0;
//        int[] result = new int[2];
//        for (; i < nums.length; i++) {
//            if (nums[i] == target) {
//                cur = i;
//                break;
//            }
//        }
//        if (cur == -1) {
//            return new int[]{-1, -1};
//        }
//        for (int j = cur; j < (nums.length); j++) {
//            if (nums[j] == target) count++;
//        }
//        return new int[]{cur, cur + count};


        //二分搜索解决
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int firstPosition = leftPosition(nums, target);
        if (firstPosition == -1) {
            return new int[]{-1, -1};
        }
        int lastPosition = rightPosition(nums, target);
        return new int[]{firstPosition, lastPosition};
    }

    private static int rightPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right+1) / 2;
            if (nums[mid] == target) {
                left = mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (nums[right] == target) {
            return left;
        }
        return -1;
    }

    private static int leftPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }


    //字符串转换整数
    public static int myAtoi(String str) {
        char[] c = str.trim().toCharArray();
        if (c.length == 0) return 0;
        int newInt = 0;
        int tmp;
        int sign = 1;
        int i = 1;
        if (c[0] == '-') {
            sign = -1;
        } else if (c[0] != '+') {
            i--;
        }
        for (; i < c.length; i++) {
            if (c[i] > '9' || c[i] < '0') {
                break;
            }
            tmp = 10 * newInt + (c[i] - '0');
            if (tmp / 10 != newInt) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            newInt = tmp;
        }

        return newInt * sign;
    }

    //   给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int i : nums) {
            if (third >= i || second == i || first == i) {
                continue;
            } else if (i > first) {
                third = second;
                second = first;
                first = i;
            } else if (i > second) {
                third = second;
                second = i;
            } else {
                third = i;
            }
        }
        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }


    //给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。最高位数字存放在数组的首位， 数
    //组中每个元素只存储单个数字。(注意：你要防止的是第一个数字是9或者最后一个是9哈！这种情况会有进位滴)

    public static int[] plusOne(int[] digits) {


        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //跳出for循环，说明数字全部是9

        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;

    }
}
