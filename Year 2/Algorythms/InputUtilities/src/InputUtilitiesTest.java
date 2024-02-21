import static org.junit.jupiter.api.Assertions.assertEquals;

class InputUtilitiesTest {
    //Multiple3r5
    @org.junit.jupiter.api.Test
    void ThirtyShouldBeAmultiple3r5() {
        int num = 30;
        assertEquals(true, InputUtilities.multiple3r5(num));
    }

    @org.junit.jupiter.api.Test
    void TwentyTwoShouldntBeAmultiple3r5() {
        int num = 22;
        assertEquals(false, InputUtilities.multiple3r5(num));
    }

    @org.junit.jupiter.api.Test
    void TwentyShouldBeAmultiple3r5() {
        int num = 20;
        assertEquals(true, InputUtilities.multiple3r5(num));
    }

    @org.junit.jupiter.api.Test
    void TwelveShouldBeAmultiple3r5() {
        int num = 12;
        assertEquals(true, InputUtilities.multiple3r5(num));
    }


    //largest Num
    @org.junit.jupiter.api.Test
    void Num1IsHighest() {
        int num1 = 12;
        int num2 = 10;
        int num3 = 7;
        assertEquals(num1, InputUtilities.checkLargest(num1,num2,num3));
    }
    @org.junit.jupiter.api.Test
    void Num2IsHighest() {
        int num1 = -12;
        int num2 = -2;
        int num3 = -132;
        assertEquals(num2, InputUtilities.checkLargest(num1,num2,num3));
    }
    @org.junit.jupiter.api.Test
    void Num3IsHighest() {
        int num1 = 65;
        int num2 = 42;
        int num3 = 123;
        assertEquals(num3, InputUtilities.checkLargest(num1,num2,num3));
    }

    //swap 4char string first two to last two
    @org.junit.jupiter.api.Test
    void swap2letters() {
        String input = "ABCD";
        assertEquals("CDAB", InputUtilities.Swap(input));

    }
    @org.junit.jupiter.api.Test
    void swap2nums() {
        String input = "9832";
        assertEquals("3298", InputUtilities.Swap(input));
    }
    @org.junit.jupiter.api.Test
    void swap2numsNletters() {
        String input = "AB32";
        assertEquals("32AB", InputUtilities.Swap(input));
    }

    //temp converter (rounded up)
    @org.junit.jupiter.api.Test
    void tempconvertCtoF() {
        int temp = 7;
        String Measure = "c";
        assertEquals(45, InputUtilities.tempConverter(temp,Measure));
    }
    @org.junit.jupiter.api.Test
    void tempconvertFtoC() {
        int temp = 87;
        String Measure = "F";
        assertEquals(31, InputUtilities.tempConverter(temp,Measure));
    }

    @org.junit.jupiter.api.Test
    void tempconvertMinusCtoF() {
        int temp = -2;
        String Measure = "f";
        assertEquals(48, InputUtilities.tempConverter(temp,Measure));
    }

    }