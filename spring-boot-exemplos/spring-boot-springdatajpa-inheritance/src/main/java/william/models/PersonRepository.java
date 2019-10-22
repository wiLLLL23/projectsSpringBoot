package william.models;

import javax.transaction.Transactional;

/**
 * Repository for the entity Person.
 * 
 * @see william.models.UserBaseRepository
 */
@Transactional
public interface PersonRepository extends UserBaseRepository<Person> { }
