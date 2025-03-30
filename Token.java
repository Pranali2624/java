import java.util.StringTokenizer;
public class Token {
    public static void main(String args[])
    {
        StringTokenizer st = new StringTokenizer("MY NAME IS PRANALI");

        while (st.hasMoreTokens());
        {
            System.out.println(st.nextToken ());
        }
    }
}
