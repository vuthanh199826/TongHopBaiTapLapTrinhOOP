package bai9;

public class ManageBienLai {
    private BienLai [] array = new BienLai[10];
    private int index = 0;

    public ManageBienLai() {
    }
    public void addBienLai(BienLai bienLai){
        array[index] = bienLai;
        index++;
    }
    public void displayAllBienLai(){
        for (int i = 0; i < index; i++) {
            System.out.println(array[i]);
        }
    }
    public int searchViTri(int maSoCongToDien){
        for (int i = 0; i < index; i++) {
            if(array[i].getKhachHang().getMaSoCongToDien()==maSoCongToDien){
                return i;
            }
        }
        return -1;

    }
    public BienLai getBienLai(int maSoCongToDien){
        int indexBienLai = searchViTri(maSoCongToDien);
        return array[indexBienLai];
    }


    public void fixBienLai(int maSoCongToDien, BienLai bienLai){
        int indexOfFix = searchViTri(maSoCongToDien);
        if(indexOfFix >= 0){
            array[indexOfFix] = bienLai;
        }else {
            System.out.println("Invalid");
        }

    }

    public void deleteBienLai(int maSoCongToDien){
       int indexOfDelete = searchViTri(maSoCongToDien);
        if(indexOfDelete >= 0){
            for (int i = indexOfDelete; i < index; i++) {
                array[i] = array[i+1];
                array[i+1] = null;
            }
            System.out.println("Success!!!");
            index--;
        }else {
            System.out.println("Invalid");
        }
    }

}
