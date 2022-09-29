import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua ma tran");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao so cot cua ma tran");
        int m = Integer.parseInt(sc.nextLine());
        float[][] matran = new float[n][m];
//        System.out.println("Nhap cac gia tri cua phan tu ma tran");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.printf("matran[%d][%d]=",i,j);
//                matran[i][j] = Float.parseFloat(sc.nextLine());
//            }
//        }
        do {
            System.out.println("******MENU*******");
            System.out.println("1. Nhap cac gia tri cua mang :");
            System.out.println("2. Hien thi gia tri cua mang :");
            System.out.println("3. In ra cac phan tu nam tren cheo chinh, cheo phu va tinh tong :");
            System.out.println("4. Sx mang tang dan theo cot :");
            System.out.println("5. Thoat");
            System.out.println("Su lua chon cua ban la :");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhap cac gia tri cua phan tu ma tran");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("matran[%d][%d]=",i,j);
                            matran[i][j] = Float.parseFloat(sc.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Mang moi la: ");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(matran[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Cac phan tu nam tren duong cheo chinh la" );
                    float sumChinh = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i==j){
                                System.out.printf("%f\t",matran[i][j]);
                                sumChinh+=matran[i][j];
                            }
                        }
                    }
                    System.out.printf("\n");
                    System.out.println("Tong cac phan tu nam tren duong cheo chinh la" +sumChinh);
                    ///
                    System.out.println("Cac phan tu nam tren duong cheo phu la :");
                    float sumPhu = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i+j==n-1){
                                //phan tu nam tren cheo phu
                                System.out.printf("%f\t",matran[i][j]);
                                sumPhu+=matran[i][j];
                            }
                        }
                    }
                    System.out.printf("\n");
                    System.out.println("Tong cac phan tu nam tren duong cheo phu la" +sumPhu);
                    break;
                case 4:

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Vui long nhap tu 1-5");
            }
        }while (true);
    }
}
