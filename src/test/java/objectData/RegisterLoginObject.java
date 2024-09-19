package objectData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterLoginObject extends GeneralObject{
    private String firstNameValue;
    private String lastNameValue;
    private String emailValue;
    private String passwordValue;

    public RegisterLoginObject(String filePath) {
        fromJsonToObject(filePath);
    }
}
