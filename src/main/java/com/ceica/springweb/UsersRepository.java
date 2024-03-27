package com.ceica.springweb;


import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Integer> {
    public Users findUsersById(Integer id);
}

