package com.example.lmc.task;

import com.example.lmc.config.CustomPrefixConfig;
import com.example.lmc.config.TestDemoConfig;
import com.example.lmc.dao.UsersDao;
import com.example.lmc.entity.UserInfo;
import com.example.lmc.entity.UserInfoEntity;
import com.example.lmc.provider.UserInfoServiceApi;
import com.example.lmc.util.date.DateTimeTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

/**
 * @author lmc
 * @date 2020/7/31 23:12
 */
@Component
public class ScheduleTask {
    //+1.1.Environment读取配置文件
    @Autowired
    private Environment environment;

    @Autowired
    private TestDemoConfig testDemoConfig;

    @Autowired
    private CustomPrefixConfig customPrefixConfig;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserInfoServiceApi userInfoServiceApi;

    @Autowired
    private UsersDao usersDao;



    //@Scheduled(fixedRate = 10000)
    public void jpaTest() {
        UserInfoEntity userInfoEntity = usersDao.findById(2001).get();
        System.out.println(userInfoEntity.toString());


    }



    //@Scheduled(fixedRate = 50000)
    public void envConfig() {
        String port = environment.getProperty("environment.port");
        System.out.println("Environment读取配置文件方式,读取端口号：" + port);

        System.out.println("@Value读取配置文件方式,读取端口号：" + testDemoConfig.getPort());

        System.out.println("Prefix读取配置文件方式,读取端口号：" + customPrefixConfig.getPort());

    }


    //@Scheduled(fixedRate = 30000)
    public void throwException() {
        Map<String, String> params = new HashMap<String, String>();

        //+3.1.@RestControllerAdvice全局拦截
        restTemplate.getForObject("http://localhost:8800/test/throwException", Void.class, params);

        restTemplate.getForObject("http://localhost:8800/test/throwCustomException", Void.class, params);

    }


    //@Scheduled(fixedRate = 5000000)
    public void userAdd() {
        for (int i = 0; i < 1000; i++) {
            UserInfo userInfo = UserInfo.builder()
                    .name("test" + i)
                    .sex(new Random().nextInt(2))
                    .phone("1351234" + new Random().nextInt(10) + new Random().nextInt(10) + new Random().nextInt(10) + new Random().nextInt(10))
                    .birthday("200" + new Random().nextInt(10)
                            + "-0"
                            + (new Random().nextInt(9) + 1)
                            + "-"
                            + new Random().nextInt(3)
                            + (new Random().nextInt(9) + 1))
                    .createTime(DateTimeTools.getDate())
                    .status(new Random().nextInt(2))
                    .build();
            userInfoServiceApi.addUserInfo(userInfo);

        }


    }


}
