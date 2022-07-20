import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Ryan Barclay", "123456", 30000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Ryan Barclay", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("123456", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(10000.00);
        assertEquals(40000.00, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canCalculateCorrectBonus(){
        assertEquals(3000.00, databaseAdmin.payBonus(), 0);
    }
}
