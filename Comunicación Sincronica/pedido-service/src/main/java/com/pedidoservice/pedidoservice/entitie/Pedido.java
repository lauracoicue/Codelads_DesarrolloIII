package com.pedidoservice.pedidoservice.entitie;

import com.pedidoservice.pedidoservice.dto.ProductoDTO;

public record Pedido(String id, ProductoDTO producto, int cantidad) {}

