package com.photoboard.dto;

public class MemberDto {

    private String memberName;
    private String memberId;
    private String memberPwd;

    public MemberDto(String memberName, String memberId, String memberPwd) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.memberPwd = memberPwd;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberPwd() {
        return memberPwd;
    }
}
