package Pertemuan11.BankMiniStarter;

import java.util.Collection;

public interface AccountRepository {
    void save(Account account);

    Account findByNumber(String accountNumber);
    
    Collection<Account> findAll();
}
