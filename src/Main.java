import java.util.*;

public class Main {

    public static int findBlockToRemove(int[][] lists, int target) {
        for (int blockIdx = 0; blockIdx < lists[0].length; blockIdx++) {
            List<int[]> candidates = new ArrayList<>();
            for (int[] list : lists) {
                int[] temp = Arrays.copyOf(list, list.length);
                int removedBlock = temp[blockIdx];
                temp[blockIdx] = -1;
                int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
                for (int block : temp) {
                    if (block != -1) {
                        max = Math.max(max, block);
                        min = Math.min(min, block);
                    }
                }
                int diff = max - min;
                if (diff <= target) {
                    candidates.add(new int[]{removedBlock, diff});
                }
            }
            if (!candidates.isEmpty()) {
                return candidates.get(0)[0];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[][] lists = new int[n][];
        for (int i = 0; i < n; i++) {
            int len = scanner.nextInt();
            lists[i] = new int[len];
            for (int j = 0; j < len; j++) {
                lists[i][j] = scanner.nextInt();
            }
        }
        int blockToRemove = findBlockToRemove(lists, target);
        System.out.println(blockToRemove);
    }
}