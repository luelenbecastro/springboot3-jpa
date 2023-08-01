package com.example.projetospring.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -6452138916313764512L;

    public DatabaseException(String msg) {
        super(msg);
    }
}
