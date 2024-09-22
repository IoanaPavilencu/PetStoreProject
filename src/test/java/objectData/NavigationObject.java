package objectData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NavigationObject extends GeneralObject{
    private String searchValue;

    public NavigationObject(String filePath){
        fromJsonToObject(filePath);
    }
}
