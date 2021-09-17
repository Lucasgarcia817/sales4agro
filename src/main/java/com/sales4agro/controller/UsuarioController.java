package com.sales4agro.controller;

import com.sales4agro.services.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/teste")
    public ResponseEntity<?> teste(){
        var users = usuarioService.findAllUsuarios();
        return ResponseEntity.ok(users);
    }
}
