package pe.santech.food_premium.pack;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pack")
public class Pack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "restaurante_id", nullable = false)
    private Long restauranteId;

    @Column(nullable = false, length = 120)
    private String titulo;

    @Column(length = 500)
    private String descripcion;

    @Column(name = "precio_original", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioOriginal;

    @Column(name = "precio_oferta", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioOferta;

    @Column(nullable = false)
    private Integer stock;

    @Column(name = "recojo_desde", nullable = false)
    private Instant recojoDesde;

    @Column(name = "recojo_hasta", nullable = false)
    private Instant recojoHasta;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private EstadoPack estado;

    @Column(name = "creado_en", nullable = false)
    private Instant creadoEn;

    @Column(name = "actualizado_en", nullable = false)
    private Instant actualizadoEn;
}