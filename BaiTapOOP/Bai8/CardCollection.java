package BaiTapOOP.Bai8;

import OOP.DefaultAndStatic.A;

import java.util.ArrayList;

public class CardCollection {

    private ArrayList<Card> listCard = new ArrayList<>();

    public CardCollection() {
        this.listCard = new ArrayList<>();
    }

    public ArrayList<Card> getListCard() {
        return listCard;
    }

    public void addCard(Card card) {
        listCard.add(card);
    }

    public void removeCard(String rentCode) {

        ArrayList<Card> listDel = new ArrayList<>();

        for (int i = 0; i < listCard.size(); i++) {
            if (listCard.get(i).getRentCode().equals(rentCode)) {
                listDel.add(listCard.get(i));
            }
        }

        if (listDel.isEmpty()) {
            System.out.println("Không có mã tài liệu này");
        }
        else
        {
            listDel.remove(0);
            System.out.println("Đã xoá thẻ mượn mã: " + rentCode);
        }
    }

    public void display() {
        listCard.forEach(element -> System.out.println(element));
    }
}














































