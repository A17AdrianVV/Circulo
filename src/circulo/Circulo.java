package circulo;


/**
 * Clase Circulo para probas en NetBeans 
 * Representa un círculo almacenando o seu radio e coordenadas
 * @author uadmin
 * @version 1.0.0
 */

public class Circulo {
    private int x;
    private int y;
    private double radio;

   

  /**
   * Constructor para a clase Circulo que asigna valores das
   * coordenadas x, y así como valor do radio
   * @param valorX  coordenada X enteiro 
   * @param valorY  coordenada Y enteiro
   * @param valorRadio radio decimal
   */

    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

  /**
   * Método que permite establecer a coordenada X
   * @param valorX
   */
  public void establecerX(int valorX) {
        x=valorX;
    }

  /**
   * Método que devolve o valor da coordenada X
   * @return
   */
  public int obterX() {
        return x;
    }

  /**
   * Método que permite establecer a coordenada Y
   * @param valorY
   */
  public void establecerY(int valorY) {
        y=valorY;
    }

  /**
   *  Método que devolve o valor da coordenada Y
   * @return
   */
  public int obterY() {
        return y;
    }

  /**
   *  Método que permite establecer o valor do Radio
   * @param valorRadio
   */
  public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

  /**
   * Método que devolve o valor do Radio
   * @return
   */
  public double obterRadio() {
        return radio;
    }

  /**
   * Método que calcula e devolve o valor do Diámetro do círculo
   * @return
   */
  public double obterDiametro() {
        return radio * 2;
    }

  /**
   * Método que calcula e devolve o valor da Circunferencia do círculo
   * @return
   */
  public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

  /**
   * Método que calcula e devolve o valor da Área do círculo
   * @return
   */
  public double obterArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
