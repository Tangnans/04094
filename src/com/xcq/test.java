package com.xcq;
public class test {
    public static void main(String[] args) {
        int i_xcq=7;
        int j_xcq=0;
        int k_xcq=0;
        int count_xcq=0;
       for(j_xcq=1;j_xcq<=8;j_xcq++){
           if(j_xcq==1){
               count_xcq=(i_xcq+1)/2;
           }
           else if(i_xcq==2)
           {
               count_xcq+=(i_xcq-1)*(i_xcq+1)/2;
           }
           else {
               int l_xcq = (i_xcq - 1) * (i_xcq + 1) / 2;
               for (k_xcq = i_xcq - 1; k_xcq > i_xcq - j_xcq + 1; k_xcq--) {
                   l_xcq *= k_xcq;
               }
               count_xcq += l_xcq;
           }
       }
        System.out.println(count_xcq);
    }
}
/*package com.xcq;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a_xcq[]=new int [5];
        int i_xcq=0;
        int j_xcq=0;
        int k_xcq=0;
        int x_xcq=0;
        int y_xcq=0;
        for(i_xcq=0;i_xcq<7;i_xcq++)
        {
            int year_xcq = sc.nextInt();
            a_xcq[i_xcq]=year_xcq;
        }
        sc.close();
        int max_xcq=a_xcq[0];
        int min_xcq=a_xcq[0];
        for(i_xcq=1;i_xcq<= 4;i_xcq++) {
            if (a_xcq[i_xcq]>max_xcq){
                max_xcq= a_xcq[i_xcq];
                x_xcq=i_xcq;
            }
            if (a_xcq[i_xcq]< min_xcq){
                min_xcq= a_xcq[i_xcq];
                y_xcq=i_xcq;
            }
        }

    }
}*/
/*package com.xcq;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a_xcq[]=new int [5];
        int i_xcq=0;
        int j_xcq=0;
        int k_xcq=0;
        int x_xcq=0;
        int y_xcq=0;
        System.out.print("请输入五个数：");
        for(i_xcq=0;i_xcq<5;i_xcq++)
        {
            int year_xcq = sc.nextInt();
            a_xcq[i_xcq]=year_xcq;
        }
        sc.close();
        int max_xcq=a_xcq[0];
        int min_xcq=a_xcq[0];
        for(i_xcq=1;i_xcq<= 4;i_xcq++) {
            if (a_xcq[i_xcq]>max_xcq){
                 max_xcq= a_xcq[i_xcq];
                 x_xcq=i_xcq;
            }
            if (a_xcq[i_xcq]< min_xcq){
                min_xcq= a_xcq[i_xcq];
                y_xcq=i_xcq;
            }
        }
        j_xcq=a_xcq[x_xcq];
        a_xcq[x_xcq]=a_xcq[0];
        a_xcq[0]=j_xcq;
        k_xcq=a_xcq[y_xcq];
        a_xcq[y_xcq]=a_xcq[4];
        a_xcq[4]=k_xcq;
        for(int m_xcq:a_xcq)
        {
            System.out.print(m_xcq+"\t");
        }
    }
}
*/
/*package com.xcq;
public class test {
    public static void main(String[] args) {
        double  a_xcq=0;
        double i_xcq = 35;
        double j_xcq=0;
        int k_xcq =0;

        do {
            a_xcq=i_xcq%2;
            if(a_xcq==1)
            {
                j_xcq=j_xcq+Math.pow(10, k_xcq);
            }

            i_xcq = Math.floor(i_xcq / 2);
            k_xcq++;


        }while(i_xcq>=1);
        System.out.println(j_xcq);

    }

}
*/
/*package com.xcq;
public class test {
    public static void main(String[] args) {
        int a_xcq[] = {1,2,3,1,0};
        int i_xcq = 0;
        int j_xcq=0;
        int k_xcq =0;
        int count_xcq = 0;
        for (i_xcq = 1; i_xcq <a_xcq.length; i_xcq++) {
            for (i_xcq = 1; i_xcq <a_xcq.length; i_xcq++){
                if (a_xcq[j_xcq]== a_xcq[i_xcq]) {
                   k_xcq=1;
                }
            }

        }
        if(k_xcq==1) {
            System.out.println("重复");
        }
        else{
            System.out.println("不重复");
        }

    }
}*/
/*package com.xcq;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_xcq[]=new int[10];
        int i_xcq =0;

        int temp=0;
        System.out.print("请输入十个数：");
        for (i_xcq = 0; i_xcq < 10; i_xcq++) {
            int year_xcq = sc.nextInt();
            a_xcq[i_xcq] = year_xcq;
        }
        sc.close();
        System.out.print("倒置后的数组为：");
        for (i_xcq = 0; i_xcq <a_xcq.length/2; i_xcq++) {
            temp=a_xcq[i_xcq];
            a_xcq[i_xcq]=a_xcq[9-i_xcq];
            a_xcq[9-i_xcq]=temp;

        }
        for(int j_xcq:a_xcq)
        System.out.print(j_xcq+"\t");
    }
}*/

