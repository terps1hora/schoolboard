package com.ua.schoolboard.rest.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
//@EqualsAndHashCode(callSuper = true)
public class UpdateAdminTO extends UserTO {
    private String name;
    private String birthDay;
    private List<RatesTO> rates = new ArrayList<>();
    private BalanceTO balance;

    public void updateBalance(Integer sum) {
        BalanceTO balance = this.getBalance();
        if (balance == null) {
            balance = new BalanceTO();
        }
        balance.setAmount(balance.getAmount() + sum);
        this.setBalance(balance);
    }
}
