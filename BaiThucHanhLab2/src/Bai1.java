import java.util.Scanner;

public class Bai1 {

    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nSo1,nSo2;
            //Tổng hiệu tích thương
        System.out.print("Nhap so thu nhat");
        nSo1 = sc.nextInt();
        System.out.print("Nhap so thu hai");
        nSo2 = sc.nextInt();
        int nTong, nHieu, nTich, nThuong ,nPhanDu;
        nTong = nSo1 + nSo2;
        System.out.print("\nTong cua hai so la"+nTong);
        nHieu = nSo1 - nSo2;
        System.out.print("\nHieu cua hai so la"+nHieu);
        nTich = nSo1 * nSo2;
        System.out.print("\nTich cua hai so la"+nTich);
        nThuong = nSo1 / nSo2;
        System.out.print("\nThuong cua hai so la"+nThuong);
        nPhanDu = nSo1 % nSo2;
        System.out.print("\nPhanDu cua hai so la"+nPhanDu);
            //So sánh 2 số
        if(nSo1 > nSo2){
            System.out.print("\nSo lon hon la"+nSo1);
            System.out.print("\nSo be hon la"+nSo2);
        }
        else{
            System.out.print("\nSo lon hon la"+nSo2);
            System.out.print("\nSo be hon la"+nSo1);
        }        
        }     
        
    }
        
}
