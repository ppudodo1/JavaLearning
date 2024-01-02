public enum Gender {
    OCJENA_NEDOVOLJAN(1);
    Integer ocjena;
    Gender(Integer ocjena) {
        this.ocjena = ocjena;
    }

    public Integer getOcjena() {
        return ocjena;
    }

    public void setOcjena(Integer ocjena) {
        this.ocjena = ocjena;
    }
}
