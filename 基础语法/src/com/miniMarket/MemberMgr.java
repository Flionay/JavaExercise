package com.miniMarket;

import java.text.SimpleDateFormat;
import java.util.*;

public class MemberMgr {
    // 所有会员
    List<Member> manger = new ArrayList<Member>();
    Scanner input = new Scanner(System.in);

    // 输出欢迎菜单
    public void menu(){
        System.out.println("**************** 欢迎使用超市管理系统 ****************");
        System.out.println("1. 开卡   2. 修改密码  3. 积分累计  4. 积分兑换  5. 剩余积分查询  6.退出");
        System.out.println("**************************************************");
        System.out.print("请选择： ");
    }

    // 搭建项目整体流程
    public void start(){
        do{
            menu();
            int choose = input.nextInt();
            switch (choose){
                case 1:
//                    System.out.println("开卡");
                    register();
                    break;
                case 2:
                    if (changePwd()){
                        System.out.println("新密码设置成功！");
                    }
                    break;
                case 3:
                    if (saveScore()){
                        System.out.println("积分累计成功！");
                    }
                    break;
                case 4:
                    resetScore();
                    break;
                case 5:
                    scoreQuery();
                    break;
                case 6:
                    System.out.println("感谢您的使用，欢迎下次使用！");
                    break;
                default:
                    System.out.println("操作有误！请重新选择： ");
            }
            if(choose==6){
                break;
            }
        }while(true);
    }

    // 随机生成一个卡号
    public int createId(){
        Random ramdom = new Random();
        int id = ramdom.nextInt(99999999);
        // 保证生成不同的id
        for(Member m:manger){
            if (m.getCardId()==id){
                id = ramdom.nextInt(99999999);
            }
        }
        return id;
    }

    //开卡
    public void register(){
        Member member = new Member();
        System.out.print("请输入注册姓名：");
        member.setName(input.next());
        System.out.print("请输入密码: ");
//        member.setPasswd(input.next());

        // 验证密码不低于6位
        String pwd;
        boolean flag = false;
        do{
            pwd = input.next();
            if(pwd.length()<6){
                System.out.println("会员密码不低于6位，请重新输入： ");
                flag = false;
            }else{
                flag = true;
                member.setPasswd(pwd);
            }
        }while(!flag);

        member.setCardId(createId());
        member.setScore(100);

        //开卡日期
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM月DD日");
        String cardDate = format.format(date);
        member.setRegistDate(cardDate);

        manger.add(member);
        System.out.println("开卡成功，系统赠送100积分，您的会员卡号是："+member.getCardId());
    }

    // 验证会员是否存在
    public Member hasMember(Member me){
        Member member = null;
        for (Member m:manger){
            if (m.getCardId() == me.getCardId() && m.getPasswd().equals(me.getPasswd())){
                member = m;
            }
        }
        return member;
    }

    // 修改密码
    // 卡号 和 原来的密码
    public boolean changePwd(){
        boolean flag = true;
        Member member = new Member();
        System.out.println("请输入您的会员卡号： ");
        member.setCardId(input.nextInt());
        System.out.println("请输入您的会员密码： ");
        member.setPasswd(input.next());

        member = hasMember(member); //用新的对象 作为参数

        if(member!=null){
            System.out.print("请输入新的会员密码： ");
            String pwd;
            boolean flagpwd = true;
            do {
                pwd = input.next();
                if (pwd.length() < 6) {
                    System.out.println("会员密码不能小于6位，请重新输入： ");
                    flagpwd = false;
                } else {
                    flagpwd = true;
                    member.setPasswd(pwd);
                }
            }while(!flagpwd);
        }else{
            System.out.println("您输入的会员卡号或者密码错误，无法修改密码");
            flag = false;
        }
        return flag;
    }

    //积分累计
    public boolean saveScore(){
        boolean flag = true;
        Member member = new Member();
        System.out.println("请输入您的会员卡号： ");
        member.setCardId(input.nextInt());
        System.out.println("请输入您的会员密码： ");
        member.setPasswd(input.next());

        member = hasMember(member); //用新的对象 作为参数
        if (member!=null){
            System.out.println("请输入您此次的消费金额（消费1元累计1分）：");
            int score = input.nextInt();
            member.setScore(member.getScore()+score);
            flag = true;
        }else{
            System.out.println("您输入的会员卡号或者密码错误，无法积分！");
            flag = false;
        }
        return flag;
    }

    //积分查询
    public void scoreQuery(){
        Member member = new Member();
        System.out.println("请输入您的会员卡号： ");
        member.setCardId(input.nextInt());
        System.out.println("请输入您的会员密码： ");
        member.setPasswd(input.next());

        member = hasMember(member); //用新的对象 作为参数
        if (member!=null){
            int score = member.getScore();
            System.out.println("您的积分为："+score);
        }else{
            System.out.println("无法查询");
        }
    }
    // 积分兑换

    public void resetScore(){
        Member member = new Member();
        System.out.println("请输入您的会员卡号： ");
        member.setCardId(input.nextInt());
        System.out.println("请输入您的会员密码： ");
        member.setPasswd(input.next());

        member = hasMember(member); //用新的对象 作为参数
        if (member!=null){
            System.out.println("请输入您要兑换的积分额度：");
            int score = input.nextInt();
            if (score<100){
                System.out.println("积分太低不允许兑换！");
            }else if(score>member.getScore()) {
                System.out.println("您的积分不够！");
            }else{
                member.setScore(member.getScore()-score);
                System.out.println("积分兑换成功");
            }
        }
    }
}
