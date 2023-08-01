package com.example.projetospring.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = -6875524716830064036L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }
}
