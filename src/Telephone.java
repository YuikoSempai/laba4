package src;

import src.absClass.Thing;

public class Telephone extends Thing {

    public Telephone(String name, Location loc) {
        this.name = name;
        this.location = loc;
    }

    public void call(String number) throws InvalidPhoneNumberException {

        class PhoneNumber {
            String phoneNumber = null;

            public PhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
                String currentNumber = phoneNumber.replaceAll("[^0-9]", "");
                if (currentNumber.length() == 11) {
                    this.phoneNumber = currentNumber;
                } else {
                    throw new InvalidPhoneNumberException("invalid phone number");
                }
            }

            public String getNumber() {
                return phoneNumber;
            }
        }
        PhoneNumber phoneNumber = new PhoneNumber(number);
        System.out.println("звонок абоненту +" + phoneNumber.getNumber());
    }

    private String countryCode = "+7";

    private void printCountryCode() {
        System.out.println(countryCode);
    }
}
