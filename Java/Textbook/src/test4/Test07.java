package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test07 {
    public static void main(String[] args) {
        for (int count = 1; count <= 5; count++) {
            System.out.println(makeLotto());
        }
    }

    public static Set<Integer> makeLotto() { //답
        Set<Integer> lottoSet = new HashSet<>(); //답

        for (;;) {
            int num = (int) Math.ceil(Math.random() * 45); //답
            lottoSet.add(num);

            if (lottoSet.size() == 6) {  //답
                break;
            }
        }

        // 정렬을 위해 TreeSet 사용
        Set<Integer> treeSet = new TreeSet<>(lottoSet);
        return treeSet;
    }
}
