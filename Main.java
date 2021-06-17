import java.util.ArrayList;
import java.util.List;

class Main
{
    static ArrayList<ArrayList<Integer>> printPattern(int n)
    {
        int size = n*2 - 1;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                int m = Math.max(Math.abs(i-(size/2)), Math.abs(j - (size/2))) + 1;
                list.add(m);
            }
            res.add(list);
        }
        return res;
    }
    public static void main (String[] args)
    {
        int n = 4;

        ArrayList<ArrayList<Integer>> res = printPattern(n);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.size(); j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}