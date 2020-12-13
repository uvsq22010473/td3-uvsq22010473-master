package test;

import fr.uvsq.tod.compte.Compte;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompteTest {
  @Test (expected = IllegalArgumentException.class)
  public void shouldCreateAnAccountWithTheSpecifiedBalance() {
    Compte c = new Compte(-100);
    String test = null;
    test.length();
  }

  @Test
  public void Decouvert(){
    Compte c = new Compte (100);
    assertTrue(c.getBalance()>0);
  }

  @Test
  public void verment (){
    Compte c1 = new Compte (100);
    Compte c2 = new Compte (0);
    int montantVerment= 50;
    assertTrue(c1.getBalance()>montantVerment);
    c1.verser(c2,montantVerment);
  }

  @Test
  public void crediter (){
    Compte c = new Compte (100);
    c.Credit(100);
    assertEquals(c.getBalance(),200);
  }

  @Test
  public void Debiter (){
    Compte c = new Compte (200);
    c.Debit(100);
    assertEquals(c.getBalance(),100);
  }

  @Test (expected = IllegalArgumentException.class)
  public void SommePositive (){
    int Montant = -100;
    Compte c = new Compte (Montant);
    c.Debit(Montant);
    c.Credit(Montant);
    String test = null;
    test.length();

  }
}