package com.bingoori.myandroid.com.myandroid.member;

import java.util.List;

/**
 * Created by USER on 2016-04-28.
 */
public interface MemberService {
    public void addMember(MemberDTO member);
    public List<MemberDTO> findMember();
    public List<MemberDTO> findMemberByName(MemberDTO member);
    public MemberDTO findMemberById(MemberDTO member);
    public int count();
    public void updateMember(MemberDTO member);
    public void remove(MemberDTO member);
    public void login(MemberDTO member);
}
