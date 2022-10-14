import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MainTest {

    @Test
    void solutionWithNumbers() {
        Assertions.assertEquals("100", Main.Solution("100"));
    }

    @Test
    void solutionWithLetters(){
        Assertions.assertEquals("Bad String", Main.Solution("abc"));
    }
}