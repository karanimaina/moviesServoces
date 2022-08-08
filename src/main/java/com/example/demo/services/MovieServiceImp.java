//package com.example.demo.services;
//
//import com.example.demo.model.*;
//import com.example.demo.repostory.*;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class MovieServiceImp implements MovieInterface {
//    private final ActorRepository actorRepository;
//    private final  AddressRepository addressRepository;
//    private final CategoryRepository categoryRepository;
//    private final CityRepository cityRepository;
//    private final CountryRepository countryRepository;
//    private final CustomerRepository customerRepository;
//    private final FilmRepository filmRepository;
//    private final FilmActorRepository filmActorRepository;
//    private final FilmCategoryRepository filmCategoryRepository;
//    private final InventoryRepository inventoryRepository;
//    private final LanguageRepository languageRepository;
//    private final PaymentRepository paymentRepository;
//    private final RentalRepository rentalRepository;
//    private final StaffRepository staffRepository;
//    private final StoreRepository storeRepository;
//
//    @Override
//    public List<Actor> getAllActors() {
//        return actorRepository.findAll();
//    }
//
//    @Override
//    public Optional<Actor> findActorById(Integer id) {
//        return actorRepository.findById(id);
//    }
//
//    @Override
//    public Actor addActor(Actor actor) {
//        return actorRepository.save(actor);
//    }
//
//    @Override
//    public void deleteActorById(Integer id) {
//        actorRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllActors() {
//        actorRepository.deleteAll();
//    }
//
//    @Override
//    public List<Address> getAllAddress() {
//        return addressRepository.findAll();
//    }
//
//    @Override
//    public Address addAddress(Address address) {
//        return addressRepository.save(address);
//    }
//
//    @Override
//    public Optional<Address> findAddressById(Integer id) {
//        return addressRepository.findById(id);
//    }
//
//    @Override
//    public void deleteAddressById(Integer id) {
//        addressRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllAddress() {
//        addressRepository.deleteAll();
//    }
//
//    @Override
//    public List<Category> getAllCategories() {
//        return categoryRepository.findAll();
//    }
//
//    @Override
//    public Category addCategory(Category category) {
//        return categoryRepository.save(category);
//    }
//
//    @Override
//    public Optional<Category> findCategoryById(Integer id) {
//        return categoryRepository.findById(id);
//    }
//
//    @Override
//    public void deleteCategoryById(Integer id) {
//        categoryRepository.findById(id);
//    }
//
//    @Override
//    public void deleteAllCategory() {
//        categoryRepository.deleteAll();
//    }
//
//    @Override
//    public List<City> getAllCity() {
//        return cityRepository.findAll();
//    }
//
//    @Override
//    public City addCity(City city) {
//        return cityRepository.save(city);
//    }
//
//    @Override
//    public Optional<City> findCityById(Integer id) {
//        return cityRepository.findById(id);
//    }
//
//    @Override
//    public void deleteCityById(Integer id) {
//        cityRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllCity() {
//        cityRepository.deleteAll();
//    }
//
//    @Override
//    public List<Country> getAllCountries() {
//        return countryRepository.findAll();
//    }
//
//    @Override
//    public Country country(Country country) {
//        return countryRepository.save(country);
//    }
//
//    @Override
//    public Optional<Country> findCountryById(Integer id) {
//        return countryRepository.findById(id);
//    }
//
//    @Override
//    public void deleteCountryById(Integer id) {
//        countryRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllCountry() {
//        countryRepository.deleteAll();
//    }
//
//    @Override
//    public List<Customer> getAllCustomer() {
//        return customerRepository.findAll();
//    }
//
//    @Override
//    public Customer addCustomer(Customer customer) {
//        return customerRepository.save(customer);
//    }
//
//    @Override
//    public Optional<Customer> findCustomerById(Integer id) {
//        return customerRepository.findById(id);
//    }
//
//    @Override
//    public void deleteCustomerById(Integer id) {
//        customerRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllCustomer() {
//        customerRepository.deleteAll();
//    }
//    @Override
//    public List<Film> getAllFilm() {
//        return filmRepository.findAll();
//    }
//
//    @Override
//    public Film addFilm(Film film) {
//        return filmRepository.save(film);
//    }
//
//    @Override
//    public Optional<Film> findFilmById(Integer id) {
//        return filmRepository.findById(id);
//    }
//
//    @Override
//    public void deleteFilmById(Integer id) {
//        filmRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllFilm() {
//        filmRepository.deleteAll();
//    }
//
//    @Override
//    public List<FilmCategory> getAllFilmCategory() {
//        return filmCategoryRepository.findAll();
//    }
//
//    @Override
//    public FilmCategory addFilmCategory(FilmCategory filmCategory) {
//        return filmCategoryRepository.save(filmCategory);
//    }
//
//    @Override
//    public Optional<FilmCategory> findFilmCategoryById(Integer id) {
//        return filmCategoryRepository.findById(id);
//    }
//
//    @Override
//    public void deleteFilmCategoryById(Integer id) {
//        filmCategoryRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllFilmCategory() {
//        filmCategoryRepository.deleteAll();
//    }
//
//    @Override
//    public List<Inventory> getAllInventory() {
//        return inventoryRepository.findAll();
//    }
//
//    @Override
//    public Inventory addInventory(Inventory inventory) {
//        return inventoryRepository.save(inventory);
//    }
//
//    @Override
//    public Optional<Inventory> findFilmInventoryById(Integer id) {
//        return inventoryRepository.findById(id);
//    }
//
//    @Override
//    public void deleteInventoryById(Integer id) {
//        inventoryRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllInventory() {
//        inventoryRepository.deleteAll();
//    }
//
//    @Override
//    public List<Language> getAllLanguage() {
//        return languageRepository.findAll();
//    }
//
//    @Override
//    public Optional<Language> findLanguageById(Integer id) {
//        return languageRepository.findById(id);
//    }
//
//    @Override
//    public Language addLanguage(Language language) {
//        return languageRepository.save(language);
//    }
//
//    @Override
//    public void deleteLanguageById(Integer id) {
//        languageRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllLanguage() {
//        languageRepository.deleteAll();
//    }
//
//    @Override
//    public List<Rental> getAllRental() {
//        return rentalRepository.findAll();
//    }
//
//    @Override
//    public Rental addRental(Rental rental) {
//        return rentalRepository.save(rental);
//    }
//
//    @Override
//    public Optional<Rental> findRentalById(Integer id) {
//        return rentalRepository.findById(id);
//    }
//
//    @Override
//    public void deleteRentalById(Integer id) {
//        rentalRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllRental() {
//        rentalRepository.deleteAll();
//    }
//
//    @Override
//    public List<Payment> getAllPayment() {
//        return paymentRepository.findAll();
//    }
//
//    @Override
//    public Payment addPayment(Payment payment) {
//        return paymentRepository.save(payment);
//    }
//
//    @Override
//    public Optional<Payment> findPaymentById(Integer id) {
//        return paymentRepository.findById(id);
//    }
//
//    @Override
//    public void deletePaymentById(Integer id) {
//        paymentRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllPayment() {
//        paymentRepository.deleteAll();
//    }
//
//    @Override
//    public List<Staff> getAllStaff() {
//        return staffRepository.findAll();
//    }
//
//    @Override
//    public Staff staff(Staff staff) {
//        return staffRepository.save(staff);
//    }
//
//    @Override
//    public Optional<Staff> findStaffById(Integer id) {
//        return staffRepository.findById(id);
//    }
//
//    @Override
//    public void deleteStaffById(Integer id) {
//        staffRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllStaff() {
//        staffRepository.deleteAll();
//    }
//
//    @Override
//    public List<Store> getAllStore() {
//        return storeRepository.findAll();
//    }
//
//    @Override
//    public Store addStore(Store store) {
//        return storeRepository.save(store);
//    }
//
//    public Optional<Store> findStoreById(Integer id) {
//        return storeRepository.findById(id);
//    }
//
//    @Override
//    public void deleteStoreById(Integer id) {
//        storeRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllStore() {
//        storeRepository.deleteAll();
//
//    }
//
//    @Override
//    public List<FilmActor> getAllFilmActor() {
//        return filmActorRepository.findAll();
//    }
//
//    @Override
//    public FilmActor addFilmActor(FilmActor filmActor) {
//        return filmActorRepository.save(filmActor);
//    }
//
//    @Override
//    public Optional<FilmActor> findFilmActorById(Integer id) {
//        return filmActorRepository.findById(id);
//    }
//
//    @Override
//    public void deleteFilmActorById(Integer id) {
//        filmActorRepository.deleteById(id);
//    }
//
//    @Override
//    public void deleteAllFilmActor() {
//        filmActorRepository.deleteAll();
//    }
//    @Override
//    public Country addCountry(Country country) {
//        return countryRepository.save(country);
//    }
//    @Override
//    public Staff addStaff(Staff staff) {
//        return staffRepository.save(staff);
//    }
//}
