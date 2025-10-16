package ifrn.edu.eduardo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IdentifierTest {

    Identifier id = new Identifier();

    @Test
    void deveAceitarUmCaractere() {
        assertTrue(id.validateIdentifier("a"));
    }
    @Test
    void deveAceitarMaxinoCaracteres() {
        assertTrue(id.validateIdentifier("abc123"));
    }

    @Test
    void deveRejeitarIdentificadoresVazios() {
        assertFalse(id.validateIdentifier(""));
    }

    @Test
    void deveRejeitarIdentificadorComecandoComNumero() {
        assertFalse(id.validateIdentifier("1abc"));
    }
    @Test
    void deveRejeitarIdentificadorComCaracteresEspeciais() {
        assertFalse(id.validateIdentifier("ab@12"));
    }

    @Test
    void deveAceitarIdentificadorComSomenteLetras() {
        assertTrue(id.validateIdentifier("abcde"));
    }
    @Test
    void deveRejeitarIdentificadorComApenasNumeros() {
        assertFalse(id.validateIdentifier("23424"));
    }

    @Test
    void deveAceitarIdentificadorComLetraeNumero() {
        assertTrue(id.validateIdentifier("a1"));
    }

    @Test
    void deveRejeitarIdentificadorComEspaco() {
        assertFalse(id.validateIdentifier("ab c"));
    }

    @Test
    void deveRejeitarIdentificadorLongo() {
        assertFalse(id.validateIdentifier("abcdef1"));
    }

}
