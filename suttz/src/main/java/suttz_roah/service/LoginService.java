package suttz_roah.service;

/**
 * Created by asrh0 on 2017/7/3.
 */
public class LoginService {
   /* User ub=new User();
		try {
        UserDao ud = (UserDao) sqlSession.getMapper(UserDao.class);
        ub=ud.getuser(user);

        sqlSession.commit();
            *//*提交事务*//*
    } catch(Exception e){

    }
        *//*验证部分*//*

		try{
        if(user.getUsername().equals(ub.getUsername())){
            if(user.getPasswd().equals(ub.getPasswd())){
                get="success";
            }else{
                get="密码错误";
            }
        }
		*//*空指针代表用户不存在*//*
    }catch(NullPointerException e){
        get="用户不存在";
    }finally{
        return get;
    }
}*/
}
