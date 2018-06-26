package com.leo.pattern.behavioral.chain_responsibility;

import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/6/26
 */
public class MiddleAccount extends Accounting {

    public MiddleAccount(Accounting nextAccount, double weight) {
        super(nextAccount, weight);
    }

    @Override
    public void reimbursement() {
        Log.i("MiddleAccount", "MiddleAccount reimbursement it");
    }
}
