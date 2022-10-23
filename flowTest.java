package dataFlow;

import UnitTest.findSolution;
import org.junit.Assert;
import org.junit.Test;

public class flowTest {
    @Test
    public void Test6() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("nghiệm :-1,2", Solution.Solution(50, 60));
    }
}
