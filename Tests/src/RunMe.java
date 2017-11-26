import java.util.Scanner;
import java.util.Stack;

public class RunMe {

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        in.close();
        Stack<Integer> st=new Stack<Integer>();


        while (n>0)
        {
            if (n%2==0) {
                st.push(0);
            }
            else
                st.push(1);
            n=n/2;
        }

        int cons=0;
        int current=0;
        int now;
        while (!st.empty())
        {
            now=st.pop();
            System.out.print(now);
            if (now==1)
                current++;
            else
            {
               current=0;
            }
            if (current>cons)
            {
                cons=current;
            }

        }

        System.out.println();
        System.out.println (cons);

    }
}
