package exercises.technology;

import org.junit.Before;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class LaptopTest  {

    Laptop testLaptop;
    Laptop testLaptop2;



    @Before
    public void createLaptopObject() {
        testLaptop = new Laptop("MacBook Air", 300, 15.4, 46);
        testLaptop2 = new Laptop("MacBook Air", 300, 15.4, 75);
    }

    @org.junit.jupiter.api.Test

    public void isChargedReturnsFalse() {
        createLaptopObject();
        assertFalse(testLaptop.isCharged());
    }

    @org.junit.jupiter.api.Test

    public void isChargedReturnsTrue(){
        createLaptopObject();
        assertTrue(testLaptop2.isCharged());
    }




}