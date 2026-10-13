import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String Inversare_Litere (String s)
    {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    public static void Matrice (int a[][], int n, int m)
    {
        for (int i = 0; i < n; i++)
            {
            for (int j = 0; j < m; j++) {
                if (i==0 || i == n-1 || j==0 || j == m-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            }
    }

    public static void Diagonale (int a[][], int n, int m)
    {
        for (int i = 0; i < n; i++)
            {
            for (int j = 0; j < m; j++)
            {
                if (i==j || i+j == n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
                System.out.println();
            }
    }
    public static void main(String[] args)
    {
        //pb 1
        String text = "A inceput scoala";
        System.out.println(Inversare_Litere(text));

        //pb 2
        List <Integer> lista = new ArrayList<Integer>();
        List <Integer> lista_select = new ArrayList<>();
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < 10; i++)
            {
                int nr = rand.nextInt(21)+5;
                lista.add(nr);
                if (nr>=10 && nr<=20)
                    lista_select.add(nr);
            }
        System.out.println(lista);
        System.out.println(lista_select);

        //pb 3
        int n=4, m=5;
        int a[][] = new int[n][m];
        Matrice(a,n,m);
        System.out.println();
        Diagonale(a,n,m);
    }
}