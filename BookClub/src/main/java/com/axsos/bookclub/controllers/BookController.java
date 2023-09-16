package com.axsos.bookclub.controllers;


import com.axsos.bookclub.models.Book;
import com.axsos.bookclub.models.User;
import com.axsos.bookclub.services.BookService;
import com.axsos.bookclub.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {
    private final BookService bookService;
    private final UserService userService;

    public BookController(BookService bookService, UserService userService) {
        this.bookService = bookService;
        this.userService = userService;
    }

    @GetMapping("/books")
    public String books(Model model, HttpSession session){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            List<Book> books = bookService.allBooks();
            model.addAttribute("books", books);

            return "success.jsp";
        }
        return "redirect:/";
    }

    @GetMapping("/books/new")
    public String bookForm(@ModelAttribute("book") Book book, Model model, HttpSession session){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            model.addAttribute("book", book);

            return "addBook.jsp";
        }
        return "redirect:/";
    }

    @PostMapping("/addBook")
    public String addBook(@Valid @ModelAttribute("book") Book book, Model model, HttpSession session, BindingResult result){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

           if(result.hasErrors()){
               return "addBook.jsp";
           }else {
               bookService.createBook(book);
               return "redirect:/books";
           }
        }
        return "redirect:/";
    }

    @GetMapping("/books/{id}")
    public String bookInfo(@PathVariable("id") Long id, Model model, HttpSession session){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            Book book = bookService.findBook(id);
            model.addAttribute("book", book);

            return "info.jsp";
        }
        return "redirect:/";
    }

    @GetMapping("/books/{id}/edit")
    public String editBookForm(@ModelAttribute("book") Book book, @PathVariable("id") Long id,Model model, HttpSession session){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            Book bookId = bookService.findBook(id);
            model.addAttribute("book", bookId);

            return "editBook.jsp";
        }
        return "redirect:/";
    }

    @PostMapping("/editBook/{id}")
    public String editBook(@Valid @ModelAttribute("book") Book book, Model model, HttpSession session, BindingResult result){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            if(result.hasErrors()){
                return "editBook.jsp";
            }else {
                bookService.updateBook(book);
                return "redirect:/books/{id}";
            }
        }
        return "redirect:/";
    }

    @GetMapping("/books/{id}/delete")
    public String deleteBook(@ModelAttribute("book") Book book, @PathVariable("id") Long id,Model model, HttpSession session){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            bookService.deleteBook(id);

            return "redirect:/books";
        }
        return "redirect:/";
    }
}
