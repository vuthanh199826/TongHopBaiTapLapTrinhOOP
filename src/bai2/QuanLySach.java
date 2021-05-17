package bai2;


public class QuanLySach {
    private final TaiLieu[] danhsach;
    private int index;

    public QuanLySach() {
        this.danhsach = new TaiLieu[10];
        this.index = 0;
    }

    public void addTaiLieu(TaiLieu obj) {
        danhsach[index] = obj;
        index++;
    }

    public void deleteTailieu(int maTaiLieu) {
        int indexOfXoa = -1;
        for (int i = 0; i < index; i++) {
            if (maTaiLieu == danhsach[i].getMATAILIEU()) {
                indexOfXoa = i;
                break;
            }
        }
        if (indexOfXoa >= 0) {
            danhsach[indexOfXoa] = null;
            for (int i = indexOfXoa; i < index; i++) {
                danhsach[i] = danhsach[i + 1];
                danhsach[i + 1] = null;
            }
            System.out.println("Xoa thanh cong 1");
            index--;
        } else {
            System.out.println("Khong tim thay ma tai lieu nay");
        }
    }

    public void displayTaiLieu() {
        for (int i = 0; i < index; i++) {
            System.out.println(danhsach[i]);
        }
    }

    public void searchTaiLieu(int type) {
        switch (type) {
            case 1:
                boolean hasSach = false;
                for (int i = 0; i < index; i++) {
                    if (danhsach[i] instanceof Sach) {
                        System.out.println(danhsach[i]);
                        hasSach = true;
                    }
                }
                if (!hasSach) {
                    System.out.println("Khong tim thay sach");
                }
                break;
            case 2:
                boolean hasTapChi = false;
                for (int i = 0; i < index; i++) {
                    if (danhsach[i] instanceof TapChi) {
                        System.out.println(danhsach[i]);
                        hasTapChi = true;
                    }
                }
                if (!hasTapChi) {
                    System.out.println("Khong tim thay tap chi");
                }
                break;
            case 3:
                boolean hasBao = false;
                for (int i = 0; i < index; i++) {
                    if (danhsach[i] instanceof Bao) {
                        System.out.println(danhsach[i]);
                        hasBao = true;
                    }
                }
                if (!hasBao) {
                    System.out.println("Khong tim thay bao");
                }
                break;
        }
    }


}
