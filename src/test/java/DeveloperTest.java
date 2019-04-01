import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Tony Starke","TS1234567A", 52000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Tony Starke", developer.getName());
    }

    @Test
    public void canSetName() {
        developer.setName("Anthony Starke");
        assertEquals("Anthony Starke", developer.getName() );
    }

    @Test
    public void cannotSetNullName() {
        developer.setName("");
        assertEquals("Tony Starke", developer.getName() );
    }

    @Test
    public void hasNi_number() {
        assertEquals("TS1234567A", developer.getNi_number());
    }

    @Test
    public void hasSalary() {
        assertEquals(52000.00, developer.getSalary(), 0.1);
    }

    @Test
    public void cannotRaiseSalaryByNegative() {
        developer.raiseSalary(-10000.00);
        assertEquals(52000.00, developer.getSalary(), 0.1);
    }

}
