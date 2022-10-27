import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Tests for Oblig 2")
public class TestLeapYear {

    @Test
    @DisplayName("Are tests running?")
    public void areTestsRunning(){

    }

    @Test
    @DisplayName("Is 4 a leap year?")
    void test4LeapYear(){
        assertEquals(true, LeapYear.isLeapYear(4));
    }

    @Test
    @DisplayName("Is 5 not a leap year?")
    void test5LeapYear(){
        assertEquals(false, LeapYear.isLeapYear(5));
    }

    @Test
    @DisplayName("Is 100 not a leap year?")
    void test100LeapYear(){
        assertEquals(false, LeapYear.isLeapYear(100));
    }

    @Test
    @DisplayName("Is 111 not a leap year?")
    void test111LeapYear(){
        assertEquals(false, LeapYear.isLeapYear(111));
    }

    @Test
    @DisplayName("Is 400 a leap year?")
    void test400LeapYear() {
        assertEquals(true, LeapYear.isLeapYear(400));
    }

    @Test
    @DisplayName("Is 873 not a leap year?")
    void test873LeapYear(){
        assertEquals(false, LeapYear.isLeapYear(873));
    }

    @Test
    @DisplayName("Is 1999 not a leap year?")
    void test1999LeapYear(){
        assertEquals(false, LeapYear.isLeapYear(1999));
    }

    @Test
    @DisplayName("Is 2000 a leap year?")
    void test2000LeapYear(){
        assertEquals(true, LeapYear.isLeapYear(2000));
    }


}
//here be changes
