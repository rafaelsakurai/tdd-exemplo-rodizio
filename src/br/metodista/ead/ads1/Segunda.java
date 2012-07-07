package br.metodista.ead.ads1;

/**
 *
 * @author Rafael Guimarães Sakurai
 */
public class Segunda implements Dia {
  public boolean podeCircular(String placa) {
    return !(placa.endsWith("1") || placa.endsWith("2"));
  }
}
