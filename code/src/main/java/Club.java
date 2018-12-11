import java.lang.reflect.Member;
import java.util.HashSet;
import java.util.Set;

public class Club {

    private Set<Member> members = new HashSet<>();

    public void addMember(Member member) { /*...*/ }

    // DANGEROUS: mutable private member leaked
    public Set<Member> getMembers() {
        return members;
    }

}
