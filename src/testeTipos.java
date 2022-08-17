
import java.math.BigDecimal;;

public class testeTipos 
{
    public static void main(String[] args)
    {
        BigDecimal num1 = new BigDecimal("2.3");
        BigDecimal num2 = new BigDecimal("1.1");
        BigDecimal resultado = num1.subtract(num2);
        
        //Meu Deus, tudo isso pra subtrair com precisão kkkkk
        System.out.println(resultado);
        System.out.println(resultado.toString());
        System.out.println(2.3 - 1.1);
    }

}
