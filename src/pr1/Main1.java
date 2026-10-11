package pr1;/*
public class Main1 {
    public static void Main1(String[] args) {
        double sum = 0;
        double sr = 0;
        int[] b = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < 10; i++) {
            sum+=b[i];
        }
        System.out.println((int)sum);
        sr=sum/b.length;
        System.out.println(sr);
    }
}
*/
/*
import java.util.Arrays;
import java.util.Scanner;
public class Main1 {
    public static void Main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        if(sc.hasNextInt()) {
            int l = sc.nextInt();
            int[] b = new int [l];
            for (int i = 0; i<l; i++){
                System.out.println("Введите элемент " + i);
                if(sc.hasNextInt()) {
                    b[i]=sc.nextInt();
                } else {
                    System.out.println("Неправильное число");
                    System.exit(0);
                }
            }
            int sum=0;
            int i=0;
            while (i<l) {
                sum+=b[i];
                i++;
            }
            int f = 0;
            int max = 0;
            int min = 99999;
            do {
                if (b[f]< min) {
                    min=b[f];
                }
                if (b[f] > max) {
                    max=b[f];
                }
                f++;
            } while (f<l);
            System.out.println("Сумма=" + sum);
            System.out.println("Максимальное=" + max);
            System.out.println("Минимальное=" + min);
        } else {
            System.out.println("Неправильное число");
            System.exit(0);
        }
        }
    }

*/
/*
public class Main1 {
    public static void Main1(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }
}
 */
/*
public class Main1 {
    public static void Main1(String[] args) {
        for (double n = 1; n<11; n++) {
            double q = 1/n;
            System.out.println(q);
        }
    }
}

 */
/*
public class Main1 {
        public static int fk(int a) {
            int f = 1;
            if (a==0) {
                return 1;
            } else {
                for (int n = 1; n<a+1; n++) {
                    f=f*n;
                }
                return f;
            }

        }
        public static void Main1() {
            int a = 0;
            System.out.println(fk(a));
        }
    }
*/