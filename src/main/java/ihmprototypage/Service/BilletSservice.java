package ihmprototypage.Service;

import ihmprototypage.Domain.Billet;
import ihmprototypage.Repository.BilletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mxm on 08/04/17.
 */
@Service
public class BilletSservice {

    @Autowired
    private BilletRepository billetRepository;

    public Billet saveBillet(Billet billet){
        return billetRepository.save(billet);
    }


}
