import org.junit.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    DevIdata DI = new DevIdata();
    ProductionIdata PI = new ProductionIdata();
    @Test
    public void testDI(){
        assertEquals("Development", DI.getDepartment());
        assertEquals(BaseIdata.MainWork.Digital, DI.getMainWork());
    }

    @Test
    public void testPI(){
        assertEquals("Production", PI.getDepartment());
        assertEquals(BaseIdata.MainWork.Paper, PI.getMainWork());
    }
}
