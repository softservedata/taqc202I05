package homework12;

import com.softserve.edu.utils.checkers.SyntaxChecker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SyntaxCheckerTest {
    @Before
    public void setup() {

    }
    @After
    public void teardown() {

    }

    @Test
    public void testCheckBraces() {
        String input = "";
        String failureMessage = "Wrong check result for value: '" + input + "'";
        boolean actual;

        actual = SyntaxChecker.checkBraces(input);

        Assert.assertTrue(failureMessage, actual);

        input = "()[]{}";

        actual = SyntaxChecker.checkBraces(input);

        Assert.assertTrue(failureMessage, actual);

        input = "(((({{{[[]]}}}))))";

        actual = SyntaxChecker.checkBraces(input);

        Assert.assertTrue(failureMessage, actual);

        input = "}";

        actual = SyntaxChecker.checkBraces(input);

        Assert.assertFalse(failureMessage, actual);

        input = "[";

        actual = SyntaxChecker.checkBraces(input);

        Assert.assertFalse(failureMessage, actual);

        input = ")(";

        actual = SyntaxChecker.checkBraces(input);

        Assert.assertFalse(failureMessage, actual);
    }
}
