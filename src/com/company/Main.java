package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // добавил комментарий
        int p=100;
        p++;
        
       /* int[] a;
        a = new int[5];
        for(int i=0;i<5;i++) {

        }*/
      /*  Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++) {
            x[i] = scanner.nextInt();
        }

        for(int i=0;i<n;i++) {
           System.out.print(x[i] + " ");
        }
*/
        int[][] z = new int[3][4];
        Random r = new Random();
        for(int i=0;i<3;i++) {
            for(int j=0;j<4;j++) {
                z[i][j] = r.nextInt(1000);
            }
        }
        for(int i=0;i<3;i++) {
            for(int j=0;j<4;j++) {
                System.out.printf("%4d",z[i][j]);
            }
            System.out.println();
        }

        int[][] d = new int[3][];
        d[0] = new int[]{4,3,5,3,3};
        d[1] = new int[]{34,6};
        d[2] = new int[]{3,6,78};

        for(int i=0,k=0;i<4;i++,k--) {

        }

        for(int i=0;i<d.length;i++) {
            for(int j=0;j<d[i].length;j++) {
                System.out.printf("%4d",d[i][j]);
            }
            System.out.println();
        }




    }
}
