package com.mai.impl;

import com.mai.modal.IMemberDao;
import com.mai.modal.IMemberService;
import com.mai.modal.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberService implements IMemberService {
    @Autowired
    IMemberDao iMemberDao;

    @Override
    public int add(Member member) {
        return iMemberDao.add(member);
    }

    @Override
    public int update(Member member) {
        return iMemberDao.update(member);
    }

    @Override
    public int delete(int idNum) {
        return iMemberDao.delete(idNum);
    }

    @Override
    public Member findMemberById(int idNum) {
        return iMemberDao.findMemberById(idNum);
    }

    @Override
    public List<Member> findMemberList() {
        return iMemberDao.findMemberList();
    }
}
