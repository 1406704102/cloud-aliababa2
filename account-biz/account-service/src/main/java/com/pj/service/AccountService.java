package com.pj.service;


import com.pj.entity.AccountInfo;

public interface AccountService {
    AccountInfo findByAccountCode(String accountCode);

    AccountInfo update(AccountInfo accountInfo);

    AccountInfo insert(AccountInfo accountInfo);

    int delete(String accountCode);
}
