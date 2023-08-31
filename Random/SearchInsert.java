package Random;
public class SearchInsert {
    public static void main(String[] args) {
        int vet[] = { 2, 6, 7, 9, 10 };
        System.out.println(searchInsert(vet, 11));
    }

    public static int searchInsert(int[] nums, int target) {
        return binarySearchInsert(nums, target, 0, nums.length - 1);
    }

    public static int binarySearchInsert(int[] nums, int target, int left, int right) {
        if (left > right) {
            return left;
        }
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearchInsert(nums, target, mid + 1, right);
        } else {
            return binarySearchInsert(nums, target, left, mid - 1);
        }
    }

}
