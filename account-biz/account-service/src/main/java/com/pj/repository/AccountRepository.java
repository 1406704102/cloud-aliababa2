package com.pj.repository;

import com.pj.entity.AccountInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccountRepository extends JpaRepository<AccountInfo, Integer>, JpaSpecificationExecutor<AccountInfo> {
    AccountInfo findByAccountCode(String accountCode);
}
