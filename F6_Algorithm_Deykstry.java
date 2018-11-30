package com.marlen.java.lesson_1.Lesson7_1.Home7.e_olymp.First_liga.Nov_2_2017.F6_Deykstry;




import java.util.Scanner;
import static java.util.Arrays.fill;


public class F6_Algorithm_Deykstry {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vNum = input.nextInt();
        int start = input.nextInt();
        int finish = input.nextInt();


        int[][] graph = new int[vNum][vNum];
        for (int i = 0; i < vNum; i++) {
            for (int j = 0; j < vNum; j++) {

                graph[i][j] = input.nextInt();
            }
        }
        input.close();
        start = start - 1;
        finish = finish - 1;

        int INF = Integer.MAX_VALUE / 2;

        boolean[] used = new boolean[vNum];
        int[] dist = new int[vNum];

        fill(dist, INF);
        dist[start] = 0;

        for (; ; ) {
            int v = -5;
            for (int nv = 0; nv < vNum; nv++)
                if (!used[nv] && dist[nv] < INF && (v == -5 || dist[v] > dist[nv])) {
                    v = nv;
                }
            if (v == -5) {
                break;
            }
            used[v] = true;


            for (int nv = 0; nv < vNum; nv++) {
                if (!used[nv] && graph[v][nv] < INF && graph[v][nv] >= 0)
                    dist[nv] = Math.min(dist[nv], dist[v] + graph[v][nv]);
            }

        }

        System.out.print(dist[finish]);
    }
}






  /*  Алгоритм Дейкстры

    Дан ориентированный взвешенный граф. Найти кратчайшее расстояние от вершины s до вершины f.

        Входные данные

        В первой строке заданы три числа n, s и f (1 ≤ n ≤ 100, 1 ≤ s, f ≤ n),
        где n - количество вершин графа. В следующих n строках записано по n чисел - матрица смежности
        графа, где число в i-ой строке и j-ом столбце соответствует ребру из i в j: -1 означает
        отсутствие ребра между вершинами, а любое неотрицательное число - наличие ребра данного веса.
        На главной диагонали матрицы всегда записаны нули.

        Выходные данные

        Вывести искомое расстояние или -1, если пути между указанными вершинами не существует.


        Входные данные
        3 1 2
        0 -1 2
        3 0 -1
        -1 4 0


        Выходные данные
        6

        */



/*

import java.util.Arrays;
        import java.util.Scanner;

        import static java.util.Arrays.fill;

*/
/**
 * Created by Pysik on 08.11.2017.
 *//*

public class F6_Test_Algorithm_Deykstry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vNum = input.nextInt();
        int start = input.nextInt();
        int finish = input.nextInt();


        int[][] graph = new int[vNum][vNum];
        for (int i = 0; i < vNum; i++) {
            for (int j = 0; j < vNum; j++) {

                graph[i][j] = input.nextInt();
            }
        }
        input.close();
        start = start - 1;


        int INF = Integer.MAX_VALUE / 2; // "Бесконечность"
        //  int vNum; // количество вершин
        //   int[][] graph; // матрица смежности

            */
/* Алгоритм Дейкстры за O(V^2) *//*

        //  void dijkstra(int start) {
        boolean[] used = new boolean[vNum]; // массив пометок
        int[] dist = new int[vNum]; // массив расстояния. dist[v] = минимальное_расстояние(start, v)

        fill(dist, INF); // устанаавливаем расстояние до всех вершин INF
        dist[start] = 0; // для начальной вершины положим 0

        for (; ; ) {
            int v = -1;
            for (int nv = 0; nv < vNum; nv++) // перебираем вершины
                if (!used[nv] && dist[nv] < INF && (v == -1 || dist[v] > dist[nv])) // выбираем самую близкую непомеченную вершину
                    v = nv;
            if (v == -1) break; // ближайшая вершина не найдена
            used[v] = true; // помечаем ее
            for (int nv = 0; nv < vNum; nv++)
                if (!used[nv] && graph[v][nv] < INF) // для всех непомеченных смежных
                    dist[nv] = Math.min(dist[nv], dist[v] + graph[v][nv]); // улучшаем оценку расстояния (релаксация)

        }
        // }

        for (int i = 0; i < vNum; i++) {

            System.out.print(dist[i] + " ");

            System.out.println();
        }
    }
    //}
}*/


