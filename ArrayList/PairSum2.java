import java.util.*;

public class PairSum2 {
    public static boolean pairsum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();

        // Find the breaking point where the rotation occurs
        for (int i = 0; i < list.size() - 1; i++) { // Fixed the loop condition
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = (bp + 1) % n;  // Left pointer starts after the breaking point
        int rp = bp;            // Right pointer starts at the breaking point

        // Two pointer approach
        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> lt = new ArrayList<>();
        lt.add(11);
        lt.add(15);
        lt.add(6);
        lt.add(8);
        lt.add(9);
        lt.add(10);
        int target = 16;
        System.out.println(pairsum2(lt, target)); // Should print true
    }
}
