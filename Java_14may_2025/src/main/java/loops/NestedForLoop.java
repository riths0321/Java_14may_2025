package loops;

public class NestedForLoop
{
    public static void main(String[] args)
    {

        //this is a nested loop , loop ke andar loop
        for(int i=1;i<=3;i++)//outer loop represent to rows
        {
            for(int j=1;j<=3;j++)//Inner loop represent to column
            {
                for(int k=1;k<=3;k++)//Inner loop
                {
                    System.out.println(i+" "+j+" "+k);
                }
            }
        }
    }
}