

import org.junit.Assert;
import org.junit.Test;

import static com.softserve.edu.homework12.CompareBrackets.checkBrackets;


public class TestCompareBrackets {

    @Test
    public void testCompareBracketsCorrectCountBracketsWithText() {

        String textWithCorrectBrackets = "(Some text) {Sp, Some Text} [Some text]";

        boolean actualResult = checkBrackets(textWithCorrectBrackets);
        System.out.println("Check the result (console) " + checkBrackets(textWithCorrectBrackets));
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void testCompareBracketsIncorrectCountBracketsWithText() {
        String textWithIncorrectBrackets = "(Some text) {Sp, Some Text} [Some text]}}]";

        boolean actualResult = checkBrackets(textWithIncorrectBrackets);
        System.out.println("Check the result (console) " + checkBrackets(textWithIncorrectBrackets));

        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void testCompareBracketsCorrectCountBrackets() {
        String brackets = "{(())}";

        boolean actualResult = checkBrackets(brackets);
        System.out.println("Check the result (console) " + checkBrackets(brackets));
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void testCompareBracketsCorrectCountBrackets2() {
        String brackets = "() [] {}";

        boolean actualResult = checkBrackets(brackets);
        System.out.println("Check the result (console) " + checkBrackets(brackets));
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void testCompareBracketsCorrectCountBrackets3() {
        String brackets = "()";

        boolean actualResult = checkBrackets(brackets);
        System.out.println("Check the result (console) " + checkBrackets(brackets));
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void testCompareBracketsIncorrectCountBrackets() {
        String brackets = "(]";

        boolean actualResult = checkBrackets(brackets);
        System.out.println("Check the result (console) " + checkBrackets(brackets));
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void testCompareBracketsIncorrectCountBrackets2() {
        String brackets = ") (";

        boolean actualResult = checkBrackets(brackets);
        System.out.println("Check the result (console) " + checkBrackets(brackets));
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void testCompareBracketsIncorrectCountBrackets3() {
        String brackets = "([)}";

        boolean actualResult = checkBrackets(brackets);
        System.out.println("Check the result (console) " + checkBrackets(brackets));
        Assert.assertEquals(false, actualResult);
    }


}