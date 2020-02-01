import java.util.*;
interface Children
{
    static int totalChildren=10;
    String name[]=new String[totalChildren];
}
abstract class Sweets implements Children
{
    int total;
    int total_weight;
    //int distribution[]=new int[Children.totalChildren];
    Sweets(){}
    Sweets(int total,int total_weight)
    {
        this.total_weight=total_weight;
        this.total=total;
    }
    abstract void classification(int c[],String n[]);
}
class Chocolates extends Sweets
{
    int total_chocolates;
    int total_weight;
    int d_chocolates[]=new int[Children.totalChildren];
    String nameChildren[]=new String[Children.totalChildren];
    Chocolates(int total,int total_weight,int total_chocolates_weight)
    {
        super(total,total_weight);
        this.total_weight=total_chocolates_weight;
    }
 void classification(int c[],String name[])
 {
     for (int i=0;i<c.length;i++)
     {
         d_chocolates[i]=c[i];
         nameChildren[i]=name[i];
     }
 }
 int getTotal_chocolates()
 {
     for (int i=0;i<d_chocolates.length;i++)
         total_chocolates+=d_chocolates[i];
     return total_chocolates;
 }
 void print()
 {
     System.out.println("Chocolates");
     System.out.println("Total weight="+total_weight);
     System.out.println("Total Chocolates="+getTotal_chocolates());
     System.out.println("Classification:");
     for (int i=0;i<d_chocolates.length;i++)
     {
         System.out.println(nameChildren[i]+" got "+d_chocolates[i]);
     }
 }
    void print(char s)
    {
        for(int i=0;i<d_chocolates.length;i++)
        {
            for (int j=0;j<d_chocolates.length-i-1;j++)
            {
                if(d_chocolates[j]>d_chocolates[j+1])
                {
                    int temp=d_chocolates[j];
                    d_chocolates[j]=d_chocolates[j+1];
                    d_chocolates[j+1]=temp;
                    String temp1= nameChildren[j];
                    nameChildren[j]=nameChildren[j+1];
                    nameChildren[j+1]=temp1;
                }
            }
        }
        System.out.println("After sorting");
        for (int i=0;i<d_chocolates.length;i++)
        {
            System.out.println(nameChildren[i]+" got "+d_chocolates[i]);
        }
    }}
    class Candy extends Sweets {
        int total_candies;
        int total_weight;
        int d_candies[] = new int[Children.totalChildren];
        String nameChildren[] = new String[Children.totalChildren];
        Candy(int total,int total_weight,int total_candies_weight)
        {
            super(total,total_weight);
            this.total_weight=total_candies_weight;
        }
        void classification(int c[], String name[]) {
            for (int i = 0; i < c.length; i++) {
                d_candies[i] = c[i];
                nameChildren[i] = name[i];
            }
        }
        int getTotal_candies()
        {
            for (int i=0;i<d_candies.length;i++)
                total_candies+=d_candies[i];
            return total_candies;
        }
        void print() {
            System.out.println("Candiess");
            System.out.println("Total weight="+total_weight);
            System.out.println("Total Candies="+getTotal_candies());
            System.out.println("Classification:");
            for (int i = 0; i < d_candies.length; i++) {
                System.out.println(nameChildren[i] + " got " + d_candies[i]);
            }
        }

        void print(char s) {
            for (int i = 0; i < d_candies.length; i++) {
                for (int j = 0; j < d_candies.length - i - 1; j++) {
                    if (d_candies[j] > d_candies[j + 1]) {
                        int temp = d_candies[j];
                        d_candies[j] = d_candies[j + 1];
                        d_candies[j + 1] = temp;
                        String temp1 = nameChildren[j];
                        nameChildren[j] = nameChildren[j + 1];
                        nameChildren[j + 1] = temp1;
                    }
                }
            }
            System.out.println("After sorting");
            for (int i = 0; i < d_candies.length; i++) {
                System.out.println(nameChildren[i] + " got " + d_candies[i]);
            }
        }
    }
    public class Birthday
    {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            Chocolates chocolates=new Chocolates(100,1000,500);
            Candy candy=new Candy(100,1000,500);
            String name[]=new String[10];
            int choco[]=new int[10];
            int cand[]=new int[10];
            for (int i=0;i<10;i++)
            {
                name[i]=s.next();
                choco[i]=s.nextInt();
                cand[i]=s.nextInt();
            }
            chocolates.classification(choco,name);
            candy.classification(cand,name);
            chocolates.print();
            chocolates.print('a');
            candy.print();
            candy.print('a');
        }
    }