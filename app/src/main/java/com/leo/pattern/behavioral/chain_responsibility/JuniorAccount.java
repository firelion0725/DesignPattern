package com.leo.pattern.behavioral.chain_responsibility;

import android.util.Log;

/**
 * 初级财务
 *
 * @author leo, ZhangWei
 * @date 2018/6/26
 */
public class JuniorAccount extends Accounting {

    public JuniorAccount(Accounting nextAccount, double weight) {
        super(nextAccount, weight);
    }

    @Override
    public void reimbursement() {
        Log.i("JuniorAccount", "JuniorAccount reimbursement it");
    }
}
