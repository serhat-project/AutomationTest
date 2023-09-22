package pojo;

import lombok.Data;

@Data
public class LoginPojo {
    private String username;
    private String password;
    private String device_os;
    private String device_id;
    private String device_token;
}
