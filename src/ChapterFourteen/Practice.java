package ChapterFourteen;

public class Practice {
    public static void main(String[] args) {
        String s = "68573565 234";
        StringBuilder y = new StringBuilder(s.substring(s.length() - 3));

            y.append(") ");
            y.insert(0,"(+");

            int i = 0;
            for(int count = s.length() - 5; count >= 0; count--) {
                if(i % 3 == 0 & i > 0) {
                    i = 0;
                    y.append("-");
                }
                i++;
                y.append(s.charAt(count));
            }

            System.out.println(y);


    }
}
