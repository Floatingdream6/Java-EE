package com.zut.Test;

import com.zut.Dao.PersonDao;
import com.zut.Service.MeettingSevice;
import com.zut.Util.Boss;
import com.zut.Util.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.text.DefaultEditorKit;
import java.util.Scanner;

/**
 * Created by 韩俊哲
 * on 2019/10/12
 */

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        MeettingSevice meettingSevice = applicationContext.getBean("meettingservice", MeettingSevice.class);
        PersonDao personDao = applicationContext.getBean("persondaoimpl", PersonDao.class);
        Car car = applicationContext.getBean("car", Car.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 打印会议信息");
        System.out.println("2. 修改成员");
        System.out.println("3. 删除成员");
        System.out.print("input your choice:");
        switch (scanner.nextInt()) {
            case 1:
                meettingSevice.PrintSomeMessage();
                break;
            case 2:
                scanner = new Scanner(System.in);
                System.out.print("输入修改用户名字：");
                Boss boss = personDao.SearchBossByName(scanner.nextLine());
                if (boss == null) {
                    System.out.print("无此用户！");
                } else {
                    System.out.println(boss);
                    System.out.println("1.修改公司");
                    System.out.println("2.修改汽车");
                    System.out.println("3.修改爱好");
                    System.out.print("input your choice:");
                    scanner = new Scanner(System.in);
                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.print("输入要修改为的名字:");
                            scanner = new Scanner(System.in);
                            boss.setCompany(scanner.nextLine());
                            personDao.ModifyPersonInfo(boss);
                            System.out.println(boss);
                            meettingSevice.PrintSomeMessage();
                            break;
                        case 2:
                            scanner = new Scanner(System.in);
                            System.out.print("输入汽车品牌、颜色、排量:");
                            car.setBrand(scanner.nextLine());
                            car.setColor(scanner.nextLine());
                            car.setDisplacement(scanner.nextFloat());
                            boss.setCar(car);
                            personDao.ModifyPersonInfo(boss);
                            System.out.println(boss);
                            break;
                        case 3:
                            System.out.print("输入要修改为的爱好:");
                            scanner = new Scanner(System.in);
                            boss.setHobby(scanner.nextLine());
                            personDao.ModifyPersonInfo(boss);
                            System.out.println(boss);
                            break;
                        default:
                    }
                }
                break;
            case 3:
                System.out.print("输入姓名：");
                scanner = new Scanner(System.in);
                personDao.DeletePerson(scanner.nextLine());
                meettingSevice.PrintSomeMessage();
                break;
            default:
        }
    }
}
