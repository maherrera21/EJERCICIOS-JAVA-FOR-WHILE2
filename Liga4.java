
  import javax.swing.JOptionPane;
  public class Liga4
    {
      private char nom;
      private int edad;
      private int peso;
      private int ppe;
      private int eprom;
      private int etotal;
      private int ptotal;
      private int jug=1;

  private void nombre ()
    {
      String y;
      y=JOptionPane.showInputDialog("Dame el nombre:");
      nom=Char.parseChar(y);
    }

  private void captura ()
    {
      String x;
      x=JOptionPane.showInputDialog("Dame la edad:");
      edad=Integer.parseInt (x);
      x=JOptionPane.showInputDialog("Dame el peso:");
      peso=Integer.parseInt (x);
    }

  private void equipo()
    {
      for(jug=1;jug<=5;jug++)
        {
          nombre();
          captura();
          
          if(peso>=80)
           {
             JOptionPane.showMessageDialog (null, "El jugador con mayor peso es:"+nom,"JUGADORGORDO",JOptionPane.PLAIN_MESSAGE);
           }
           if(peso<=60)
            {
              JOptionPane.showMessageDialog (null, "El jugador con menor peso es:"+nom,"JUGADORFLACO",JOptionPane.PLAIN_MESSAGE);
            }
           if(edad>=50)
            {
              JOptionPane.showMessageDialog (null, "El jugador con mayor edad es:"+nom,"JUGADORVIEJO",JOptionPane.PLAIN_MESSAGE);
            }
            if(edad<=30)
             {
               JOptionPane.showMessageDialog (null, "El jugador con menor edad es:"+nom,"JUGADORJOVEN",JOptionPane.PLAIN_MESSAGE);
             }
               etotal=etotal+edad;
               ptotal=ptotal+peso;
        }//fin de for

          ppe=ptotal/5;
          eprom=etotal/5;

          JOptionPane.showMessageDialog (null, "El peso promedio del equipo es:"+ppe,"PESOPROMEDIO",JOptionPane.PLAIN_MESSAGE);
          JOptionPane.showMessageDialog (null, "La edad promedio es:"+eprom,"EDADPROMEDIO",JOptionPane.PLAIN_MESSAGE);
    }

    public static void main (String[]arg)
      {
        Liga4 objeto=new Liga4 ();
        objeto.captura ();
        objeto.nombre ();
      }
    }
