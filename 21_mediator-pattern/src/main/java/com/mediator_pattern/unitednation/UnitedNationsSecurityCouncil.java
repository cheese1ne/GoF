package com.mediator_pattern.unitednation;

import com.mediator_pattern.unitednation.country.Iraq;
import com.mediator_pattern.unitednation.country.USA;

/**
 * 联合国安理会
 *
 * @author sobann
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {

    private USA countryUsa;
    private Iraq countryIraq;

    public void setCountryUsa(USA countryUsa) {
        this.countryUsa = countryUsa;
    }

    public void setCountryIraq(Iraq countryIraq) {
        this.countryIraq = countryIraq;
    }

    @Override
    public void declare(String message, Country country) {
        if (country == this.countryUsa) {
            this.countryIraq.getMessage(message);
        } else if (country == this.countryIraq){
            this.countryUsa.getMessage(message);
        }
    }
}
