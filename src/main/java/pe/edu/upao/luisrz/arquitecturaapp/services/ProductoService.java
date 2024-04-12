package pe.edu.upao.luisrz.arquitecturaapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.luisrz.arquitecturaapp.model.Producto;
import pe.edu.upao.luisrz.arquitecturaapp.repositories.ProductoRepository;
import pe.edu.upao.luisrz.arquitecturaapp.serializers.producto.EditarProductoRequest;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired private ProductoRepository productoRepository;

    // Read
    public List<Producto> listarProductos(){return productoRepository.findAll();}

    // Create

    public Producto crearProducto(Producto producto){return productoRepository.save(producto);}

    // Update

    public Producto editarProducto(EditarProductoRequest request){
        Optional<Producto> producto = productoRepository.findById(request.getId());
        if(producto.isEmpty()){
            throw new RuntimeException("Producto no encontrado");
        }
        producto.get().setNombre(request.getNombre());
        producto.get().setPrecio(request.getPrecio());
        productoRepository.saveAndFlush(producto.get());
        return producto.get();
    }

    // Delete

    public List<Producto> eliminarProducto(Long id){
        Optional<Producto> producto = productoRepository.findById(id);
        if(producto.isEmpty()){
            throw new RuntimeException("Producto no encontrado");
        }
        productoRepository.delete(producto.get());
        return listarProductos();
    }

}
