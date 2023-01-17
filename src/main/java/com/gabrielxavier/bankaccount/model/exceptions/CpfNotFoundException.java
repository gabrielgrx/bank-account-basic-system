package com.gabrielxavier.bankaccount.model.exceptions;

public class CpfNotFoundException extends RuntimeException {

    public CpfNotFoundException(String msg) {
        super(msg);
    }
}
