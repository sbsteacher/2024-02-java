package com.green.day11.ch16;

public class MyFriends {
    public static void main(String[] args) {

    }
}
//private 멤버필드 값 넣는 방법 2가지
//1. 생성자
//2. 메소드(setter)

//아래 두 클래스 모두 생성자로 멤버필드 초기화 할 수 있도록 만들어주세요.


//아래의 두 클래스는 중복된 내용이 있다. 그리고 둘다 사람의 정보를 저장한다.
//그래서 중복된 정보를 상속으로 처리하면 코드가 줄어든다.
class UnivFriend { //대학친구
    private String name;
    private String major; //전공
    private String phone;

    UnivFriend(String name, String major, String phone) {
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getPhone() {
        return phone;
    }
}

class CompFriend { //직장동료
    private String name;
    private String department; //부서
    private String phone;

    public CompFriend(String name, String department, String phone) {
        this.name = name;
        this.department = department;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPhone() {
        return phone;
    }
}
