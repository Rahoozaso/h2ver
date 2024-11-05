package advice.teamproject.domain.service;

import advice.teamproject.domain.entity.Member;
import advice.teamproject.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class RegisterService {
    private final MemberRepository memberRepository;

    public Member create(String username, String email, String password, char campus) {
        Member member = new Member();
        member.setUsername(username);
        member.setEmail(email);
        member.setPassword(password);
        member.setCampus(campus);
        this.memberRepository.save(member); // 수정된 부분
        return member;
    }

}
