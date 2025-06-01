package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit memeber1 = new MemberInit();
        memeber1.name = "user1";
        memeber1.age = 15;
        memeber1.grade = 90;

        MemberInit memeber2 = new MemberInit();
        memeber2.name = "user2";
        memeber2.age = 16;
        memeber2.grade = 80;

        MemberInit[] members = {memeber1, memeber2};

        for (MemberInit s : members) {
            System.out.println("이름:" + s.name + "나이:" + s.age + "성적:" + s.grade);
        }
    }
}
