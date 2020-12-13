package main;

/**
 * La classe <code>Compte</code> représente un compte bancaire.
 *
 * @author hal
 * @version 2020
 */

public class Compte {
  int compte;


  public Compte(int initialBalance) {
    if (initialBalance<0){
      throw new IllegalArgumentException("Le montant de compte obligatoirement positif");
    }
    else {
      this.compte = initialBalance;}
  }

  public int getBalance() {
    return compte;
  }

  public void Debit(int debit) {
    if (debit<0){
      throw new IllegalArgumentException("Le valeur de debit doit etre positive");
    }
    else {
      compte = compte - debit; }

  }

  public void Credit (int credit) {
    if (credit<0){
      throw new IllegalArgumentException("Le valeur de credit doit etre positive");
    }
    else {
      compte = compte + credit;}
  }

  public void verser (Compte c2, int montant) {
    Debit(montant);
    c2.Credit(montant);
  }

}
