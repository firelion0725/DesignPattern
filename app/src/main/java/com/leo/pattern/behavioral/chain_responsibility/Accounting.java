package com.leo.pattern.behavioral.chain_responsibility;

import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/6/26
 */
public abstract class Accounting implements Finance {

    protected Accounting nextAccount;

    protected double weight;

    public Accounting(Accounting nextAccount, double weight) {
        this.nextAccount = nextAccount;
        this.weight = weight;
    }

    private boolean pay(double fee) {
        return weight > fee;
    }

    public void responsibility(double fee) {
        if (pay(fee)) {
            reimbursement();
        } else {
            if (nextAccount != null) {
                nextAccount.responsibility(fee);
            } else {
                Log.i("JuniorAccount", "NoOne reimbursement it");
            }
        }
    }
}
