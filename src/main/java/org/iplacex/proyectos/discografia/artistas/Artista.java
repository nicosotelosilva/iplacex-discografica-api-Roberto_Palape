package org.iplacex.proyectos.discografia.artistas;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Document("artistas")
public class Artista {
    @Id
    public String _id;

    public String nombre;
    public List<String> estilos;
    @Field(name = "anoFundacionANO",targetType = FieldType.INT32)
    public int anoFundacion;
    public boolean estaActivo;

}
