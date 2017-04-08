package ihmprototypage.Repository;

import ihmprototypage.Domain.Billet;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by mxm on 08/04/17.
 */
public interface BilletRepository extends PagingAndSortingRepository<Billet, Long> {
}
