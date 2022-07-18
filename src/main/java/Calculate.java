public class Calculate {
    public static String answer(int algorithmId,int loopType, int m) {
        switch (algorithmId) {
            case 1:
                return Fibonacci.answer(loopType, m);
            case 2:
                return Factorial.answer(loopType, m);
        }
        return "";
    }
}

