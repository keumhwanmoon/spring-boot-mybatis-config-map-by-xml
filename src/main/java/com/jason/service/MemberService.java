package com.jason.service;

import com.jason.domain.Member;
import com.jason.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jason, Moon
 * @since 2016. 9. 7.
 */
@Service
public class MemberService {

    @Autowired
    MemberMapper memberMapper;

    public List<Member> findMembers() {
        return memberMapper.findMembers();
    }
}
