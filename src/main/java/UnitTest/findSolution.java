package UnitTest;
import java.util.Scanner;
import java.text.DecimalFormat;
public class findSolution {

    public String Solution(int a, int b) {
        double solutionOfEqua;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        if (-999999 > a || a > 5000 ) {
            return "ngoài khoảng";
        } else if (a == 0) {
                if (b == 0) {
                    return "vô số nghiệm";
                }
                else if (-55555 > b || b > 66666 ) {
                    return "ngoài khoảng";
                }
                else{
                    return "vô nghiệm";
                }
            } else {
            if (-55555 > b || b > 66666) {
                return "ngoài khoảng";
            } else {
                solutionOfEqua = (double) -b / a;
            }
            return "nghiệm :" + decimalFormat.format(solutionOfEqua);
        }
    }
}
