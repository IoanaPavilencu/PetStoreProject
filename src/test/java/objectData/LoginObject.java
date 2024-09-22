package objectData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginObject extends GeneralObject{
    private String emailLoginValue;
    private String passwordLoginValue;

    public LoginObject(String filePath) {
        fromJsonToObject(filePath);

    }
}
