package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Account;
import com.example.demo.Repositary.AccountRepo;
@Service
public class AccountService {
    @Autowired
    AccountRepo mr;
    public Account create (Account mm)
    {
        return mr.save(mm);
    }
    public List<Account> getAll()
    {
        return mr.findAll();
    }
    public Account getMe(int id)
    {
        return mr.findById(id).orElse(null);
    }
    public boolean updateDetails(int id,Account mm)
        {
            if(this.getMe(id)==null)
            {
                return false;
            }
            try{
                mr.save(mm);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
public boolean deleteMedicine(int id)
        {
            if(this.getMe(id) == null)
            {
                return false;
            }
            mr.deleteById(id);
            return true;
        }

}