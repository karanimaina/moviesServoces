package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.services.MovieServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieServiceImp movieServiceImp;

    @GetMapping("/actors")
    public ResponseEntity<List<Actor>>getAllActors(){
     return ResponseEntity.ok(movieServiceImp.getAllActors());
    }
    @GetMapping("/actor/{id}")
    public ResponseEntity<Optional<Actor>>getActorById(@PathVariable("id") int id){
        return  ResponseEntity.ok(movieServiceImp.findActorById(id));
    }
    @PostMapping("actor/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Actor> addActor(@RequestBody Actor actor){
       return ResponseEntity.ok(movieServiceImp.addActor(actor));
    }
    @DeleteMapping("actor/delete/{id}")
    public void deleteActor(@PathVariable ("id")int id){
        movieServiceImp.deleteActorById(id);
    }
    @DeleteMapping("/actor/delete")
    public void  deleteAll(){
        movieServiceImp.deleteAllActors();
    }

    @GetMapping("/address")
    public ResponseEntity<List<Address>>getAllAddress(){
        return ResponseEntity.ok(movieServiceImp.getAllAddress());
    }
    @GetMapping("/address/{id}")
    public ResponseEntity<Optional<Address>>getAddressById(@PathVariable("id") int id){
        return  ResponseEntity.ok(movieServiceImp.findAddressById(id));
    }
    @PostMapping("address/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Address> addAddress(@RequestBody Address address){
        return ResponseEntity.ok(movieServiceImp.addAddress(address));
    }
    @DeleteMapping("address/delete/{id}")
    public void deleteAddress(@PathVariable ("id")int id){
        movieServiceImp.deleteAddressById(id);
    }

    @GetMapping("/category")
    public ResponseEntity<List<Category>>getAllCategories(){
        return ResponseEntity.ok(movieServiceImp.getAllCategories());
    }
    @GetMapping("/category/{id}")
    public ResponseEntity<Optional<Category>>getCategoryById(@PathVariable("id") int id){
        return  ResponseEntity.ok(movieServiceImp.findCategoryById(id));
    }
    @PostMapping("category/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Category> addCategory(@RequestBody Category category){
        return ResponseEntity.ok(movieServiceImp.addCategory(category));
    }
    @DeleteMapping("category/delete/{id}")
    public void deleteCategory(@PathVariable ("id")int id){
        movieServiceImp.deleteCategoryById(id);
    }

    @GetMapping("/actors")
    public ResponseEntity<List<City>>getAllCity(){
        return ResponseEntity.ok(movieServiceImp.getAllCity());
    }
    @GetMapping("/city/{id}")
    public ResponseEntity<Optional<City>>getCityById(@PathVariable("id") int id){
        return  ResponseEntity.ok(movieServiceImp.findCityById(id));
    }
    @PostMapping("city/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<City> addCity(@RequestBody City city){
        return ResponseEntity.ok(movieServiceImp.addCity(city));
    }
    @DeleteMapping("city/delete/{id}")
    public void deleteCity(@PathVariable ("id")int id){
        movieServiceImp.deleteCityById(id);
    }

    @GetMapping("/country")
    public ResponseEntity<List<Country>>getAllCountries(){
        return ResponseEntity.ok(movieServiceImp.getAllCountries());
    }
    @GetMapping("/countries/{id}")
    public ResponseEntity<Optional<Country>>getCountryById(@PathVariable("id") int id){
        return  ResponseEntity.ok(movieServiceImp.findCountryById(id));
    }
    @PostMapping("country/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Country> addCountry(@RequestBody Country country){
        return ResponseEntity.ok(movieServiceImp.addCountry(country));
    }
    @DeleteMapping("countries/delete/{id}")
    public void deleteCountries(@PathVariable ("id")int id){
        movieServiceImp.deleteCountryById(id);
    }
    @GetMapping("/customers")
    public ResponseEntity<List<Customer>>getAllCustomers(){
        return ResponseEntity.ok(movieServiceImp.getAllCustomer());
    }
    @PostMapping("customer/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Customer> addCustomers(@RequestBody Customer customer){
        return ResponseEntity.ok(movieServiceImp.addCustomer(customer));
    }
    @DeleteMapping("customer/delete/{id}")
    public void deleteCustomer(@PathVariable ("id")int id){
        movieServiceImp.deleteCustomerById(id);
    }
    @DeleteMapping("customer/deleteAll/")
    public  void deleteAllCustomers(){
     movieServiceImp.deleteAllCustomer();
    }
    @GetMapping("/film")
    public ResponseEntity<List<Film>>getAllFilms(){
        return ResponseEntity.ok(movieServiceImp.getAllFilm());
    }
    @GetMapping("/film/{id}")
    public ResponseEntity<Optional<Film>>getFilmById(@PathVariable("id") int id){
        return  ResponseEntity.ok(movieServiceImp.findFilmById(id));
    }
    @PostMapping("film/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Film> addFilm(@RequestBody Film film){
        return ResponseEntity.ok(movieServiceImp.addFilm(film));
    }
    @DeleteMapping("film/delete/{id}")
    public void deleteFilm(@PathVariable ("id")int id){
        movieServiceImp.deleteFilmById(id);
    }
    @GetMapping("/filmActors")
    public ResponseEntity<List<FilmActor>>getAllFilmActors(){
        return ResponseEntity.ok(movieServiceImp.getAllFilmActor());
    }
    @GetMapping("/filmactor/{id}")
    public ResponseEntity<Optional<FilmActor>>getFilmActorById(@PathVariable("id") int id){
        return  ResponseEntity.ok(movieServiceImp.findFilmActorById(id));
    }
    @PostMapping("filmactor/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<FilmActor> addActor(@RequestBody FilmActor actor){
        return ResponseEntity.ok(movieServiceImp.addFilmActor(actor));
    }
    @DeleteMapping("filmactor/delete/{id}")
    public void deleteFilmActor(@PathVariable ("id")int id){
        movieServiceImp.deleteFilmActorById(id);
    }
    @DeleteMapping("filmactor/delete}")
    public void deleteAllFilmActor(){
        movieServiceImp.deleteAllFilm();
    }

    @GetMapping("/filmcategory")
    public ResponseEntity<List<FilmCategory>>getAllFilmCategory(){
        return ResponseEntity.ok(movieServiceImp.getAllFilmCategory());
    }
    @GetMapping("/filmcategory/{id}")
    public ResponseEntity<Optional<FilmCategory>>getFilmCategoryById(@PathVariable("id") int id){
        return  ResponseEntity.ok(movieServiceImp.findFilmCategoryById(id));
    }
    @PostMapping("filmcategory/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<FilmCategory> addFilmCategory(@RequestBody  FilmCategory filmCategory){
        return ResponseEntity.ok(movieServiceImp.addFilmCategory(filmCategory)
        );
    }
    @PostMapping("filmcategory/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<FilmCategory> addActor(@RequestBody  FilmCategory filmCategory){
        return ResponseEntity.ok(movieServiceImp.addFilmCategory(filmCategory)
        );
    }
    @DeleteMapping("filmcategory/delete/{id}")
    public void deleteFilmCategory(@PathVariable ("id")int id){
        movieServiceImp.deleteFilmCategoryById(id);
    }
    @DeleteMapping("filmcategory/delete/")
    public void deleteFilmCategory(){
        movieServiceImp.deleteAllFilmCategory();
    }
    @GetMapping("/inventory")
    public ResponseEntity<List<Inventory>>getFilmInventory( ){

        return  ResponseEntity.ok(movieServiceImp.getAllInventory());
    }
