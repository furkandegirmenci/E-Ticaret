package com.eticaret.eticaretprojesi.service;

import com.eticaret.eticaretprojesi.units.Users;

import java.util.List;

public interface UserService {
    Users findUserByEmail(String email);

    List<Users> findAllUsers();
}
