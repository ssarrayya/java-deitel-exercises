package ChapterFour;

public class EConstantFactorial {
        private int n;

        public static int factorial(int n) {
            int i = 1;
            int solution = 1;
            while (i <= n) {
                solution = solution * i;
                ++i;
            }
            return solution;
        }

        public static double getEConstant(int n) {
            double e = 0;
            for(int i = 1; i <= n; i++)
                e += 1.0/factorial(i);
            return e;
        }
}

