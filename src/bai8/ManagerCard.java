package bai8;

public class ManagerCard {
    private Card [] cards = new Card[10];
    private int index =0;

    public ManagerCard() {
    }
     public void addCard(Card obj){
        cards[index]= obj;
        index++;
     }
     public void deleteCard(String id){
        int indexOfdelete = -1;
        boolean finded = false;
         for (int i = 0; i < index; i++) {
             if(cards[i].getId().equals(id)){
                 indexOfdelete = i;
                 finded = true;
                 break;
             }
         }
         if(finded) {
             for (int i = indexOfdelete; i < index; i++) {
                 cards[i] = cards[i + 1];
                 cards[i + 1] = null;
             }
             index--;
             System.out.println("Success!!!");
         }else {
             System.out.println("Invalid");
         }

     }
     public void displayCards(){
         for (int i = 0; i < index; i++) {
             System.out.println(cards[i]);
         }
     }
}
