package com.pj.service.impl;

import com.pj.entity.AccountInfo;
import com.pj.repository.AccountRepository;
import com.pj.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public AccountInfo findByAccountCode(String accountCode) {
        return accountRepository.findByAccountCode(accountCode);
    }

    @Override
    public AccountInfo update(AccountInfo accountInfo) {
        return accountRepository.save(accountInfo);
    }

    @Override
    public AccountInfo insert(AccountInfo accountInfo) {
        return accountRepository.save(accountInfo);
    }

    @Override
    public int delete(String accountCode) {
        AccountInfo byAccountCode = accountRepository.findByAccountCode(accountCode);
        accountRepository.deleteById(byAccountCode.getId());
        return byAccountCode.getId();
    }
}
