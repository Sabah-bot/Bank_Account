import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.assertj.core.api.Assertions.assertThat;


public class BankTest{

    @Test
    public void shouldReturnCorrectValuesAfterInitialization(){
        // GIVEN
        BankAccount bankAccount = new BankAccount("Sabah", "Yusuf", LocalDate.of(1999, 9, 21), "252353466");

    
    @Test
    public void hasFirstName(){
        assertThat(bankAccount.getFirstName()).isEqualTo("Sabah");
        }

    @Test
    public void canSetFirstName(){
        bankAccount.setFirstName("Sabah");
        assertThat(bankAccount.getFirstName()).isEqualTo("Sabah");
        }

    @Test
    public void hasLastName(){
        assertThat(bankAccount.getLastName()).isEqualTo("Yusuf");
        }

     @Test
    public void canSetLastName(){
        bankAccount.setLastName("Yusuf");
        assertThat(bankAccount.getLastName()).isEqualTo("Yusuf");}

    @Test
    public void hasDateOfBirthName(){
        assertThat(bankAccount.getDateOfBirth()).isEqualTo(LocalDate.of(1999, 9, 21);
        }

    @Test
    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth("21-9-1999");
        assertThat(bankAccount.getDateOfBirth()).isEqualTo(1999, 9, 21);
        }

    @Test
    public void hasAccountNumber(){
        assertThat(bankAccount.getAccountNumber()).isEqualTo("252353466");
        }

    @Test
    public void canSetAccountNumber(){
        bankAccount.setAccountNumber());
        assertThat(bankAccount.getAccountNumber()).isEqualTo("252353466");
        }
 

    @Test
    public void shouldDepositCorrectly(){
        // GIVEN
        BankAccount bankAccount = new BankAccount("Sabah", "Yusuf", LocalDate.of(1999, 9, 21), "252353466");

        // WHEN
        bankAccount.deposit(0);

        // THEN
        assertThat(bankAccount.getBalance()).isEqualTo(0);
    }

    @Test
    public void shouldWithdrawCorrectly() {
        // GIVEN
        BankAccount bankAccount = new BankAccount("Sabah", "Yusuf", LocalDate.of(1999, 9, 21), "252353466");
        bankAccount.setBalance(100);

        // WHEN
        bankAccount.withdrawal(0);

        // THEN
        assertThat(bankAccount.getBalance()).isEqualTo(100);
    }

    @Test
    public void shouldApplyInterestCorrectly() {
        // Arrange
        BankAccount bankAccount = new BankAccount("Sabah", "Yusuf", LocalDate.of(1999, 9, 21), "252353466");
        bankAccount.setBalance(2000);

        // Act
        bankAccount.allowInterest(10);

        // Assert
        assertThat(bankAccount.getBalance()).isEqualTo(2200);

    }
}




