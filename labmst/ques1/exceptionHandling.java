import java.util.*;
public class exceptionHandling {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numbers (type 'exit' to finish) :");
        while(true){
            String input= sc.next();
            if(input.equalsIgnoreCase("exit")) break;
            try{
                int num= Integer.parseInt(input);
                list1.add(num);
            }catch(NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
        try{
            if(list1.isEmpty()){
                throw new ArithmeticException("List is empty!!!...cannot calculate average");
            }
            int sum=0;
            for(int x:list1){
                sum+=x;
            }
            double average= (double) sum/ list1.size();
            System.out.println("average :"+ average);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
