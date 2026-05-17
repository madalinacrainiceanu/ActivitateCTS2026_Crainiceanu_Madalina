package TestareUnitara;

import static org.junit.jupiter.api.Assertions.*;

    public class CalatorAbonatTest {

        @org.junit.Test
        public void testPlatesteBilet(){
            CalatorAbonat calator=new CalatorAbonat("Gigel");
            calator.setSold(24.00f);

            calator.platesteBilet(5.00f);
            assertEquals(19.00f, calator.getSold(), 0.001);
        }

        @org.junit.Test
        public void testPlatesteBiletInsuficient(){
            CalatorAbonat calator=new CalatorAbonat("Ionel");
            calator.setSold(30.00f);
            calator.platesteBilet(10.0f);
            assertEquals(30.00f, calator.getSold(), 0.001);
        }
    }