package in.bjorgv.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonSerialize
public class Car {
    public String _inclusionSetting;
    public String stringNull;
    public String stringEmpty = "";
    public String stringValue = "Hello!";

    public Long longNull;
    public Long longZero = 0L;
    public Long longNonZero = 99L;
    
    public List<String> listNull;
    public List<String> listEmpty = new ArrayList<>();
    public List<String> listNonEmpty = new ArrayList<String>(){
        {
            add("Item");
        }
    };
    public List<String> listNonEmptyWithEmptyStringValue = new ArrayList<String>(){
        {
            add("");
        }
    };

    public Map<String, Object> mapNull;
    public Map<String, Object> mapEmpty = new HashMap<String, Object>();
    public Map<String, Object> mapNonEmpty = new HashMap<String, Object>(){
        {
            put("assets", new ArrayList<String>());
            put("scenes", new ArrayList<String>());
        }
    };

    public Car(String inclusionSetting) {
        this._inclusionSetting = inclusionSetting;
    }
}
