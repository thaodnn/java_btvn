import java.util.Scanner;

public class Array {
    public void intArrray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size mang: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Nhap phan tu mang a: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("In mảng: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Phan tu index = 2 la: " + a[2]);
        int sum = 0;
        int sum1 = 0;
        System.out.println("In ra phan tu chan: ");
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            if (a[i] % 2 == 0) {
                sum1 = sum1 + a[i];
                System.out.println(a[i]);
            }
        }
        System.out.println("Tong phan tu chan trong mang: " + sum1);
        System.out.println("Tong phan tu trong mang: " + sum);
        System.out.println("Gia tri lon nhat cua mang: " +maxofArray(a));
        System.out.println("Index gia tri lon nhat cua mang: " +indexofArray(a, maxofArray(a)));
        System.out.println("Gia tri lon thu 2 cua mang: " +max2ofArray(a));
        System.out.println("Index gia tri lon thu 2 cua mang: " +indexofArray(a, max2ofArray(a)));
        System.out.println("Gia tri nho nhat cua mang: " +minofArray(a));
        System.out.println("Index gia tri nho nhat cua mang: " +indexofArray(a, minofArray(a)));
        sxMangT(a);
        System.out.println("Mang sau khi sap xep tang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        } 
        sxMangG(a);
        System.out.println("Mang sau khi sap xep giam: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        } 
    }

    public void sxMangT(int ar[]) {
        int temp = ar[0];
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
    }

    public void sxMangG(int ar[]) {
        int temp = ar[0];
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
    }

    static int maxofArray(int ar[]){
        int max = ar[0];
        for ( int i = 0; i < ar.length; i++){
            if (max <=  ar[i]){
                max = ar[i];
            }
        }
        return max;
    }

    static int max2ofArray(int ar[]){
        int max = ar[0];
        int max2 = ar[0];
        for ( int i = 0; i < ar.length; i++){
            if (max <=  ar[i]){
                max = ar[i];       
                for (int j = 0; j < ar.length; j++){
                    if (ar[j] < max && max2 <= ar[j]){
                        max2 = ar[j];
                    }
                }
            }
        }
        
        return max2;
    }

    static int minofArray(int ar[]){
        int min = ar[0];
        for (int i = 0; i < ar.length; i++){
            if (min >=  ar[i]){
                min = ar[i];
            }
        }
        return min;
    }
    static int indexofArray(int ar[], int x){
        int index = 0;
        for (int i = 0; i < ar.length; i++){
            if (ar[i]==x){
                index = i;
                break;
            }
        }
        return index;

    }
}
