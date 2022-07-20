import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Ewan Cruickshank", "123456", 25000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Ewan Cruickshank", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("123456", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000.00, developer.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(10000.00);
        assertEquals(35000.00, developer.getSalary(), 0);
    }

    @Test
    public void canCalculateCorrectBonus(){
        assertEquals(2500.00, developer.payBonus(), 0);
    }
}
