package HomeWork27.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PersonsTest {
    Person person;
    String startEmail = "jonn@test.com";
    String startPassword = "YYdgен12!";


    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);

    }
    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";
        person.setEmail(validEmail);
        assertEquals(validEmail, person.getEmail());
        assertNotEquals(startEmail, person.getEmail());


    }
    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {
        person.setEmail(invalidEmail);
        assertEquals(startEmail, person.getEmail());
        assertNotEquals(invalidEmail, person.getEmail());

    }
    static Stream<String> invalidEmailData() {

        return Stream.of("jjshd@@uuyey...",
                "@6365llkd",
                "ter1.sdfd.dfd",
                ".@",
                "kjsfhowehfew",
                "_est@ududfg.com");

    }
    @Test
    void testValidPasswordSet() {
        String validPassword = "ttrYU!123";
        person.setPassword(validPassword);
        assertEquals(validPassword, person.getPassword());
        assertNotEquals(startPassword, person.getPassword());
    }
    @ParameterizedTest
    @MethodSource("invalidPasswortData")
    void testInvalidPasswordSet(String invalidPassword) {
        person.setPassword(invalidPassword);
        assertEquals(startPassword, person.getPassword());
        assertNotEquals(invalidPassword, person.getPassword());
    }
    static Stream<String> invalidPasswortData() {
        return Stream.of("Yfg+12f", // 7 simbol
                "sert!123h",// Only LC
                "123((YTYUI",// Only DC
                "@gdhsdUYUE",// Not Digit
                "19283747",// Only Digit
                "HGgdyu12+",// Not !%$@&*()[] -> +
                "!%$@&*()[]",// Only !%$@&*()[]
                "");//""
    }


}
