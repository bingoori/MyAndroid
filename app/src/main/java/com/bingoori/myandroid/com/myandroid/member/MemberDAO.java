package com.bingoori.myandroid.com.myandroid.member;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.bingoori.myandroid.com.myandroid.global.Constant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 2016-04-27.
 */
public class MemberDAO extends SQLiteOpenHelper {

         Context context = null;
        //private static DBManager mdbManager = null;
        private SQLiteDatabase database  = null;

    public MemberDAO(Context context) {
                     super(context, Constant.D, null, Constant.DB_VERSION);
                }
//데이터베이스 종류와 버전이 변경되면 실행하여 종류 변경 및 버전업 한다.
    @Override
    public void onCreate(SQLiteDatabase db) {
        // 새로운 테이블 생성
                 /* 이름은 MONEYBOOK이고, 자동으로 값이 증가하는 _id 정수형 기본키 컬럼과
         item 문자열 컬럼, price 정수형 컬럼, create_at 문자열 컬럼으로 구성된 테이블을 생성. */
                    db.execSQL("CREATE TABLE IF NOT EXISTS Member"
                            + "("
                            + "uId TEXT , "
                            + "password TEXT , "
                            + "name TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
     db.execSQL("DROP TABLE IF EXIST Member");
        db.close();
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }
    public void insert(MemberDTO member) {
                     // 읽고 쓰기가 가능하게 DB 열기
                     SQLiteDatabase db = this.getWritableDatabase();
                     // DB에 입력한 값으로 행 추가
                    db.execSQL("INSERT INTO Member VALUES('" + member.getUid() + "', " + member.getPassword() + ", '" + member.getName() + "');");
                    db.close();
                 }
             public void update(MemberDTO member) {
                     SQLiteDatabase db = this.getWritableDatabase();
                     // 입력한 항목과 일치하는 행의 가격 정보 수정
                    db.execSQL("UPDATE Member SET password=" +  member.getPassword() + " WHERE uid='" +  member.getName()  + "';");
                    db.close();
                 }


                    public void delete(MemberDTO member) {
                        SQLiteDatabase db = this.getWritableDatabase();
                     // 입력한 항목과 일치하는 행 삭제
                     db.execSQL("DELETE FROM Member WHERE uid='" + member.getUid() + "';");
                    db.close();
                 }
    public List<MemberDTO> selectAll(){
        List<MemberDTO> memList = new ArrayList<MemberDTO>();

        return memList;
    }
    public void insertMember(MemberDTO member){
        SQLiteDatabase db = this.getWritableDatabase();
        // DB에 입력한 값으로 행 추가
        db.execSQL("INSERT INTO Member VALUES('" + member.getUid() + "', " + member.getPassword() + ", '" + member.getName() + "');");
        db.close();
    }
    public List<MemberDTO> findMemberById(MemberDTO member){
        List<MemberDTO> memList = new ArrayList<MemberDTO>();
        return  memList;
    }
    public List<MemberDTO> findMemberByName(MemberDTO member){
        List<MemberDTO> memList = new ArrayList<MemberDTO>();
        return  memList;
    }
    public int count(){

            return 0;
    }
    public void updateMember(MemberDTO member){
        SQLiteDatabase db = this.getWritableDatabase();
        // 입력한 항목과 일치하는 행의 가격 정보 수정
        db.execSQL("UPDATE Member SET password=" +  member.getPassword() + " WHERE uid='" +  member.getName()  + "';");
        db.close();
    }
    public void remove(MemberDTO member){
        SQLiteDatabase db = this.getWritableDatabase();
        // 입력한 항목과 일치하는 행 삭제
        db.execSQL("DELETE FROM Member WHERE uid='" + member.getUid() + "';");
        db.close();
    }
    public void login(MemberDTO member){
        SQLiteDatabase db = this.getWritableDatabase();
        // 입력한 항목과 일치하는 행 삭제
        db.execSQL("DELETE FROM Member WHERE uid='" + member.getUid() + "';");
        db.close();
    }

                     public String getResult() {
                     // 읽기가 가능하게 DB 열기
                     SQLiteDatabase db = this.getReadableDatabase();
                     String result = "";
                     // DB에 있는 데이터를 쉽게 처리하기 위해 Cursor를 사용하여 테이블에 있는 모든 데이터 출력
                     Cursor cursor = db.rawQuery("SELECT * FROM Member", null);
                     while (cursor.moveToNext()) {
                             result += cursor.getString(0)
                                    + " , "
                                     + cursor.getString(1)
                                    + " , "
                                    + cursor.getString(2)
                                     + "\n";
                        }
                     return result;
                }

}
