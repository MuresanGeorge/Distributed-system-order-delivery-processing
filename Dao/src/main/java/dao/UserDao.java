package dao;

import entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class UserDao {

    public UserDao(){

    }

    public User findUser(String username) {
        User user = null;
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            List<User> users = session.createQuery("select u from User u where u.username=:username", User.class)
                    .setParameter("username",username)
                    .list();
            if(users.size() > 0 ){
                user = users.get(0);
            }
            trns.commit();
        } catch (Exception e) {
            if (trns != null) {
                trns.rollback();
            }
        } finally {
            session.close();
        }
        return user;
    }

    public void addUser(User user){
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(user);
            //aaaa
            trns.commit();
            //aaaa\
            //sau trns.commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


}
