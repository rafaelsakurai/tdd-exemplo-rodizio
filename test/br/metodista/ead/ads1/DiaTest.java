package br.metodista.ead.ads1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael Guimarães Sakurai
 */
public class DiaTest {

  @Test
  public void testarPlacaFinal1e2NaSegunda() {
    Dia dia = new Segunda();
    assertFalse(dia.podeCircular("ABC-4321"));
    assertFalse(dia.podeCircular("ABC-4322"));

    assertTrue(dia.podeCircular("ABC-4323"));
  }

  @Test
  public void testarPlacaFinal3e4NaTerca() {
    Dia dia = new Terca();
    assertFalse(dia.podeCircular("ABC-4343"));
    assertFalse(dia.podeCircular("ABC-4344"));

    assertTrue(dia.podeCircular("ABC-4341"));
  }
}
