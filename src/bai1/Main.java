package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn danh sách có bao nhiêu phần tử?");
        int size = sc.nextInt();
        sc.nextLine();
        QLCB ql = new QLCB(size);
        int option;
        while (true){
            display();
            System.out.println("Nhập lựa chọn vào đây");
            option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    System.out.println("Nhập tên");
                    String name = sc.nextLine();
                    System.out.println("Nhập tuổi");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập giới tính (String)");
                    String gender = sc.nextLine();
                    System.out.println("Nhập địa chỉ");
                    String address = sc.nextLine();
                    ql.addCanBo(name,age,gender,address);
                    break;
                case 2:
                    System.out.println("Nhập tên muốn tìm");
                    String nameOfSearch = sc.nextLine();
                    System.out.println(ql.searchCanBo(nameOfSearch));
                    break;
                case 3:
                    ql.displayCanbo();
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
    public static void display(){
        System.out.println("==================Menu===============");
        System.out.println("1. Thêm mới cán bộ");
        System.out.println("2. Tìm kiếm theo tên");
        System.out.println("3. Hiển thị thông tin danh sách cán bộ");
        System.out.println("0. Thoát");
        System.out.println("======================================");
    }
}
