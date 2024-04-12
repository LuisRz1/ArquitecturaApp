package pe.edu.upao.luisrz.arquitecturaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upao.luisrz.arquitecturaapp.model.Producto;
import pe.edu.upao.luisrz.arquitecturaapp.serializers.producto.EditarProductoRequest;
import pe.edu.upao.luisrz.arquitecturaapp.serializers.producto.ProductoSerializer;
import pe.edu.upao.luisrz.arquitecturaapp.services.ProductoService;
import java.util.List;

@RestController
@RequestMapping("producto")
public class ProductoController {
    @Autowired private ProductoService productoService;

    @GetMapping("/listar")
    public List<ProductoSerializer> listarProductos(){
        return productoService.listarProductos().stream().map((it) -> new ProductoSerializer(it.getNombre(), it.getPrecio())).toList();
    }
    @PostMapping("/crear")
    public Producto crearProducto(@RequestBody ProductoSerializer request){
        Producto producto = new Producto(null, request.getNombre(), request.getPrecio());
        return productoService.crearProducto(producto);
    }
    @PutMapping("/actualizar")
    public Producto editarProducto(@RequestBody EditarProductoRequest request){
        return productoService.editarProducto(request);
    }
    @DeleteMapping("/eliminar")
    public List<Producto> eliminarProducto(@RequestBody Long id){
        return productoService.eliminarProducto(id);
    }
}
