package com.gabrielxavier.bankaccount.entity.exceptions;

public class CpfNotFoundException extends RuntimeException {

    public CpfNotFoundException(String msg) {
        super(msg);
    }
}
