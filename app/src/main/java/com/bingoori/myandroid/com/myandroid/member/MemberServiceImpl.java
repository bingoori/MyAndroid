package com.bingoori.myandroid.com.myandroid.member;

import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * Created by USER on 2016-04-28.
 */
public class MemberServiceImpl extends AppCompatActivity implements MemberService {
   private MemberDAO dao;

    @Override
    public void login(MemberDTO member) {
        dao = new MemberDAO(this.getApplicationContext());
        dao.login(member);
    }

    @Override
    public void addMember(MemberDTO member) {
       dao = new MemberDAO(this.getApplicationContext());
        dao.insertMember(member);
    }

    @Override
    public List<MemberDTO> findMember() {
        dao = new MemberDAO(this.getApplicationContext());
        return null;
    }

    @Override
    public List<MemberDTO> findMemberByName(MemberDTO member) {
        dao = new MemberDAO(this.getApplicationContext());
        return null;
    }

    @Override
    public MemberDTO findMemberById(MemberDTO member) {
        dao = new MemberDAO(this.getApplicationContext());
        return null;
    }

    @Override
    public int count() {
        dao = new MemberDAO(this.getApplicationContext());
        return 0;
    }

    @Override
    public void updateMember(MemberDTO member) {
        dao = new MemberDAO(this.getApplicationContext());
    }

    @Override
    public void remove(MemberDTO member) {
        dao = new MemberDAO(this.getApplicationContext());

    }
}
