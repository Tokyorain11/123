package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * stu_tab
 * @author 
 */
@Data
public class StuTab implements Serializable {
    private Integer id;

    private String name;

    private Integer age;

    private static final long serialVersionUID = 1L;
}