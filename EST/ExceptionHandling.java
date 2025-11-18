class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}

public class ExceptionHandling {
    
    public static void main(String []args){

        try{
            int age=18;
            if(age<18){
                throw new MyException("Under age");
            }
            System.out.println("Age: "+ age);
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Tasks completed..!");
        }
    }
}
