package com.alura.challengeLiteratura.principal;

import com.alura.challengeLiteratura.service.ConsumoAPI;
import com.alura.challengeLiteratura.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private String url = "http://https://gutendex.com/books";
    private final ConsumoAPI consumoApi = new ConsumoAPI();
    //private ConvierteDatos conversor = new ConvierteDatos();
    public void iniciarMenu() {
        System.out.println("Ingrese el nombre del LIBRO que desea buscar: ");
        String nombreLibro = sc.nextLine();
        var json = consumoApi.obtenerDatos(url);
        System.out.println(nombreLibro);
        System.out.println(json);


    }
}
