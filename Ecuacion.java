import java.util.Scanner;//Permite la entrada de datos primitivos, captura datos del tipo int, double, string y etc.

public class Ecuacion
{
    public static void main(String[] args) 
    {
       double a, b, c; //Se usan para guardar números que tienen parte entera y parte decimal.
       double raiz1, raiz2;

       Scanner datoScanner = new Scanner(System.in); //Permiten obtener datos tanto numéricos como textuales por teclado. 
       System.out.println("Ingrese el valor de a:");
       a = datoScanner.nextDouble();//Permite la entrada de datos

       System.out.println("Ingrese el valor de b:");
       b = datoScanner.nextDouble();

       System.out.println("Ingrese el valor de c:");
       c = datoScanner.nextDouble();

       if((4*a*c)>(b*b))
       {
           System.out.println("Raices iamginarias");
       }
       else if(a>0 || a<0) //Es una condicion basada en un valor que tomara un camino si es verdadera y otra si es falsa
       {
           double temp = (b*b)-4*a*c;
           raiz1 = b+ Math.pow(temp,0.5);
           raiz1 = raiz1/(2*a);

           raiz2=((-b)-(Math.pow(temp,0.5)))/(2*a);
           System.out.println(" La 1ra raiz es:"+ raiz1);
           System.out.println(" La 2da raiz es" + raiz2);  
           //EJEMPLO: 2X^2+9X+10 = 0
       }
    }
}