/*package com.xcq;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oldArr_xcq[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int newArr_xcq[]=new int [12];
        int i_xcq = 0;
        int j_xcq=0;

        System.out.print("合并后的数组为：");
        for (i_xcq = 0; i_xcq <oldArr_xcq.length; i_xcq++) {
            if (oldArr_xcq[i_xcq]!=0) {
                newArr_xcq[j_xcq++]=oldArr_xcq[i_xcq];
            }
        }
        for(int k_xcq:newArr_xcq) {
            System.out.print(k_xcq+"\t");
        }

    }
}*/

/*package com.xcq;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_xcq[] = new int[5];
        int b_xcq[] =new int[5];
        int c_xcq[]=new int[10];
        int i_xcq = 0;
        int j_xcq=0;
        System.out.print("请输入五个数：");
        for (i_xcq = 0; i_xcq < 5; i_xcq++) {
            int year_xcq = sc.nextInt();
            a_xcq[i_xcq] = year_xcq;
        }
        System.out.print("请输入五个数：");
        for (i_xcq = 0; i_xcq < 5; i_xcq++) {
            int year_xcq = sc.nextInt();
            b_xcq[i_xcq] = year_xcq;
        }
        sc.close();
        System.out.print("合并后的数组为：");
        for (i_xcq = 0; i_xcq <a_xcq.length+b_xcq.length; i_xcq++) {
            if (i_xcq<a_xcq.length) {
                   c_xcq[i_xcq]=a_xcq[i_xcq];
                }
                else{
                    c_xcq[i_xcq]=b_xcq[i_xcq-a_xcq.length];
                }
            System.out.print(c_xcq[i_xcq]+"\t");
        }
    }
}
*/
/*package com.xcq;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_xcq[] = new int[5];
        int b_xcq[] =new int[5];
        int i_xcq = 0;
        int j_xcq=0;
        System.out.print("请输入五个数：");
        for (i_xcq = 0; i_xcq < 5; i_xcq++) {
            int year_xcq = sc.nextInt();
            a_xcq[i_xcq] = year_xcq;
        }
        System.out.print("请输入五个数：");
        for (i_xcq = 0; i_xcq < 5; i_xcq++) {
            int year_xcq = sc.nextInt();
            b_xcq[i_xcq] = year_xcq;
        }
        sc.close();
        System.out.print("两个数组相同的元素为：");
        for (i_xcq = 0; i_xcq <a_xcq.length; i_xcq++) {

            for (j_xcq = 0; j_xcq < b_xcq.length; j_xcq++) {
                if (b_xcq[j_xcq]== a_xcq[i_xcq]) {
                    System.out.print(a_xcq[i_xcq]+"\t");
                }
            }
        }
    }
}

*/
/*package com.xcq;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_xcq[] = new int[5];
        int i_xcq = 0;
        System.out.print("请输入五个数：");
        for (i_xcq = 0; i_xcq < 5; i_xcq++) {
            int year_xcq = sc.nextInt();
            a_xcq[i_xcq] = year_xcq;
        }
        sc.close();
        int k_xcq = a_xcq[0];
        int count_xcq = 0;
        for (i_xcq = 1; i_xcq <a_xcq.length; i_xcq++) {
            if (k_xcq == a_xcq[i_xcq]) {
                count_xcq++;
            } else {
                count_xcq--;
                if (count_xcq == 0) {
                    k_xcq = a_xcq[i_xcq];
                }
            }
            count_xcq = 0;
            for (i_xcq = 0; i_xcq < a_xcq.length; i_xcq++) {
                if (k_xcq == a_xcq[i_xcq]) {
                    count_xcq++;
                }
            }
            if(count_xcq>a_xcq.length/2)
            {
                System.out.println("出现次数超过一半的元素为："+k_xcq);
            }
            else{
                System.out.println("不存在出现次数超过一半的元素");
            }
        }
    }
}*/


/*package com.xcq;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a_xcq[]=new int [5];
        int i_xcq=0;
        System.out.print("请输入五个数：");
        for(i_xcq=0;i_xcq<5;i_xcq++)
        {
            int year_xcq = sc.nextInt();
            a_xcq[i_xcq]=year_xcq;
        }
        sc.close();
        int max_xcq=a_xcq[0];
        int min_xcq=a_xcq[0];
        for(i_xcq=1;i_xcq<= 4;i_xcq++) {
            if (a_xcq[i_xcq]>max_xcq){
                 max_xcq= a_xcq[i_xcq];
            }
            if (a_xcq[i_xcq]< min_xcq){
                min_xcq= a_xcq[i_xcq];
            }
        }
        System.out.println("最小值为："+min_xcq+"最大值为："+max_xcq);
    }
}*/
