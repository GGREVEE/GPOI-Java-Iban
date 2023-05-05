import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
public class TestIBAN {
    private IBAN iban;
    @Before
    public void init(){
        iban=new IBAN();


    }
    @Test
    public void testverificaIbanCorretto(){
        iban.setIban("IT39S0300203280758493646878");
        assertTrue(iban.verificaIban());
    }

    @Test
    public void testVerificaIbanErrato(){
        iban.setIban("IT39S0300203280758493646452");
        assertFalse(iban.verificaIban());
    }

    @Test
    public void testVerificaIbanLungo(){
        iban.setIban("IT39S0300203280758493646878892134");
        assertFalse(iban.verificaIban());
        
    }

    @Test
    public void testVerificaIbanNullo(){
        iban.setIban("");
        assertThrows(NullPointerException.class, () -> { iban.verificaIban();
        });
    }
}
