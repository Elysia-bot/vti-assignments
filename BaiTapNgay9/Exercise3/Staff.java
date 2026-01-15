package BaiTapNgay9.Exercise3;

class Staff<K extends Number> extends MyMap<K, String> {
    K getId() { return key; }
    String getName() { return value; }
}

