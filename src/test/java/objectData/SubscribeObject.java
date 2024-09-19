package objectData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubscribeObject extends GeneralObject{
    private String enterYourEmailValue;

  public SubscribeObject(String filePath){
      fromJsonToObject(filePath);

  }
}
