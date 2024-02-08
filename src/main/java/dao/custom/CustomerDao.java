package dao.custom;

import dao.CrudDao;
import entity.Customer;

public interface CustomerDao extends CrudDao<Customer> {
     Customer findById(String id);

}
