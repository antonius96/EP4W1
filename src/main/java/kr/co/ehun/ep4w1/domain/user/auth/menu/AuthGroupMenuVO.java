package kr.co.ehun.ep4w1.domain.user.auth.menu;

import kr.co.ehun.ep4w1.domain.program.Program;
import lombok.Data;

import java.util.List;

@Data
public class AuthGroupMenuVO {

    private List<AuthGroupMenu> list;

    private Program program;
}
