package org.acme;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {

    private List<Transaction> transactions= new ArrayList<Transaction>();

    public String getGreetings() {
        return "Hello RESTEasy";
    }

    public void initiateTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}
