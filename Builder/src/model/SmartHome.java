package model;

public class SmartHome {

    private String name;
    private int serialNumber;
    private String addressName;
    private String addressNumber;
    private String city;
    private String country;
    private String postalCode;
    private int light1PortNum;
    private int light2PortNum;
    private int door1PortNum;
    private int door2PortNum;
    private int microwavePortNum;
    private int tvPortNum;
    private int waterHeaterPortNum;

    public SmartHome(String name, int serialNumber, String addressName, String addressNumber, String city, String country, String postalCode, int light1PortNum, int light2PortNum, int door1PortNum, int door2PortNum, int microwavePortNum, int tvPortNum, int waterHeaterPortNum) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.addressName = addressName;
        this.addressNumber = addressNumber;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.light1PortNum = light1PortNum;
        this.light2PortNum = light2PortNum;
        this.door1PortNum = door1PortNum;
        this.door2PortNum = door2PortNum;
        this.microwavePortNum = microwavePortNum;
        this.tvPortNum = tvPortNum;
        this.waterHeaterPortNum = waterHeaterPortNum;
    }

    @Override
    public String toString() {
        return "SmartHome{" +
                "name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                ", addressName='" + addressName + '\'' +
                ", addressNumber='" + addressNumber + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", light1PortNum=" + light1PortNum +
                ", light2PortNum=" + light2PortNum +
                ", door1PortNum=" + door1PortNum +
                ", door2PortNum=" + door2PortNum +
                ", microwavePortNum=" + microwavePortNum +
                ", tvPortNum=" + tvPortNum +
                ", waterHeaterPortNum=" + waterHeaterPortNum +
                '}';
    }

    static public class SmartHomeBuilder {
        private String name;
        private int serialNumber;
        private String addressName;
        private String addressNumber;
        private String city;
        private String country;
        private String postalCode;
        private int light1PortNum;
        private int light2PortNum;
        private int door1PortNum;
        private int door2PortNum;
        private int microwavePortNum;
        private int tvPortNum;
        private int waterHeaterPortNum;

        public SmartHomeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public SmartHomeBuilder withSerialNumber(int serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public SmartHomeBuilder withAddressName(String addressName) {
            this.addressName = addressName;
            return this;
        }

        public SmartHomeBuilder withAddressNumber(String addressNumber) {
            this.addressNumber = addressNumber;
            return this;
        }

        public SmartHomeBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public SmartHomeBuilder withCountry(String country) {
            this.country = country;
            return this;
        }

        public SmartHomeBuilder withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public SmartHomeBuilder withLight1PortNum(int light1PortNum) {
            this.light1PortNum = light1PortNum;
            return this;
        }

        public SmartHomeBuilder withLight2PortNum(int light2PortNum) {
            this.light2PortNum = light2PortNum;
            return this;
        }

        public SmartHomeBuilder withDoor1PortNum(int door1PortNum) {
            this.door1PortNum = door1PortNum;
            return this;
        }

        public SmartHomeBuilder withDoor2PortNum(int door2PortNum) {
            this.door2PortNum = door2PortNum;
            return this;
        }

        public SmartHomeBuilder withMicrowavePortNum(int microwavePortNum) {
            this.microwavePortNum = microwavePortNum;
            return this;
        }

        public SmartHomeBuilder withTvPortNum(int tvPortNum) {
            this.tvPortNum = tvPortNum;
            return this;
        }

        public SmartHomeBuilder withWaterHeaterPortNum(int waterHeaterPortNum) {
            this.waterHeaterPortNum = waterHeaterPortNum;
            return this;
        }

        public SmartHome build() {
            return new SmartHome(name,serialNumber,addressName,addressNumber,city,country,postalCode,light1PortNum,light2PortNum,door1PortNum,door2PortNum,microwavePortNum,tvPortNum,waterHeaterPortNum);
        }
    }
}
