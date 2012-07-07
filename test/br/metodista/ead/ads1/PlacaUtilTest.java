package br.metodista.ead.ads1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael Guimarães Sakurai
 */
public class PlacaUtilTest {

  @Test
  public void testarPlacaFinal1e2() {
    PlacaUtil placaUtil = new PlacaUtil();
    assertFalse(placaUtil.podeCircularNoRodizio("ABC-4321", new Segunda()));
    assertFalse(placaUtil.podeCircularNoRodizio("ABC-4322", new Segunda()));
    assertTrue(placaUtil.podeCircularNoRodizio("ABC-4444", new Segunda()));

    assertFalse(placaUtil.podeCircularNoRodizio("ABC-4321", "Segunda"));
  }

  @Test
  public void testarPlacaFinal3e4() {
    PlacaUtil placaUtil = new PlacaUtil();
    assertFalse(placaUtil.podeCircularNoRodizio("ABC-3333", new Terca()));
    assertFalse(placaUtil.podeCircularNoRodizio("ABC-3334", new Terca()));
    assertTrue(placaUtil.podeCircularNoRodizio("ABC-3331", new Terca()));

    assertFalse(placaUtil.podeCircularNoRodizio("ABC-3333", "Terca"));
  }
}
