package com.leo.pattern.behavioral.chain_responsibility;

import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/6/26
 */
public class SeniorAccount extends Accounting {

    public SeniorAccount(Accounting nextAccount, double weight) {
        super(nextAccount, weight);
    }

    @Override
    public void reimbursement() {
        Log.i("SeniorAccount", "SeniorAccount reimbursement it");
    }
}
