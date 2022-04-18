package exercises.technology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartPhoneTest  {

    SmartPhone testSmartPhone;



    @Test
    void findSignalSuccessful() {
        testSmartPhone = new SmartPhone("iPhone 13", 82, 15.7, "T-Mobile");
        assertTrue(testSmartPhone.findSignal());
    }
}