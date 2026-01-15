package BaiTapNgay9.Exercise4;

class MyMath<T extends Number> {
    double sum(T... nums) {
        double s = 0;
        for (T n : nums) s += n.doubleValue();
        return s;
    }

    double power(T a, T b) {
        return Math.pow(a.doubleValue(), b.doubleValue());
    }
}

