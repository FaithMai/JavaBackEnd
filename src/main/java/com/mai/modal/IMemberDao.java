package com.mai.modal;

import java.util.List;

public interface IMemberDao {
    int add(Member member);

    int update(Member member);

    int delete(int id);

    Member findMemberById(int id);

    List<Member> findMemberList();
}
