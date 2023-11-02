package DynamicProgramming;

public class MinCostStairs {
    public static void main(String[] args) {
        
    }
    public static int minCostClimbingStairs(int[] cost) {
            
        int startAt0 = cost[0];
        int startAt1 = cost[1];
        
        for (int i = 2; i < cost.length; i++) {
            
        }
        return Math.min(startAt0, startAt1);
    }
}
