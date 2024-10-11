package org.example.repository;

import org.example.Tarea;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TareaMapper {

    @Insert("INSERT INTO tareas(nombre, descripcion, fecha_inicio) VALUES(#{nombre}, #{descripcion}, #{fechaInicio})")
    void insertarTarea(Tarea tarea);

    @Select("SELECT * FROM tareas")
    List<Tarea> obtenerTareas();
}
