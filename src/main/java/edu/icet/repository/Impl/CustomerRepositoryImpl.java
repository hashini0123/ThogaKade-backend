package edu.icet.repository.Impl;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

    final private JdbcTemplate jdbcTemplate;

    @Override
    public boolean addCustomer(CustomerDTO customer) {
        String sql = "INSERT INTO customer value(?,?,?,?,?,?,?,?,?)";

        return jdbcTemplate.update(sql,
                customer.getCustID(),
                customer.getCustTitle(),
                customer.getCustName(),
                customer.getDOB(),
                customer.getSalary(),
                customer.getCustAddress(),
                customer.getCity(),
                customer.getProvince(),
                customer.getPostalcode()
        )>0;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customer) {
        String  sql = "UPDATE customer SET custTitle=?,custName=?, dob=?, salary=?, custAddress=?, city=?, province=?, postalcode=? WHERE CustID=?";

        return jdbcTemplate.update(sql,
                customer.getCustID(),
                customer.getCustTitle(),
                customer.getCustName(),
                customer.getDOB(),
                customer.getSalary(),
                customer.getCustAddress(),
                customer.getCity(),
                customer.getProvince(),
                customer.getPostalcode()
                )>0;
    }

    @Override
    public boolean deleteCustomer(Integer id) {
        String sql = "DELETE FROM customer WHERE CustID=?";

        return jdbcTemplate.update(sql,id)>0;
    }

    @Override
    public List<CustomerDTO> getAll() {
        String sql = "SELECT * FROM customer";

        List<CustomerDTO> customerDTOList = jdbcTemplate.query(sql,(rs,rowNum)->{
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setCustID(rs.getString(1));
            customerDTO.setCustName(rs.getString(2));
            customerDTO.setCustTitle(rs.getString(3));
            java.sql.Date sqlDate = rs.getDate(4);
            if (sqlDate != null) {
                customerDTO.setDOB(sqlDate.toLocalDate());
            } else {
                customerDTO.setDOB(null);
            }
            customerDTO.setSalary(rs.getDouble(5));
            customerDTO.setCustAddress(rs.getString(6));
            customerDTO.setCity(rs.getString(7));
            customerDTO.setProvince(rs.getString(8));
            customerDTO.setPostalcode(rs.getString(9));
            return customerDTO;
        });

        return customerDTOList;
    }
}