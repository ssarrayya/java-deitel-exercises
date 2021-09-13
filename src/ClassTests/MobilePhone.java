package ClassTests;

public class MobilePhone {
    private static final String INVALID_IMEI = "INVALID_IMEI";
    private String imei;
    private PhoneManufacturer make;
    private String model;
    private int storageSpace;
    private static int simCardSlots;

    private MobilePhone(){
        super();
    }

    public MobilePhone(String imei){
        if(imei == " "){
            this.imei = INVALID_IMEI;
        } else {
            this.imei = imei;
        }
    }

    public MobilePhone(String imei, PhoneManufacturer phoneMake) {
        this(imei);
         make = phoneMake;
    }

    public MobilePhone(String imei, PhoneManufacturer phoneMake, String model) {
        this(imei, phoneMake);
        this.model = model;
    }

    public MobilePhone(String imei, PhoneManufacturer phoneMake, int storage) {
        this(imei, phoneMake);
        storageSpace = storage;
    }

    public MobilePhone(String imei, PhoneManufacturer phoneMake, String model, int storage) {
        this(imei, phoneMake, model);
        storageSpace = storage;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public PhoneManufacturer getMake() {
        return make;
    }

    public void setMake(PhoneManufacturer make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }

    public int getSimCardSlots() {
        return simCardSlots;
    }

    public static void setSimCardSlots(int simCardSlots) {
        MobilePhone.simCardSlots = simCardSlots;
    }

    public Connection makeCall(int phoneNumber){
        //TODO make call
        Connection theCall = new Connection();
        return theCall;
    }

}
