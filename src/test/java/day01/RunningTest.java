package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningTest {

    @Test
    void loadFileTest() {

        Running running = new Running();

        running.loadFile("src/test/resources/running.csv");

        assertEquals(7, running.getData().size());
    }

    @Test
    void avgTest() {

        Running running = new Running();

        running.loadFile("src/test/resources/running.csv");

        assertEquals(7, running.getData().size());
        assertEquals(25.9, running.sumofRunningInMonth(2022,01), 0.0002);
    }
}