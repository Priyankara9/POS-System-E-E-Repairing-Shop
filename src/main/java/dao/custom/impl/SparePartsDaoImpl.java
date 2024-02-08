package dao.custom.impl;

import dao.custom.SparePartsDao;
import entity.SpareParts;

import java.sql.SQLException;
import java.util.List;

public class SparePartsDaoImpl implements SparePartsDao {
    @Override
    public boolean save(SpareParts entity) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(SpareParts entity) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String value) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public List<SpareParts> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }
}
