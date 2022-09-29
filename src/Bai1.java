import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arrInt = 0;
        int[] arr = {0};
        do {
            System.out.println("**********MENU*************");
            System.out.println("1.Nhap gia tri cac phan tu");
            System.out.println("2. Hien thi cac gia tri phan tu");
            System.out.println("3. In ra cac so nguyen to trong mang");
            System.out.println("4. Tim max,min trong mang");
            System.out.println("5. Sap xep mang giam dan");
            System.out.println("6. Thoat");
            System.out.println("Su lua chon cua ban la:");
            int bailam = sc.nextInt();
            switch (bailam) {
                case 1:
                    System.out.println("Nhap chi so cua mang");
                    arrInt = sc.nextInt();
                    arr = new int[arrInt];
                    System.out.println("Nhap gia tri cac phan tu cua mang");
                    for (int i = 0; i < arrInt; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("cac phan tu cua mang :");
                    for (int i = 0; i < arrInt; i++) {
                        System.out.printf("%d\t ", arr[i]);
                    }
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("cac so nguyen to trong mang la: ");
                    for (int i = 0; i < arrInt; i++) {
                        if (arr[i] >= 2) {
                            boolean check = false;
                            for (int j = 2; j < arr[i]; j++) {
                                if (arr[i] % j == 0) {
                                    check = true;
                                }
                            }
                            if (!check) {
                                System.out.printf("%d\t", arr[i]);
                            }
                        }
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    int min = arr[0];
                    for (int i = 1; i < arrInt; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.printf("Phan tu nho nhat la %d\n", min);
                    int max = arr[0];
                    for (int i = 1; i < arrInt; i++) {
                        if (arr[i] > min) {
                            max = arr[i];
                        }
                    }
                    System.out.printf("phan tu lon nhat la %d\n", max);
                    break;
                case 5:
                    for (int i = 0; i < arrInt; i++)
                        arr[i] = sc.nextInt();
                    for (int i = 0; i < ( arrInt - 1 ); i++) {
                        for ( int j = 0; j < arrInt - i - 1; j++) {
                            if (arr[j] < arr[j+1])
                            {
                                 arr[i] = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = arr[i];
                            }
                        }
                    }
                    System.out.println("Kết quả sau khi sắp xếp theo thứ tự giảm dần là: ");
                    for (int i = 0; i < arrInt; i++) {
                        System.out.print(arr[i] + "\t");
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-6");
            }
        } while (true);
    }
}

