package service;

import entity.Room;
import entity.UserTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.impl.UserServiceTestImpl;

import javax.annotation.Resource;

/**
 * @Author: sth
 * @Description:
 * @Date: 2022/10/30
 * @Time: 14:43
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserServiceTestImplTest {
    @Autowired
    private service.impl.UserServiceTestImpl userServiceTestImpl;
    @Test
    public void myTest(){
        for (UserTest userTest : userServiceTestImpl.findAllUser()) {
            System.out.println(userTest);
        }
    }

    @Autowired
    private service.impl.RoomServiceImpl roomServiceImpl;
    @Test
    public void roomInit(){
        Room room = new Room();
        for (int i = 1000; i <= 9999 ; i++) {
            room.setRoomId(i);
            room.setStatus(0);
            roomServiceImpl.insertRoomInit(room);
        }
    }
    @Test
    public void check(){

        boolean b = roomServiceImpl.updateP1(1000, "!23", "!23");
        System.out.println(b);
    }


}
