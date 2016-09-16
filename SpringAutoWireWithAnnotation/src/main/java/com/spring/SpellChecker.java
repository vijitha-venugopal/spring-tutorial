package com.spring;

import org.springframework.stereotype.Service;

@Service("spellChecker")
public class SpellChecker {
   public SpellChecker(){
      System.out.println("Inside SpellChecker constructor." );
   }

   public void checkSpelling(){
      System.out.println("Inside checkSpelling." );
   }
   
}