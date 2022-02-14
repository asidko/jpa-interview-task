package com.example.jpademo;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserResource {
    private final UserRepository userRepository;

    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /////////////////////////////////
    // ⚠️ Задания
    // TODO: 1. Исправить проблему n+1 запроса
    // TODO: 2. Добавить фильтрацию по полю ids из UserCriteria
    // TODO: 3. Добавить фильтрацию по полю hasShiftAfter из UserCriteria
    /////////////////////////////////

    @GetMapping("users")
    public List<User> getUsers(@ParameterObject UserCriteria criteria) {
        Specification<User> specification = createSpecification(criteria);

        return userRepository.findAll();
    }

    private Specification<User> createSpecification(UserCriteria criteria) {
        Specification<User> specification = Specification.where(null);

        return specification;
    }
}
