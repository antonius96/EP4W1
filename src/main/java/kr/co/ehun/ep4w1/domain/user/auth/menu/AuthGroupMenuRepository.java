package kr.co.ehun.ep4w1.domain.user.auth.menu;

import com.chequer.axboot.core.domain.base.AXBootJPAQueryDSLRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthGroupMenuRepository extends AXBootJPAQueryDSLRepository<AuthGroupMenu, AuthGroupMenu.AuthGroupMenuId> {
}
