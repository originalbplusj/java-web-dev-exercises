package exercises.technology;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    Computer testComputer;
    //
    @org.junit.jupiter.api.Test
    public void updateOsCorrectly() {
        testComputer = new Computer("iMac", 400, 15.3);
        assertEquals(15.4, testComputer.updateOs());
    }

    @org.junit.jupiter.api.Test
    public void connectWifiSuccessful() {
        testComputer = new Computer("iMac", 400, 15.3);
        assertEquals(true, testComputer.connectWifi());
    }

    @org.junit.jupiter.api.Test
    public void downloadMediaWithAvailableMemory() {
        testComputer = new Computer("iMac", 400, 15.3);
        assertEquals(350, testComputer.downloadMedia(50));
    }
}