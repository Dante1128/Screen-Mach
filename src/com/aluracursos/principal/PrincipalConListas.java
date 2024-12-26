package com.aluracursos.principal;

import com.aluracursos.screenmach.modelos.Pelicula;
import com.aluracursos.screenmach.modelos.Serie;
import com.aluracursos.screenmach.modelos.Titulo;

import java.util.ArrayList;
import java.util.Objects;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2023);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix",1988);
        otraPelicula.evalua(9);
        var peliculaDeBruno = new Pelicula("El semor de los anillos ",2001);
        peliculaDeBruno.evalua(8);
        Serie casaDragon  = new Serie("Casa del Dragon", 2022 );
        casaDragon.evalua(7);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);

        lista.add(otraPelicula);

        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item: lista) {
            System.out.println(item);
            Pelicula pelicula = (Pelicula) item;

            System.out.println(pelicula.getClasificacion());

        }
    }
}
