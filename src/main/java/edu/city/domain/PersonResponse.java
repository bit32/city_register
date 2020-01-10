package edu.city.domain;

/**
 * Created by ВАСЯ on 09.01.2020.
 */
//ответ
 //1поле что он зарегестрирован
// и поле 2 временно или постоянно
public class PersonResponse {
    private boolean registered;
    private boolean temporal;

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public boolean isTemporal() {
        return temporal;
    }

    public void setTemporal(boolean temporal) {
        this.temporal = temporal;
    }
}
