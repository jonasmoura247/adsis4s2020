package trabalho15;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SimplificandoService {
    @Autowired
    private EntityManager em;

	public void testarPersistência() {
        em.createQuery("update Pais p set p.distritoFederal = null").executeUpdate();        
        em.createQuery("delete from Estado").executeUpdate();
        em.createQuery("delete from Pais").executeUpdate();


        CorpoHumano homem = new CorpoHumano("Homem");
        
        Membros membros1 = new Membros ("Dedos");
        Membros membros2 = new Membros ("Pernas");
        Orgaos orgaos = new Orgaos ("coracao");
        System.out.println(membros1.getId());
        System.out.println(membros2.getId());
        
        
        
        homem.addMembros(membros1);
        homem.addMembros(membros2);
        homem.addOrgaos(orgaos);
        
        homem.setCoracao(orgaos);
        
        em.persist(homem);
	}

}
