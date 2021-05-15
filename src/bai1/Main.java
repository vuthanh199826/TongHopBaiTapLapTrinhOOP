package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn danh sách có bao nhiêu phần tử?");
        int size = sc.nextInt();
        QLCB ql = new QLCB(size);
        int option = - 1;
        while (option!=0){
            display();
            System.out.println("Nhập lựa chọn vào đây");
            option = sc.nextInt();
            switch (option){
                case 1:
                    int choice;
                    System.out.println("Bạn muốn thêm cán bộ nào?");
                    System.out.println("1.Công nhân   2.Kỹ Sư    3.Nhân Viên");
                    choice = sc.nextInt();
                    ql.addCanBo(choice);
                    break;
                case 2:
                    ql.searchCanBo();
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
