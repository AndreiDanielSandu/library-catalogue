package creation.catalogues;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class BritishLibraryCatalogueTest {

    @Test
    public void onlyOneInstanceIsEverCreated() {
        BritishLibraryCatalogue first  = BritishLibraryCatalogue.getInstance();
        BritishLibraryCatalogue second = BritishLibraryCatalogue.getInstance();

        assertSame(first, second);
    }
}
