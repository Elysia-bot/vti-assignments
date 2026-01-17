package BaiTapNgay10.Exercise;

class Car {

    private String name;
    private String type;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    class Engine {
        private String engineType;

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }
    }
}

