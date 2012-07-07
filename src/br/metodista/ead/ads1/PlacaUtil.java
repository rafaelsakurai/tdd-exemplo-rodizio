package br.metodista.ead.ads1;

/**
 *
 * @author Rafael Guimarães Sakurai
 */
public class PlacaUtil {
  public boolean podeCircularNoRodizio(String placa, Dia dia) {
    return dia.podeCircular(placa);
  }

  public boolean podeCircularNoRodizio(String placa, String dia) {
    Dia d = null;

    try {
      d = (Dia) Class.forName("br.metodista.ead.ads1." + dia).newInstance();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return d.podeCircular(placa);
  }
}
