import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void testCurrentStationRegularFlow() {
       Radio radio = new Radio();

               radio.setCurrentStation(3);
               int actual = radio.getCurrentStation();
               int expected = 3;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testCurrentStationBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);
        radio.setCurrentStation(-3);
        int actual = radio.getCurrentStation();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationOverNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);
        radio.setCurrentStation(13);
        int actual = radio.getCurrentStation();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextResetToZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void testPrevRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextResetToNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void testSetVolumeRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        int actual = radio.getCurrentVolume();
        int expected = 50;

        Assertions.assertEquals(expected, actual);
    }





    @Test
    public void testSetVolumeRegularFlow1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.setCurrentVolume(150);
        int actual = radio.getCurrentVolume();
        int expected = 50;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumeRegularFlow2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.setCurrentVolume(-50);
        int actual = radio.getCurrentVolume();
        int expected = 50;

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void testIncreaseVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 51;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.decreaceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 49;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}