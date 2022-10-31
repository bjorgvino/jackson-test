package in.bjorgv.app;

import java.util.Arrays;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;

public class App {
    public static void main(String[] args) {
        var settings = new JsonInclude.Include[]{JsonInclude.Include.NON_EMPTY, JsonInclude.Include.NON_ABSENT, JsonInclude.Include.ALWAYS};
        Arrays.stream(settings).forEach(setting -> {
            try
            {
                ObjectMapper mapper = new ObjectMapper();
                mapper.setSerializationInclusion(setting);
                System.out.println(mapper.writeValueAsString(new Car(setting.toString())));
            } catch (Exception ex)
            {
    
            }    
        });
      }
}
