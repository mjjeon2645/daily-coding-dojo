import models.Account;
import models.Transaction;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MakaoBank {
  public static void main(String[] args) {
    MakaoBank application = new MakaoBank();
    application.run();

  }

  public void run() {

    // 준비
    Account account = new Account();

    // 입력

    List<Transaction> transactions = loadTransactions();

    // 처리
//    List<TransactionResult> transactionResults = account.process(transactions);


    // 출력

//    saveTransactionResults(transactionResults);


  }

  public List<Transaction> loadTransactions() {
    List<Transaction> transactions = new ArrayList<>();
    return transactions;
  }

}
