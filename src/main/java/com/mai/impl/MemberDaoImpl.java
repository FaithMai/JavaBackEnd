package com.mai.impl;

import com.mai.modal.IMemberDao;
import com.mai.modal.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

//  idNum int(10) primary key,
//          name varchar(20) not null,
//          gender int(4) not null default 0,
//        birthday varchar(30),
//        nativePlace varchar(50),
//        nation varchar(20),
//        idCardNum varchar(18) not null,
//        admissionTime varchar(30),
//        educationBackground varchar(30),
//        startTime varchar(30)
@Repository
public class MemberDaoImpl implements IMemberDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Member member) {

        return jdbcTemplate.update("insert into member(idNum, name, gender, birthday, nativePlace, nation, idCardNum, admissionTime, educationBackground, startTime) value(?,?,?,?,?,?,?,?,?,?)",
                member.getIdNum(),member.getName(),member.getGender(),member.getBirthday(),member.getNativePlace(),member.getNation(),member.getIdCardNum(),member.getAdmissionTime(),member.getEducationBackground(),member.getStartTime());
    }

    @Override
    public int update(Member member) {

        return jdbcTemplate.update("update member set name=?, gender=?,birthday=?,nativePlace=?,nation=?, idCardNum=?, admissionTime=?, educationBackground=?, startTime=?",
                member.getName(),member.getGender(),member.getBirthday(),member.getNativePlace(),member.getNation(),member.getIdCardNum(),member.getAdmissionTime(),member.getEducationBackground(),member.getStartTime());
    }

    @Override
    public int delete(int idNum) {

        return jdbcTemplate.update("DELETE from TABLE account where idNum=?",idNum);
    }

    @Override
    public Member findMemberById(int idNum) {
        List<Member> list = jdbcTemplate.query("select * from member where idNum = ?", new Object[]{idNum},new BeanPropertyRowMapper(Member.class));
        if(list!=null && list.size()>0){
            Member member = list.get(0);
            return member;
        }else{
            return null;
        }
    }

    @Override
    public List<Member> findMemberList() {
        List<Member> list = jdbcTemplate.query("select * from member", new Object[]{},new BeanPropertyRowMapper(Member.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }
}
