import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by AWShades on 3/2/2017.
 */
public class TableTest {
    @org.junit.Test
    public void availableup() throws Exception {
        Table myTable = new Table(2);
        myTable.availableup();
        int a = myTable.getAvailable();
        assertEquals(a,3);
    }

    @org.junit.Test
    public void availabledown() throws Exception {
        Table myTable = new Table(2);
        myTable.availabledown();
        int a = myTable.getAvailable();
        assertEquals(a, 1);
    }
    @org.junit.Test
    public void checkavailable() throws Exception {
        Table myTable = new Table(1);
        myTable.availabledown();
        boolean a = myTable.checkavailable();
        assertEquals(a,false);
    }

}