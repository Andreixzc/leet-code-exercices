package TwoPointers;

public class WaterArea {
    public static void main(String[] args) {
        int[] vet = { 9, 6, 5, 2, 4 };
        System.out.println(maxArea(vet));
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int currentMax = -1;

        while (i < j) {
            int currentArea = Math.min(height[i], height[j]) * (j - i);
            currentMax = Math.max(currentArea, currentMax);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }

        }
        return currentMax;
    }
}
