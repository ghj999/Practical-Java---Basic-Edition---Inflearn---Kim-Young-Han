package construct;

import static construct.MethodInitMain2.initMember;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit memeber1 = new MemberInit();
        memeber1.initMember("user1", 15, 90);

        //initMember(memeber1, "user1", 15, 90);
        //memeber1.name = "user1";
        //memeber1.age = 15;
        //memeber1.grade = 90;

        MemberInit memeber2 = new MemberInit();
        memeber2.initMember("user2", 16, 80);
        //initMember(memeber2, "user2", 16, 80);
        // memeber2.name = "user2";
       // memeber2.age = 16;
       // memeber2.grade = 80;

        MemberInit[] members = {memeber1, memeber2};

        for (MemberInit s : members) {
            System.out.println("이름:" + s.name + "나이:" + s.age + "성적:" + s.grade);
        }
    }

    //static void initMember(MemberInit member, String name, int age, int grade) {
      //  member.name = name;
        //member.age = age;
        //member.grade = grade;
    }

