package com.shopsmart.productos;

import com.shopsmart.productos.model.Producto;
import com.shopsmart.productos.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(ProductoRepository repository) {
        return args -> {
            repository.save(new Producto(null, "Laptop HP Pavilion", "Laptop 15 pulgadas, 8GB RAM, 512GB SSD", 599990.0, 15, "Computación"));
            repository.save(new Producto(null, "Mouse Inalámbrico Logitech", "Mouse ergonómico, 1000 DPI, batería AA", 24990.0, 50, "Periféricos"));
            repository.save(new Producto(null, "Teclado Mecánico Redragon", "Teclado RGB switches rojos, TKL", 49990.0, 30, "Periféricos"));
            repository.save(new Producto(null, "Monitor Samsung 24\"", "Full HD, 75Hz, panel IPS, HDMI + VGA", 179990.0, 10, "Monitores"));
            repository.save(new Producto(null, "Audífonos Sony WH-1000XM4", "Cancelación de ruido activa, Bluetooth 5.0", 219990.0, 20, "Audio"));
        };
    }
}
