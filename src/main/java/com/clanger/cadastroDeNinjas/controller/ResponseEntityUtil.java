package com.clanger.cadastroDeNinjas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public final class ResponseEntityUtil<T> {

    public static <T> ResponseEntity<T> responseEntityReturn(T t){
        if(t != null) { return ResponseEntity.status(HttpStatus.FOUND).body(t); }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
}
