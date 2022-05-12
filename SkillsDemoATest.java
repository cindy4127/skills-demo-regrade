import static org.junit.Assert.*;
import org.junit.*;

public class SkillsDemoATest {
    // this is a test file for the factorial function
    @test
    public void factorial(){
        assertEquals(720, SkillsDemoA.factorial(8)); //fails initally
    }
}