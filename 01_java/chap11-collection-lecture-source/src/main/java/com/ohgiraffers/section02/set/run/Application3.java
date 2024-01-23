package com.ohgiraffers.section02.set.run;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. TreeSet에 대해 이해하고 활용할 수 있다. */
        Set<String> tSet = new TreeSet<>();

        tSet.add("ramen");
        tSet.add("fork");
        tSet.add("kimchi");
        tSet.add("firedEgg");
        tSet.add("soup");
        System.out.println("lSet = " + tSet);

        /* 설명. 과제. 중복되지 않는 번호를 발생시켜 로또 번호 발생기 만들기(TreeSet 사용X)  */
        int[] lotto = new int[6];
        int cnt = 0;
        while(cnt < lotto.length){
            int random = (int)((Math.random() * 45) + 1);
            System.out.println(random);
            for (int i = 0; i < lotto.length; i++) {
                if(random == lotto[i]){
                    break;
                }
                else {
                    if(i == cnt){
                        lotto[cnt] = random;
                        cnt++;
                        break;
                    }
                }
            }
        }
        Arrays.sort(lotto);
        System.out.println("lotto = " + Arrays.toString(lotto));

        /* 설명. TreeSet을 사용하여 로또 번호 발생기 생성 */
        Set<Integer> lotto2 = new TreeSet<>();

        /* 설명. 1부터 45까지의 6자리 중복되지 않는 난수를 발생하여 값 저장 */
        while(lotto2.size() < 6) {
            lotto2.add((int) (Math.random() * 45) + 1);
        }

        /* 설명. 출력 시에는 오름차순으로 출력되도록 작성 */
        System.out.println("lotto2 = " + lotto2);
    }
}
