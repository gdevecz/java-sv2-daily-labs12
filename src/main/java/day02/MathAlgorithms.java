package day02;

public class MathAlgorithms {

    public int lnko(int a, int b) {
        int x=a;
        int y=b;
        while (a != b)
        {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
}
