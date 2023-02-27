class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String whoAmI(){
        return "Je m'appelle "+ this.getFirstname() + " et je " + (this.isAware() ? "suis aware" : "ne suis pas aware");
    }


    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }



}