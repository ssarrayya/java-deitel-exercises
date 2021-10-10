package classtests;

import org.junit.jupiter.api.BeforeEach;

public class MobilePhoneTests {
    MobilePhone sarahPhone;
    MobilePhone nnennaPhone;

    @BeforeEach
    void setUp() {
        sarahPhone = new MobilePhone("sarahimei", PhoneManufacturer.REDMI);
        sarahPhone.setModel("Redmi Note 9S");
        sarahPhone.setStorageSpace(128);
        sarahPhone.makeCall(809253342);

        MobilePhone.setSimCardSlots(2);

        nnennaPhone = new MobilePhone("nnennaimei", PhoneManufacturer.SAMSUNG, 64);
    }

    void showSimCardSlots() {
        System.out.println("The number of sim card slots in Sarah's phone are " + sarahPhone.getSimCardSlots());
        System.out.println("The number of sim card slots in Nnenna's phone are " + nnennaPhone.getSimCardSlots());
    }
}
