package UnitTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class findSolutionTest {
    // Test case viết theo phân tích giá trị biên
    // Có 9 test case
    @Test
    public void Test1(){
        findSolution Solution = new findSolution();
        Assert.assertEquals("nghiệm :-0,11",Solution.Solution(-497499,-55555));
    }
    @Test
    public void Test2() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("nghiệm :-0,11",Solution.Solution(-497499,-55554));
    }
    @Test
    public void Test3() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("nghiệm :0,01",Solution.Solution(-497499,5555));
    }
    @Test
    public void Test4() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("nghiệm :0,13",Solution.Solution(-497499,66665));
    }
    @Test
    public void Test5() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("nghiệm :0,13",Solution.Solution(-497499,66666));
    }
    @Test
    public void Test6() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("nghiệm :-0,01",Solution.Solution(-999999,-5555));
    }
    @Test
    public void Test7() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("nghiệm :-0,01",Solution.Solution(-999998,-5555));
    }
    @Test
    public void Test8() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("nghiệm :1,11",Solution.Solution(4999,-5555));
    }
    @Test
    public void Test9() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("nghiệm :1,11",Solution.Solution(5000,-5555));
    }


    // Test case viết theo bảng quyết định
    // Có 5 test case

    @Test
    public void Test10() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("ngoài khoảng", Solution.Solution(-10000001, 5));
    }
    @Test
    public void Test11() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("vô nghiệm", Solution.Solution(0, 7));
    }
    @Test
    public void Test12() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("vô số nghiệm", Solution.Solution(0, 0));
    }
    @Test
    public void Test13() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("ngoài khoảng", Solution.Solution(45, 70000));
    }
    @Test
    public void Test14() {
        findSolution Solution = new findSolution();
        Assert.assertEquals("nghiệm :-1,06", Solution.Solution(34, 36));
    }

}
