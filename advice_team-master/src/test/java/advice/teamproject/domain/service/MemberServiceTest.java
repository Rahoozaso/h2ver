package advice.teamproject.domain.service;

import advice.teamproject.domain.entity.Member;
import advice.teamproject.domain.repository.member.MemoryMemberRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class MemberServiceTest {

    private final RegisterService memberService = new RegisterService(new MemoryMemberRepository());

    @Test
    public void test() {

        // given
        Member member = new Member();
        member.setId(1L);
        memberService.join(member);

        // when
        Member findMember = memberService.findMember(1L).get();

        // then
        assertThat(findMember).isEqualTo(member);

    }
  
}