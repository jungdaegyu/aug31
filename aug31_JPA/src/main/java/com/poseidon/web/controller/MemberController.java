package com.poseidon.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.poseidon.web.Member;
import com.poseidon.web.repository.MemberRepository;

@Controller
public class MemberController {
   
   @Autowired
   private MemberRepository memberRepository;
   

   @GetMapping("/members")
   public String members(Model model) {
         
      List<Member> list = memberRepository.findTop5ByOrderByMnoDesc();
      
      //적어볼까요?
      /*    findAll()   전체 가져오기
      *    findOne()   하나 가져오기
       *    save()      저장하기 / 수정하기
       *    count()      
       *    delete()   
       * 
       */
      model.addAttribute("list", list);
      return "members";
   }
}