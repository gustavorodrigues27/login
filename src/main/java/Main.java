import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Login: ");
    String login = sc.next();
    int senhaAdmin = 6969;
    int senhaFinanceiro = 1212;
    int senhaCliente = 5524;
    String login1 = "admin";
    String login2 = "financeiro";
    String login3 = "cliente";

    if (login.equals("admin")){
      System.out.println("Coloque a senha: ");
      int senha = sc.nextInt();
      if (senha == senhaAdmin){
        System.out.println("Acesso permitido");
      } else{
        System.out.println("Acesso negado");
      }
      if (login.equals("financeiro")){
        System.out.println("Coloque sua senha: ");
        if (senha == senhaFinanceiro){
          System.out.println("Acesso permitido");
        }
        else{
          System.out.println("Acesso negado");
          
        }
        if (login.equals ("cliente")){
          System.out.println("Coloque sua senha:");
          if(senha == senhaCliente){
            System.out.println("Acesso permitido");
          }
        }
        else{
          System.out.println("Acesso negado");
        }
      
        
      }
      
      
  
     
  }
    




    sc.close();
  }
}

 
