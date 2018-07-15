package com.mai.modal;

import java.util.List;

public interface IMemberService {
    int add(Member account);

    int update(Member account);

    int delete(int id);

    Member findMemberById(int id);

    List<Member> findMemberList();

}
