package mapper;

import org.apache.commons.lang3.StringUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import es.santander.ucrapl.ucrdtogrucr.dto.dtographicDTO;
import es.santander.ucrapl.ucrdtogrucr.front.dtographicFront;

/**
 * Mapper for the front model {@link ExampleEntity} and its DTO
 * {@link ExampleDTO}.
 * 
 * @author rtorresc
 *
 */
@Mapper(componentModel = "spring", uses = {})
public interface ExampleMapper extends GenericMapper<ExampleDTO, ExampleEntity>{

	
	@Mapping(target = "active", 		expression = "java(true)")
	@Mapping(target = "manager", 		source = "dto.manager")
	@Mapping(target = "createdByUser", 	source = "dto.createdByUser")
	@Mapping(target = "name", 			source = "source.name")
	@Mapping(target = "status", 		source = "source.status")
	@Mapping(target = "identifiers", 	source = "source.identifiers")
	@Mapping(target = "id", 			source = "source.id", qualifiedByName = "getId")
	@Mapping(target = "creationDate", 	source = "dto.creationDate")
	ExampleDTO toDto(ExampleEntity source, ExampleDTO dto);
	

	@Mapping(target = "id", 			source = "name", 		qualifiedByName = "mapNameById")
	@Mapping(target = "active", 		expression = "java(activeEntity)")
	@Mapping(target = "userCreate", 	source = "user", 	qualifiedByName = "setUserCreateName")
	ExampleEntity toEntity(ExampleDTO source, @Context Map<String, String> statusMap, 
						Boolean activeEntity, UserDTO user);
	
	
	@Named("getId")
	default String getId(String id) {
		// TODO: Logic method
	}
	
	
	@Named("mapNameById")
	default String mapNameById(String id, @Context Map<String, String> statusMap) {
		// TODO: Logic method
	}
	
	@Named("setUserCreateName")
	default String setUserCreateName(UserDTO user) {
		// TODO: Logic method
	}
}
