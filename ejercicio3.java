
import java.io.*;

/* Para leer del teclado cadenas y numeros */
class ejercicio3
{
static String dato()
{
String sdato = "";
try
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader flujoE = new BufferedReader(isr);

sdato = flujoE.readLine();
}
catch(IOException e)
{
System.err.println("Error: " + e.getMessage());
}
return sdato;
}

public static int datoInt()
{
try
{
return Integer.parseInt(dato());
}
catch(NumberFormatException e)
{
return Integer.MIN_VALUE;
}
}
}

/* Realiza las operaciones que necesitas, suma, promedio, mayor, menor dado N números*/
class Operaciones
{
public static void main(String []a)
{
int suma;
float promedio;
int mayor;
int menor;
int n;
int numero;

System.out.print("Ingresa el valor de N:");
n=ejercicio3.datoInt();

suma=0;
mayor = 0;
menor = 999999;

for (int i=1; i<=n; i++)
{
System.out.print("Ingresa el numero " + i + ": ");
numero=ejercicio3.datoInt();

suma=suma+numero;

if (numero>mayor)
mayor = numero;

if (numero<menor)
menor = numero;
}

promedio = suma / n;

System.out.println ("La suma es: " + suma);
System.out.println ("El promedio es: " + promedio);
System.out.println ("El mayor es: " +mayor);
System.out.println ("El menor es: " + menor);
}
}
