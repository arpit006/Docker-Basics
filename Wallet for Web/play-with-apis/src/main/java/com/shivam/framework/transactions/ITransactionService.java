package com.shivam.framework.transactions;

import com.shivam.framework.service.IDataService;

import java.util.List;

public interface ITransactionService extends IDataService<TransactionVo> {
    List<TransactionVo> findBySender(long sender);

    List<TransactionVo> findByReceiver(long receiver);

    List<TransactionVo> findAllTransactions(long mobileNumber);
}
