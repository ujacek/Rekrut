package pl.ukomp.rekrut.dao.repo;

import pl.ukomp.rekrut.dao.model.Company;
import org.springframework.data.repository.CrudRepository;

/**
 * Definicja repozytorium operującego na tabeli Company z id typu Integer.
 * 
 * @author Jacek
 */
public interface CompanyRepository extends CrudRepository<Company, Integer> {
}
