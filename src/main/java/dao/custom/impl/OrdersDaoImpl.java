package dao.custom.impl;

import dao.custom.OrdersDao;
import dao.util.HibernateUtil;
import entity.Item;
import entity.Orders;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.List;

public class OrdersDaoImpl implements OrdersDao {
    @Override
    public boolean save(Orders entity) throws SQLException, ClassNotFoundException {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Orders entity) throws SQLException, ClassNotFoundException {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(String value) throws SQLException, ClassNotFoundException {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Orders orders = session.get(Orders.class, value);
        if (orders != null) {
            session.delete(orders);
            transaction.commit();
            return true;
        }

        return false;
    }

    @Override
    public List<Orders> getAll() throws SQLException, ClassNotFoundException {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Query<Orders> query = session.createQuery("FROM Orders", Orders.class);
        List<Orders> items = query.list();

        transaction.commit();
        return items;
    }
}
