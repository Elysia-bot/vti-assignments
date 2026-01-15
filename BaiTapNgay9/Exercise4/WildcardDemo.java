package BaiTapNgay9.Exercise4;

import java.util.*;

public class WildcardDemo {
    public static void main(String[] args) {
        ArrayList<Object> listWildcards = new ArrayList<>();
        listWildcards.add("Nguyễn Văn Nam");
        listWildcards.add(30);
        listWildcards.add("Hà Đông, Hà Nội");

        listWildcards.forEach(System.out::println);
    }
}

