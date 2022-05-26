/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedro.ieslaencanta.com.listados.model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;


/**
 *
 * @author Pedro
 */
public class Principal {

   // private HashMap<Integer, Category> categorias;
     private ObservableList<Category> categorias;

    private static Principal instance;
    static{
        instance=null;
    }
    private Principal() {
         this.categorias = FXCollections.observableArrayList();
       
       // this.categorias = new HashMap<>();
    }
    public static Principal getInstance(){
        if(instance==null){
            instance= new Principal();
            instance.init();
        }
        return instance;
            
    }
    private void init() {
        Category c;
        Product p;
        c = new Category();
        c.setId(1);
        c.setName("Cloro");
        this.addCategory(c);
        p= new Product();
        
        p.setDescription("A ver si lo borra");
        p.setMinstock(1);
        p.setStock(4);
        p.setPrice(4.5d);
        c.addProduct(p);
        
        
        c = new Category();
        c.setId(2);
        c.setName("Filtros");
        this.addCategory(c);

        c = new Category();
        c.setId(3);
        c.setName("Piedra artificial");
        this.addCategory(c);
        c= new Category();
        c.setId(4);
        c.setName("Anti algas");
       this.addCategory(c);
          
    }

    public ObservableList<Category> getCategorys() {
        return this.categorias;
    }

    public void addCategory(Category c) {
        if(c.getId()==-1)
            c.setId(this.getNextId());
        this.categorias.add(c);
        System.out.println(this.categorias.size());
    }
    public Category removeCategory(Category c){
        return this.categorias.remove(c.getId());
    }
    public boolean removeCategory(Integer id){
        return this.categorias.removeIf(e-> e.getId()==id);
    }
    public Category getCategory(Integer id) {
        return this.categorias.get(id);
    }

   

   

    
    private Integer getNextId(){
       Optional<Category> o= this.categorias.stream().max(
               (a,b)->{ 
                   return a.getId()-b.getId();
                   }
       );
       if(o.isPresent())
           return o.get().getId()+1;
       else
           return 1;
               
   }

}
