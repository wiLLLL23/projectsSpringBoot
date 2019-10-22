package william.models;

import javax.transaction.Transactional;

/**
 * Repository for the entity Company.
 * 
 * @see william.models.UserBaseRepository
 */
@Transactional
public interface CompanyRepository extends UserBaseRepository<Company> { }
