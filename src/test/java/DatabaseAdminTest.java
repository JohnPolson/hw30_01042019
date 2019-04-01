import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() { databaseAdmin = new DatabaseAdmin("Gordon Renfrew","GR1234567A", 40000.00); }

    @Test
    public void hasName() {
        assertEquals("Gordon Renfrew", databaseAdmin.getName());
    }

    @Test
    public void hasNi_number() {
        assertEquals("GR1234567A", databaseAdmin.getNi_number());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000.00, databaseAdmin.getSalary(), 0.1);
    }

}
