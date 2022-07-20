import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("David Flesher", "123456", 100000.00, "Production", 10000000.00);
    }

    @Test
    public void hasName(){
        assertEquals("David Flesher", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("123456", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000.00, director.getSalary(), 0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Production", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(10000000.00, director.getBudget(), 0);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10000.00);
        assertEquals(110000.00, director.getSalary(), 0);
    }

    @Test
    public void canCalculateCorrectBonus(){
        assertEquals(10000.00, director.payBonus(), 0);
    }
}
