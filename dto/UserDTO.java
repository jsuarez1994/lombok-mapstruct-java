package dto;

import java.util.List;

import es.santander.ucrapl.ucrmonogrucr.dto.QuestionDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad user.
 * 
 * @author jslopez
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {

	/** the id */
	private String id;
	
	/** the name */
	private String name;

	/** the surname */
	private String surname;

	/** the status */
	private Boolean status;

}
