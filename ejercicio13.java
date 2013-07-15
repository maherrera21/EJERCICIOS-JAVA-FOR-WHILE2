import java.text.DecimalFormat;

public class ejercicio13 {

  public static void main(String args[])
	{
		DecimalFormat dosDigitos = new DecimalFormat( "0.00" );
		int anios=1;
		double monto=0;
		for(int a=0;a<anios;a++)
		{
			for(int b=0;b<12;b++)
			{
				monto*=1.03;
				monto+=1000;
			}
		}
		System.out.println("en "+anios+" se tendra ahorrado $ "+dosDigitos.format(monto));
	}
}
