package com.shivam.framework.person;

import com.shivam.framework.service.IDataService;

public interface IPersonService extends IDataService<PersonVo> {
    PersonVo getByMobileNumber(long mobileNumber);
    PersonVo addMoneyToWallet(float amount, long mobileNumber);

    PersonVo withdrawMoneyFromWallet(float amount, long mobileNumber) throws Exception;

    PersonVo transfer(float amount, long sender, long receiver) throws Exception;
}
