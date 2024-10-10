import java.util.*;
public class ContainerMaxWater {
    public static int storeWater(ArrayList<Integer> height){
        int maxwater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp<rp){
            int ht = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currWater = ht*width;
            maxwater = Math.max(maxwater,currWater);

            if(height.get(lp) < height.get(rp)){
                lp++;
            } else{
                rp--;
            }
        }
        return maxwater;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(8);
        ar.add(6);
        ar.add(2);
        ar.add(5);
        ar.add(4);
        ar.add(8);
        ar.add(3);
        ar.add(7);
        System.out.println(storeWater(ar));
    }
}
