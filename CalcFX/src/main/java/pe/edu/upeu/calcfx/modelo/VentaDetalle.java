package pe.edu.upeu.calcfx.modelo;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class VentaDetalle {
      @Id
      Long idVentaDetalle;

      @ManyToOne
      @JoinColumn (referencedColumnName ="idVenta")
      Venta venta;
      @ManyToOne
      @JoinColumn(name= "id_producto")
      Producto producto;

}
