package entity;

import java.util.List;

import es.santander.ucrapl.ucrmonogrucr.dto.QuestionDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad example.
 * 
 * @author jslopez
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExampleEntity {

	/** the id */
	private String id;

	/** the identifiers */
	private List<String> identifiers;
	
	/** the name */
	private String name;

	/** the startDate */
	private String creationDate;

	/** the status */
	private Boolean status;

	/** the questionsList */
	private List<QuestionDTO> questionsList;
	
	/** the userCreate */
	private String userCreate;

}
