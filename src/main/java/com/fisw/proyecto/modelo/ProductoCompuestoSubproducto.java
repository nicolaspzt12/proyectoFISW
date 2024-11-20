package com.fisw.proyecto.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference; // Agregar para evitar la recursión

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProductoCompuestoSubproducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JsonBackReference // Esto evita la serialización del lado inverso (de ProductoCompuesto)
    private ProductoCompuesto productoCompuesto;

    @ManyToOne
    private Producto subproducto;

    private int cantidad;
}
