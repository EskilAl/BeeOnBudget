package no.ntnu.idatg1002.budgetapplication.backend.accountinformation;

import static org.junit.jupiter.api.Assertions.*;

import no.ntnu.idatg1002.budgetapplication.backend.SecurityQuestion;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class DatabaseTest {
  static Account account;

  @BeforeAll
  static void setUp() {
     account = new Account("Test", "test@test.com", "1234",
        SecurityQuestion.CAR_BRAND, "BMW");
     Database.addAccount(account);
  }

  @Nested
  class AddAccount{
    @Test
    void addAccountThatDoesNotExistAlready() {
      Account testAccount = new Account("newTest", "newTest@.com",
          "1234", SecurityQuestion.FATHER_BORN, "1969");
      assertDoesNotThrow(() -> Database.addAccount(testAccount));
      assertTrue(Database.getAccounts().containsValue(testAccount));
    }

    @Test
    void addAccountThatAlreadyExists() {
      Exception thrown = assertThrows(IllegalArgumentException.class,
          () -> Database.addAccount(account));
      assertEquals("Instance of account already exists.", thrown.getMessage());
    }
  }

}