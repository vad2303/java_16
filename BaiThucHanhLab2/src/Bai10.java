import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap vao chuoi ki tu");
            String str = sc.nextLine();

            System.out.println("Nhap vao ki tu");
            char chr = sc.next().charAt(0);

            int count = 0;
            for(int i = 0;i < str.length(); i++ ){
                if(str.charAt(i) == chr){
                    count ++;
                }
            }
            System.out.println("So lan xuat hien ki tu " + chr + " trong chuoi la " + count);
        }
    }
}