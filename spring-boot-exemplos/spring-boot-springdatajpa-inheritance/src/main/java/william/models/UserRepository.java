package william.models;

import javax.transaction.Transactional;

/**
 * Repository for the entity User.
 * 
 * @see william.models.UserBaseRepository
 */
@Transactional
public interface UserRepository extends UserBaseRepository<User> { }
