package pages;

import lombok.Getter;

@Getter
public enum Beeline_PAGES {
    BEELINE_PAGE("http://beeline.kg"),
    LOGIN("/login"),
    DASHBOARD("/ru/dashboard"),
    TARIFFS("/ru/products/tariffs");
    public final String URL;

    Beeline_PAGES(String URL){
        this.URL = URL;
    }
}
