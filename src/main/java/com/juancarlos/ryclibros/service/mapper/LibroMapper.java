package com.juancarlos.ryclibros.service.mapper;

import com.juancarlos.ryclibros.domain.*;
import com.juancarlos.ryclibros.service.dto.LibroDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Libro} and its DTO {@link LibroDTO}.
 */
@Mapper(componentModel = "spring", uses = { CategoriaMapper.class, UserMapper.class })
public interface LibroMapper extends EntityMapper<LibroDTO, Libro> {
    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "numero", source = "numero")
    @Mapping(target = "observaciones", source = "observaciones")
    @Mapping(target = "cantidad", source = "cantidad")
    @Mapping(target = "createdDate", source = "createdDate")
    @Mapping(target = "lastModifiedDate", source = "lastModifiedDate")
    @Mapping(target = "createdBy", source = "createdBy")
    @Mapping(target = "lastModifiedBy", source = "lastModifiedBy")
    @Mapping(target = "user", source = "user", qualifiedByName = "id")
    @Mapping(target = "categoria", source = "categoria", qualifiedByName = "id")
    LibroDTO toDto(Libro s);
}
