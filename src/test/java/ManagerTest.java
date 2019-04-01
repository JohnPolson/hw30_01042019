import Management.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Ruben Sanchez","RS1234567A", 58000.00, "IT");
    }

    @Test
    public void hasName() {
        assertEquals("Ruben Sanchez", manager.getName());
    }

    @Test
    public void hasNi_number() {
        assertEquals("RS1234567A", manager.getNi_number());
    }

    @Test
    public void hasSalary() {
        assertEquals(58000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void hasDepartment() {
        assertEquals("IT", manager.getDeptName());
    }


}
