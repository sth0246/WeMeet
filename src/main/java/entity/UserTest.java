package entity;


import io.swagger.annotations.Api;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: sth
 * @Description: 测试ssm框架
 * @Date: 2022/10/28
 * @Time: 22:24
 */
@Data
@Api(value = "student的操作类", description = "学生类")
public class UserTest {
    private String name;
    private String pwd;
}