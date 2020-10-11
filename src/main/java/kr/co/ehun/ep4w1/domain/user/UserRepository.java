package kr.co.ehun.ep4w1.domain.user;


import com.chequer.axboot.core.domain.base.AXBootJPAQueryDSLRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends AXBootJPAQueryDSLRepository<User, String> {
}
