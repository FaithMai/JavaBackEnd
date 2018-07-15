package com.mai.web;


import com.mai.impl.MemberService;
import com.mai.modal.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Member> getMembers(){
        return memberService.findMemberList();
    }
    @RequestMapping(value = "/{idNum}",method = RequestMethod.GET)
    public  Member getMemberById(@PathVariable("idNum") int idNum){
        return memberService.findMemberById(idNum);
    }
    @RequestMapping(value = "/{idNum}",method = RequestMethod.POST)
    public  String updateMember(@PathVariable("idNum")int idNum ,
                                @RequestParam(value = "name",required = true)String name,
                                @RequestParam(value = "gender",required = true)int gender,
                                @RequestParam(value = "birthday", required = true) String birthday,
                                @RequestParam(value = "nativePlace", required = true) String nativePlace,
                                @RequestParam(value = "nation", required = true) String nation,
                                @RequestParam(value = "idCardNum", required = true) String idCardNum,
                                @RequestParam(value = "admissionTime", required = true) String admissionTime,
                                @RequestParam(value = "educationBackground", required = true) String educationBackground,
                                @RequestParam(value = "startTime", required = true) String startTime){
        Member member=new Member();
        member.setName(name);
        member.setIdNum(idNum);
        member.setAdmissionTime(admissionTime);
        member.setBirthday(birthday);
        member.setEducationBackground(educationBackground);
        member.setGender(gender);
        member.setIdCardNum(idCardNum);
        member.setNation(nation);
        member.setNativePlace(nativePlace);
        member.setStartTime(startTime);
        int t=memberService.update(member);
        if(t==1){
            return member.toString();
        }else {
            return "fail";
        }
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public  String postMember( @RequestParam(value = "idNum",required = true)int idNum ,
                                @RequestParam(value = "name",required = true)String name,
                                @RequestParam(value = "gender",required = true)int gender,
                                @RequestParam(value = "birthday", required = true) String birthday,
                                @RequestParam(value = "nativePlace", required = true) String nativePlace,
                                @RequestParam(value = "nation", required = true) String nation,
                                @RequestParam(value = "idCardNum", required = true) String idCardNum,
                                @RequestParam(value = "admissionTime", required = true) String admissionTime,
                                @RequestParam(value = "educationBackground", required = true) String educationBackground,
                                @RequestParam(value = "startTime", required = true) String startTime){
        Member member=new Member();
        member.setName(name);
        member.setIdNum(idNum);
        member.setAdmissionTime(admissionTime);
        member.setBirthday(birthday);
        member.setEducationBackground(educationBackground);
        member.setGender(gender);
        member.setIdCardNum(idCardNum);
        member.setNation(nation);
        member.setNativePlace(nativePlace);
        member.setStartTime(startTime);
        int t=memberService.add(member);
        if(t==1){
            return member.toString();
        }else {
            return "fail";
        }

    }

}
