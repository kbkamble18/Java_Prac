import java.util.*;

class HelloDemo{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        
        int size = sc.nextInt();
        int no1[] = new int[size];

        for(int i =0 ;i<size;i++){
            no1[i]= sc.nextInt();
        }

        for(int i =0;i<size;i++)
        {
            System.out.println(no1[i]);
        }
        //System.out.println("Enter Something");
        //System.out.println("you entered "+ str);
        
        sc.close();
    }
}