// docker run --detach --name ec-mysql -p 8080:6604  -e_MYSQL_ROOT_PASSWORD=password -e_MYSQL_DATABASE=demo -e MYSQL_USER=felix -e MYSQL_PASSWORD = felixmaina -d mysql
    @GetMapping("/inventory/{id}")
    public ResponseEntity<Optional<Inventory>>getFilmInventoryById(@PathVariable("id") int id){
        return  ResponseEntity.ok(movieServiceImp.findFilmInventoryById(id));
    }
    @PostMapping("inventory/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Inventory> addInventory(@RequestBody  Inventory inventory){
        return ResponseEntity.ok(movieServiceImp.addInventory(inventory)
        );
    }
    @DeleteMapping("inventory/delete/{id}")
    public void deleteInventory(@PathVariable ("id")int id){
        movieServiceImp.deleteInventoryById(id);
    }
    @DeleteMapping("filmcategory/delete/")
    public void deleteInventoy(){
        movieServiceImp.deleteAllInventory();
    }



    @GetMapping("/store")
    public ResponseEntity<List<Store>>getAllStores(){
        return ResponseEntity.ok(movieServiceImp.getAllStore());
    }
    @GetMapping("/store/{id}")
    public ResponseEntity<Optional<Store>>getAStoreById(@PathVariable("id") int id){
        return  ResponseEntity.ok(movieServiceImp.findStoreById(id));
    }
    @PostMapping("store/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Store> addActor(@RequestBody Store store){
        return ResponseEntity.ok(movieServiceImp.addStore(store));
    }
    @DeleteMapping("store/delete/{id}")
    public void deleteStore(@PathVariable ("id")int id){
        movieServiceImp.deleteStoreById(id);
    }
    @DeleteMapping("/store/delete")
    public void  deleteAllStores(){
        movieServiceImp.deleteAllStore();
    }


    @GetMapping("/language")
    public ResponseEntity<List<Language>>getAllLanguage(){
        return ResponseEntity.ok(movieServiceImp.getAllLanguage());
    }
    @GetMapping("/language/{id}")
    public ResponseEntity<Optional<Language>>getLanguageById(@PathVariable("id") int id){
        return  ResponseEntity.ok(movieServiceImp.findLanguageById(id));
    }
    @PostMapping("language/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Language> addLanguage(@RequestBody Language language){
        return ResponseEntity.ok(movieServiceImp.addLanguage(language));
    }
    @DeleteMapping("language/delete/{id}")
    public void deleteLanguage(@PathVariable ("id")int id){
        movieServiceImp.deleteLanguageById(id);
    }
    @DeleteMapping("/language/delete")
    public void  deleteAllLanguage(){
        movieServiceImp.deleteAllLanguage();
    }

    @GetMapping("/payment")
    public ResponseEntity<List<Payment>>getAllPayment(){
        return ResponseEntity.ok(movieServiceImp.getAllPayment());
    }
    @GetMapping("/payment/{id}")
    public ResponseEntity<Optional<Payment>>getPaymentById(@PathVariable("id") int id){
        return  ResponseEntity.ok(movieServiceImp.findPaymentById(id));
    }
    @PostMapping("payment/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Payment> addPayment(@RequestBody Payment payment){
        return ResponseEntity.ok(movieServiceImp.addPayment(payment));
    }
    @DeleteMapping("payment/delete/{id}")
    public void deletePayment(@PathVariable ("id")int id){
        movieServiceImp.deletePaymentById(id);
    }
    @DeleteMapping("/payment/delete")
    public void  deleteAllPayment(){
        movieServiceImp.deleteAllPayment();
    }


    @GetMapping("/rental")
    public ResponseEntity<List<Rental>>getAllRental(){
        return ResponseEntity.ok(movieServiceImp.getAllRental());
    }
    @GetMapping("/rental/{id}")
    public ResponseEntity<Optional<Rental>>getRentalById(@PathVariable("id") int id){
        return  ResponseEntity.ok(movieServiceImp.findRentalById(id));
    }
    @PostMapping("rental/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Rental> addRental(@RequestBody Rental rental){
        return ResponseEntity.ok(movieServiceImp.addRental(rental));
    }
    @DeleteMapping("rental/delete/{id}")
    public void deleteRental(@PathVariable ("id")int id){
        movieServiceImp.deleteRentalById(id);
    }
    @DeleteMapping("/rental/delete")
    public void  deleteAllRental(){
        movieServiceImp.deleteAllRental();
    }

    @GetMapping("/staff")
    public ResponseEntity<List<Staff>>getAllStaff(){
        return ResponseEntity.ok(movieServiceImp.getAllStaff());
    }
    @GetMapping("/staff/{id}")
    public ResponseEntity<Optional<Staff>>getStaffById(@PathVariable("id") int id){
        return  ResponseEntity.ok(movieServiceImp.findStaffById(id));
    }
    @PostMapping("staff/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Staff> addStaff(@RequestBody Staff staff){
        return ResponseEntity.ok(movieServiceImp.addStaff(staff));
    }
    @DeleteMapping("staff/delete/{id}")
    public void deletetaff(@PathVariable ("id")int id){
        movieServiceImp.deleteStaffById(id);
    }
    @DeleteMapping("/staff/delete")
    public void  deleteAllStaff(){
        movieServiceImp.deleteAllStaff();
    }
}