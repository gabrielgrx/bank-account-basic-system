package com.gabrielxavier.bankaccount.model.exceptions;

public class CpfAlreadyExistsException extends RuntimeException {

    public CpfAlreadyExistsException(String msg) {
        super(msg);
    }
}
