package com.example.banking.controllers;


import com.example.banking.models.Admin;
import com.example.banking.models.Users1;
import com.example.banking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    public Admin admin;

    @GetMapping("/")
    public String main(Model model){
        return "main";
    }
    @GetMapping("/sign-in")
    public String SignIn(Model model){
        return "sign-in";
    }

    @PostMapping("sign-in")
    public String Log(@RequestParam String email, @RequestParam String password ,Model model){
        Iterable<Users1> users1s = userRepository.findAll();
        if(users1s.spliterator().equals(email)){
            Class<? extends String> u1 = email.getClass();
            
        }

        //Users1 users1 = new Users1(users1s.getClass().getName(), email, password);
        //Iterable<Users1> u = userRepository.findAll();
        //if(users1s.forEach() &&)
        /*if(Objects.equals(email, admin.getEmail()) && Objects.equals(password, admin.getPassword()))
            return "redirect:/home";*/

        return "redirect:/home";
    }

    @GetMapping("/sign-up")
    public String SignUp(Model model){
        return "sign-up";
    }
    @PostMapping("/sign-up")
    public String SignUpPost(@RequestParam String name, @RequestParam String email, @RequestParam String password, Model model){
        Users1 users1 = new Users1(name, email, password);
        userRepository.save(users1);

        return "redirect:/sign-in";
    }
    @GetMapping("/home")
    public String HomePage(Model model){
        return "home";
    }

   /* @GetMapping("/admin")
    public String HomePage(Model model){
        Iterable<Users1> user1 = userRepository.findAll();
        model.addAttribute("user1", user1);
        return "admin";
    }*/



}
