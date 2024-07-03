package Pom;

import lombok.Data;

@Data
public class LoginPom {


    private LoginPom(){

    }


    private static LoginPom Instance;


    public static LoginPom getInstance(){
        if (Instance == null){
            Instance = new LoginPom();
            return Instance;
        }
        return Instance;
    }
}
