import java.util.*;

class program80_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int R = 0;
        int C = 0;

        int i = 0 , j = 0;
        int Sum = 0;
        
        int RowSum = 0;
        int ColSum = 0;
        int DiagSum1 = 0;
        int DiagSum2 = 0;

        System.out.println("Enter number of rows : ");
        R = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        C = sobj.nextInt();

        if(R <= 0 || C <= 0 || R != C)
        {
            System.out.println("Invalid input");
            return;
        }

        int Arr[][] = new int[R][C];

        for(i = 0 ; i < R ; i++)
        {
            System.out.println("Enter elements of : "+(i+1));
            for(j = 0 ; j < C ; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }


        // Checking row sums

        for(j = 0 ; j < C ; j++)
        {
            Sum = Sum + Arr[0][j];
        }

        for(i = 0 ; i < R ; i++)
        {
            RowSum = 0;
            for(j = 0 ; j < C ; j++)
            {
                RowSum = RowSum + Arr[i][j];
            }

            if(RowSum != Sum)
            {
                System.out.println("Matrix is NOT a Magical Square");
                return;
            }
        }

        // Check column sum
        for(j = 0 ; j < C ; j++)
        {
            ColSum = 0;
            for(i = 0 ; i < R ; i++)
            {
                ColSum = ColSum + Arr[i][j];
            }

            if(ColSum != Sum)
            {
                System.out.println("Matrix is NOT a Magical Square");
                return;
            }
        }

        // Check digonal1
        for(i = 0 ; i < R ; i++)
        {
           DiagSum1 = DiagSum1 + Arr[i][i];
        }

        if(DiagSum1 != Sum)
        {
            System.out.println("Matrix is NOT a Magical Square");
            return;
        }

        //Check for digonal2
        for(i = 0 ; i < R ; i++)
        {
            DiagSum2 = DiagSum2 + Arr[i][R - i -1];
        }

        if(DiagSum2 != Sum)
        {
            System.out.println("Matrix is NOT a Magical Square");
            return;
        }

        System.out.println("Matrix is a Magical Square");
    
    }
}