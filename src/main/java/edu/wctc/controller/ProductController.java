package edu.wctc.controller;

import edu.wctc.entity.Product;
import edu.wctc.entity.ProductDetail;
import edu.wctc.service.CategoryService;
import edu.wctc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService ProductService;

    @Autowired
    private CategoryService CategoryService;

    @RequestMapping("/showAddProductForm")
    public String showAddProductForm(Model theModel)
    {
        Product theProduct = new Product();

        theModel.addAttribute("aProduct", theProduct);

        theModel.addAttribute("Categories", CategoryService.getCategories());

        return "product-form";
    }


    @GetMapping("/showUpdateProductForm")
    public String showUpdateProductForm(@RequestParam("productid") @ModelAttribute("product") int theid, Model theModel)
    {
        Product theProduct = ProductService.getProduct(theid);

        theModel.addAttribute("aProduct", theProduct);

        theModel.addAttribute("Categories", CategoryService.getCategories());

        return "product-form";

    }


    @RequestMapping("/list")
    public String listProducts(Model theModel)
    {
        List<Product> productList = ProductService.getProducts();

        theModel.addAttribute("product", productList);

        return "list";
    }


    @GetMapping("/search")
    public String search(@RequestParam String theSearchTerm, Model theModel)
    {
        List<Product> matchingProducts = ProductService.getProductsByName(theSearchTerm);

        theModel.addAttribute("product", matchingProducts);

        return "list";

    }



    @GetMapping("/delete")
    public String deleteProduct(
            @RequestParam("productid") int theId) {
        ProductService.deleteProduct(theId);

        return "redirect:/product/list";

    }

    @PostMapping("/save")
    public String saveProduct(@Valid @ModelAttribute("aProduct") Product theProduct, BindingResult bindingResult, Model theModel)
    {
        if(bindingResult.hasErrors())
        {
            theModel.addAttribute("Categories", CategoryService.getCategories());
            return "product-form";
        }

        ProductService.saveProduct(theProduct);

        return "redirect:/product/list";
    }





}
