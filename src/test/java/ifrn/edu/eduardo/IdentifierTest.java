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
    void deveAceitarIdentificadorComLetrasENumeros() {
        assertTrue(id.validateIdentifier("a1b2"));
    }

    @Test
    void deveRejeitarIdentificadorLongo() {
        assertFalse(id.validateIdentifier("abcdefg"));
    }

    @Test
    void deveRejeitarIdentificadorVazio() {
        assertFalse(id.validateIdentifier(""));
    }

    @Test
    void deveRejeitarIdentificadorComecandoComNumero() {
        assertFalse(id.validateIdentifier("1abc"));
    }

    @Test
    void deveRejeitarIdentificadorComCaracteresEspeciais() {
        assertFalse(id.validateIdentifier("ab#c"));
    }

    @Test
    void deveAceitarIdentificadorComSomenteLetras() {
        assertTrue(id.validateIdentifier("AbCdEf"));
    }

    @Test
    void deveRejeitarIdentificadorComApenasNumeros() {
        assertFalse(id.validateIdentifier("123"));
    }
}
