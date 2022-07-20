import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Amy Barclay", "123456", 70000.00, "Production");
    }

    @Test
    public void hasName(){
        assertEquals("Amy Barclay", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("123456", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(70000.00, manager.getSalary(), 0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Production", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000.00);
        assertEquals(80000.00, manager.getSalary(), 0);
    }

    @Test
    public void canCalculateCorrectBonus(){
        assertEquals(7000.00, manager.payBonus(), 0);
    }
}
