package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecryptingTest {
    private Decrypting decoder;

    @BeforeEach
    void startTestsWith() {
        decoder = new Decrypting();
    }

    @Test
    void testThatUserInputsFourDigitNumber(){
        decoder.decoder(1234);
    }
}
