package com.shivam.framework.transactions;

import com.shivam.framework.controller.BaseController;
import com.shivam.framework.person.IPersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/transaction")
public class TransactionController extends BaseController<TransactionEntity, TransactionVo> {

    private ITransactionService itransactionService;


    public TransactionController(ITransactionService itransactionService, IPersonService iPersonService) {
        super(itransactionService);
        this.itransactionService = itransactionService;
    }

    @GetMapping(value = "/getSentTransactions/{sender}")
    public List<TransactionVo> getSentTransactions(@PathVariable(name = "sender") long sender){
        return itransactionService.findBySender(sender);
    }

    @GetMapping(value = "/getReceivedTransactions/{receiver}")
    public List<TransactionVo> getReceivedTransactions(@PathVariable(name = "receiver") long receiver){
        return itransactionService.findByReceiver(receiver);
    }

    @GetMapping(value = "/getAllTransactions/{mobileNumber}")
    public List<TransactionVo> getAllTransactions(@PathVariable long mobileNumber) {
        return itransactionService.findAllTransactions(mobileNumber);
    }
}
