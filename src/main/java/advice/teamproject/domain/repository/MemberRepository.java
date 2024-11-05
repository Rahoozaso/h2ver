package advice.teamproject.domain.repository;


import advice.teamproject.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository <Member, Long>{

}
