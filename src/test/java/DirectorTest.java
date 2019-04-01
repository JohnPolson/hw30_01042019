import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("John Polson","JP1234567A", 74000.00, "IT", 2000000.00);
    }

    @Test
    public void hasName() {
        assertEquals("John Polson", director.getName());
    }

    @Test
    public void hasNi_number() {
        assertEquals("JP1234567A", director.getNi_number());
    }

    @Test
    public void hasSalary() {
        assertEquals(74000.00, director.getSalary(), 0.1);
    }

    @Test
    public void hasDepartment() {
        assertEquals("IT", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(2000000, director.getBudget(), 0.1);
    }

    @Test
    public void canSetBudget(){
        director.setBudget(3000000.00);
        assertEquals(3000000.00, director.getBudget(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10000.00);
        assertEquals(84000.00, director.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        director.payBonus();
        assertEquals(1480.00, director.getBonus(), 0.1);
    }
}

