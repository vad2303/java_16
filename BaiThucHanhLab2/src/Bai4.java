import java.util.Scanner;

public class Bai4 { public static void main(String[] args) {
    int thang;
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Nhap thang: ");
        thang = sc.nextInt();

        switch(thang){
            case 1:
            System.out.println( "thang mot");
            break;
            case 2:
            System.out.println( "thang hai");
            break;
            case 3:
            System.out.println( "thang ba");
            break;
            case 4:
            System.out.println("thang tu");
            break;
            case 5:
            System.out.println("thang nam");
            break;
            case 6:
            System.out.println( "thang sau");
            break;
            case 7:
            System.out.println( "thang bay");
            break;
            case 8:
            System.out.println( "thang tam");
            break;
            case 9:
            System.out.println( "thang chin");
            break;
            case 10:
            System.out.println( "thang muoi");
            break;
            case 11:
            System.out.println( "thang muoi mot");
            break;
            case 12:
            System.out.println( "thang muoi hai");
            break;
        default:
            System.out.println( "thang nay khong ton tai");
        
        }

    }
    
}
}
