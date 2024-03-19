import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kiemthu_dong_du_lieu {

        @Test
        public void testInvalidAge() {
            assertEquals("Invalid", Main.calculateAgeCategory(-1));
        }

        @Test
        public void testChildAge() {
            assertEquals("Child", Main.calculateAgeCategory(0));
            assertEquals("Child", Main.calculateAgeCategory(12));
        }

        @Test
        public void testTeenagerAge() {
            assertEquals("Teenager", Main.calculateAgeCategory(13));
            assertEquals("Teenager", Main.calculateAgeCategory(19));
        }

        @Test
        public void testAdultAge() {
            assertEquals("Adult", Main.calculateAgeCategory(20));
            assertEquals("Adult", Main.calculateAgeCategory(59));
        }

        @Test
        public void testSeniorAge() {
            assertEquals("Senior", Main.calculateAgeCategory(60));
            assertEquals("Senior", Main.calculateAgeCategory(100));
        }
    }


