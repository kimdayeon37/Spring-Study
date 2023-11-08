package hello.core.member;

public class MemberServiceImpl implements MemberService {

    // 빈 인터페이스에 구현체 넣기
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
