import java.util.Locale;
import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner terminalUsuario = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite o primeiro número inteiro: ");
    int parametroUm = terminalUsuario.nextInt();
    System.out.println("Digite o segundo número inteiro: ");
    int parametroDois = terminalUsuario.nextInt();
    
    try {
      if (parametroUm > parametroDois) {
        throw new NumerosInvalidosException();
      }else if(parametroUm == parametroDois){
        throw new NumerosIguaisException();
      }
      contar(parametroUm, parametroDois);
    } catch (NumerosInvalidosException e) {
      System.out.println("Erro! O segundo parâmetro não pode ser menor que o primeiro.");
      System.out.println("Mas não se preocupe, vamos tratar dessa exceção para você e inverter os números.");
      contar(parametroDois, parametroUm);
    } catch(NumerosIguaisException e){
      System.out.println("Os números são iguais, por isso o programa vai ser encerrado sem nenhuma saída de dados.");
      e.printStackTrace();
    }
  }
  static void contar(int parametroUm, int parametroDois) {
    int contadorNumero = (parametroDois - parametroUm);
    for (int contadorFor = 1; contadorFor <= contadorNumero; contadorFor++) {
      System.out.println("Imprimindo o número " + contadorFor);
    }
  }
}
