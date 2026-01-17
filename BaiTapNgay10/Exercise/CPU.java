package BaiTapNgay10.Exercise;

class CPU {

    private double price;

    public CPU(double price) {
        this.price = price;
    }

    class Processor {
        private int coreAmount;
        private String menufacturer;

        public Processor(int coreAmount, String menufacturer) {
            this.coreAmount = coreAmount;
            this.menufacturer = menufacturer;
        }

        public double getCache() {
            return 4.3;
        }
    }

    class Ram {
        private int memory;
        private String menufacturer;

        public Ram(int memory, String menufacturer) {
            this.memory = memory;
            this.menufacturer = menufacturer;
        }

        public double getClockSpeed() {
            return 5.5;
        }
    }
}

