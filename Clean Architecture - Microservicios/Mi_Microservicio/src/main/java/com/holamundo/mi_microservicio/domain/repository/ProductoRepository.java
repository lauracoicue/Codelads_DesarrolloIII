package com.holamundo.mi_microservicio.domain.repository;

import com.holamundo.mi_microservicio.domain.model.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoRepository {
    List<Producto> listarProductos();
    Optional<Producto> findById(Long id);
}
