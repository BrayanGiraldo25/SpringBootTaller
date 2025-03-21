package Desempeno.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Trabajo {

    @GetMapping("/")
    public String home(){ return "Bienvenido profe";}

    @GetMapping("/trabajo/{id}/{nombre}/{precio}")
    public String trabajo(@PathVariable int id, @PathVariable String nombre, @PathVariable int precio)
    {return "El id del producto es " + id + ", el nombre del producto es " + nombre + ", y el precio del producto" +
            " es " + precio;}

    @GetMapping("/devolver/{id}/{nombre}/{producto}/{precio}")
    public String devolver(@PathVariable int id, @PathVariable String nombre, @PathVariable String producto, @PathVariable int precio){
        double IVA = precio * 0.19;
        double retornarIVA = precio + IVA;
        return "El id del producto es " + id + ", y el precio con el valor del IVA seria de " + retornarIVA;
    }

    @PostMapping("/add")
    public Producto addproduct(@RequestBody Producto producto){
        return producto;
    }
}
