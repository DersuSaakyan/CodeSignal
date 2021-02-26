public class ElectionsWinners {

    static int electionsWinners(int[] votes, int k) {


        int max = 0;
        int count = 0;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] > max)
                max = votes[i];
        }
        if (k == 0) {
            for (int i = 0; i < votes.length; i++) {
                if (max == votes[i])
                    count++;
            }
        }
        if (count>=2){
            return 0;
        }
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] + k > max)
                count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1};
        System.out.println(electionsWinners(arr, 0));

    }
}
