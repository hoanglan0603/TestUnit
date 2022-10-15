package WhiteBoxTest;

import UnitTest.findSolution;
import org.junit.Assert;
import org.junit.Test;

public class FindSolutionTest {
    @Test
    public void Test1() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("ngoài khoảng", Solution.Solution(6000, 3));
    }
    @Test
    public void Test2() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("vô số nghiệm", Solution.Solution(0, 0));
    }
    @Test
    public void Test3() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("ngoài khoảng", Solution.Solution(0, 70000));
    }
    @Test
    public void Test4() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("vô nghiệm", Solution.Solution(0, 5));
    }
    @Test
    public void Test5() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("ngoài khoảng", Solution.Solution(50, 70000));
    }
    @Test
    public void Test6() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("nghiệm :-1,2", Solution.Solution(50, 60));
    }
}
