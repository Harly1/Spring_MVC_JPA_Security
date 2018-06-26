package example.controller;

import example.model.User;
import example.service_abstract.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;
import javax.validation.Valid;
import java.util.List;

@Controller
public class SimpleController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = { "delete-{id}-user"}, method = RequestMethod.GET)
    public String userEdit( @PathVariable("id") Long id ) {
        User user = userService.getUserById(id);
        userService.removeUser(user);

        return "redirect:/list";
    }

    @RequestMapping(value = { "/edit-{id}-user"}, method = RequestMethod.GET)
    public String userEdit(ModelMap model,
                           @PathVariable("id") Long id) {

        model.addAttribute("user",userService.getUserById(id));

        return "userEdit";
    }
    @RequestMapping(value = { "/edit-{id}-user"}, method = RequestMethod.POST)
    public String userSave( User user) {

        userService.updateUser(user);

        return "redirect:/list";
    }

    @RequestMapping(value = { "/add"}, method = RequestMethod.GET)
    public String userAdd() { return "userAdd"; }

    @RequestMapping(value = { "/add"}, method = RequestMethod.POST)
    public String userAddDone(@Valid User user   ) {

        userService.addUser(user);

        return "redirect:/list";
    }

    @RequestMapping(value = { "/","/list"}, method = RequestMethod.GET)
    public String usersList(ModelMap model) {

        List<User> userList = userService.getAllUsers();
        model.addAttribute("list",userList);

        return "main";
    }
}
