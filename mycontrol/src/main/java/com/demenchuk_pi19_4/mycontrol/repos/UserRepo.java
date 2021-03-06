package com.demenchuk_pi19_4.mycontrol.repos;

import com.demenchuk_pi19_4.mycontrol.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface User repo.
 */
public interface UserRepo extends JpaRepository<UserModel, Long> {
}
