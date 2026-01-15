package BaiTapNgay9.Exercise4;

import BaiTapNgay9.Exercise3.MyMap;

class Staff<K extends Number> extends MyMap<K, String> {
    K getId() { return key; }
    String getName() { return value; }
}

