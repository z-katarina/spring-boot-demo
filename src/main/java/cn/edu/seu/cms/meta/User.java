package cn.edu.seu.cms.meta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;

/**
 * Created by hzzhouxiaotian
 * Data: 2017/1/10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    @NotBlank(message = "姓名不能为空")
    private String name;

    @NotNull(message = "年龄不能为空")
    private Integer age;

    @NotBlank(message = "时间不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String birthday;

    @Email(message = "邮箱格式不正确")
    private String email;
}
