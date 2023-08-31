package com.poseidon.web.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.poseidon.web.Member;

public interface MemberRepository extends Repository<Member, Long> {

	

	List<Member> findAll();

	void save(Member member);

	List<Member> findTop5ByOrderByMnoDesc();

	

	
}
