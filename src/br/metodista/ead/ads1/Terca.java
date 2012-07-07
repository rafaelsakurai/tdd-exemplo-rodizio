package br.metodista.ead.ads1;

/**
 *
 * @author Rafael Guimarães Sakurai
 */
public class Terca implements Dia {
  public boolean podeCircular(String placa) {
    return !(placa.endsWith("3") || placa.endsWith("4"));
  }
}
