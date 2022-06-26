package ru.otus.microservices.hw2.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.otus.microservices.hw2.entity.User;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepo extends PagingAndSortingRepository<User, Integer> {
	List<User> findAllByFirstNameAndLastName(String firstName, String lastName);
	Optional<User> findUserByEmail(String email);
	Optional<User> findUserByPhone(String phone);
}
