package me.thijmenl98.model;

import java.util.LinkedHashMap;
import java.util.Objects;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: Student</h5>
 * <h5>Package: me.thijmenl98.model</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-29
 **/
public class Student {

    private String firstName;
    private String lastName;
    private String continent;
    private String favouriteLanguage;
    private String[] operatingSystems;

    private final LinkedHashMap<String, String> continentOptions, languageOptions, operatingSystemOptions;

    public Student() {
        continentOptions = new LinkedHashMap<>();
        continentOptions.put("Africa", "Africa");
        continentOptions.put("Antarctica", "Antarctica");
        continentOptions.put("Asia", "Asia");
        continentOptions.put("Europe", "Europe");
        continentOptions.put("North America", "North America");
        continentOptions.put("Oceania", "Oceania");
        continentOptions.put("South America", "South America");

        languageOptions = new LinkedHashMap<>();
        languageOptions.put("Java", "Java");
        languageOptions.put("C#", "C#");
        languageOptions.put("C++", "C++");
        languageOptions.put("Python", "Python");
        languageOptions.put("Ruby", "Ruby");
        languageOptions.put("Pascal", "Pascal");
        languageOptions.put("PHP", "PHP");

        operatingSystemOptions = new LinkedHashMap<>();
        operatingSystemOptions.put("Linux", "Linux");
        operatingSystemOptions.put("MS Windows", "MS Windows");
        operatingSystemOptions.put("Mac OSX", "Mac OSX");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public LinkedHashMap<String, String> getContinentOptions() {
        return continentOptions;
    }

    public LinkedHashMap<String, String> getLanguageOptions() {
        return languageOptions;
    }

    public LinkedHashMap<String, String> getOperatingSystemOptions() {
        return operatingSystemOptions;
    }
}
