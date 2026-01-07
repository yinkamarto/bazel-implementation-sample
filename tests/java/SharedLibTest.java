import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;
import org.junit.jupiter.api.Test;

import com.SharedLib;

public class SharedLibTest {

    @Test
    public void testGetRandomNumber() {
        assert 1 == SharedLib.getRandomNumber(2);
    }
}