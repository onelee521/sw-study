package com.ohgiraffers.chap05.section01.tree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Application1 {

    static int N;
    static int[] parent;
    static boolean[] isVisit;
    static StringTokenizer st;

    static List<Integer>[] list;

    static StringBuilder sb = new StringBuilder();

    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static String solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        sb.delete(0, sb.length());

        N = Integer.valueOf(br.readLine());

        /* 설명. node의 번호와 인덱스의 번호를 일치 시키기 위해서 입력 받은 노드 크기 + 1 */
        isVisit = new boolean[N + 1];
        list = new ArrayList[N + 1];            // ArrayList 사용이유: 배열로 만들면 반드시 두칸을 만들고 두칸을 고려해야 함
                                                // ArrayList는 하나만 넣거나 세개까지도 고려 가능. add도 사용가능
        parent = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.valueOf(st.nextToken());
            int b = Integer.valueOf(st.nextToken());

            /* 설명. 트리는 양방향이기 때문 */
            list[a].add(b);
            list[b].add(a);
        }

        dfs(1);

        for (int i = 2; i < parent.length; i++) {
            sb.append(parent[i]);
            sb.append(" ");
        }

        return sb.toString();
    }

    private static void dfs(int parentNode) {

        /* 설명. 이미 방문한 노드는 부모 노드이고 부모 노드를 재방문하지 않도록 함(방문 배열의 의미) */
        isVisit[parentNode] = true;

        /* 설명. 입력 받은 값을 통해 생성된 list로부터 관련있는 노드를 확인하기 위한 반복문 */
        for (int node: list[parentNode]){

            /* 설명. 방문한 적이 없다면 자식노드(루트부터 방문 체크하며 연관된 것을 따라왔기 때문) */
            if(!isVisit[node]) {
                parent[node] = parentNode;      // 이 줄부터는 사실상 node가 childnode를 의미
                dfs(node);
            }
        }
    }


}
