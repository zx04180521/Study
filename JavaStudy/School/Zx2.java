package zhangxin2;


public class Zx2 {

	public static void main(String args[ ]){
  int m, n, k;

int arrayA[] = new int[6], arrayB[] = new int[6],arrayC[] = new int[12];

for (int i = 0; i < 6; i++) {

    m = (int) (100 * Math.random());

    arrayA[i] = m;

    n = (int) (100 * Math.random());

    arrayB[i] = n;

   System.out.println(arrayA[i] + "   " + arrayB[i]);

    }// for

   for (int i = 0; i < 6; i++) {

       for (int j = i; j < 6; j++) {

          if (arrayA[i] > arrayA[j]) {

             int t = arrayA[i];

           arrayA[i] = arrayA[j];

            arrayA[j] = t;

         }

          if (arrayB[i] > arrayB[j]) {

             int t = arrayB[i];

            arrayB[i] = arrayB[j];

           arrayA[j] = t;

          }

    }

   }// for

 

    m = 0;

   n = 0;

     k = 0;

   while (m <= 6 && n <= 6) {

      if (arrayA[m] <= arrayB[n]) {

       arrayC[k] = arrayA[m];

       m++;

    } else {

       arrayC[k] = arrayB[n];

       n++;

       }

 

     }// while

    while (m < 6) {

       arrayC[k] = arrayA[m];

    m++;

     k++;

   }

    while (n < 6) {

       arrayC[k] = arrayA[m];

       m++;

     k++;

    }

  for (int i = 0; i < 12; i++) {

       System.out.print(arrayC + "  ");

    }

   }// main

}