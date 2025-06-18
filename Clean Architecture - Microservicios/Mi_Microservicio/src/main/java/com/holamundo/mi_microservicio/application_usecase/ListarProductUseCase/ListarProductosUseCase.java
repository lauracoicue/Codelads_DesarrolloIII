package com.holamundo.mi_microservicio.application_usecase.ListarProductUseCase;

import com.holamundo.mi_microservicio.domain.model.Producto;
import com.holamundo.mi_microservicio.domain.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ListarProductosUseCase {
    private final ProductoRepository productoRepository;

    public ListarProductosUseCase(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> ejecutar() {
        return productoRepository.listarProductos();
    }
}