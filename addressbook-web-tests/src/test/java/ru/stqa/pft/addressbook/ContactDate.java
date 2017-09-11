package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

@Test (enabled = false)

public class ContactDate {
  private final String firstname;
  private final String lastname;
  private final String htelefon;
  private final String email;

  public ContactDate(String firstname, String lastname, String htelefon, String email) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.htelefon = htelefon;
    this.email = email;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getHtelefon() {
    return htelefon;
  }

  public String getEmail() {
    return email;
  }
}
