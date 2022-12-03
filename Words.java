public enum Words {
    Cat("кошка",0), Dog("собака",0);

    private String translation;
    Words(String translation, int CountOfTry){
        this.translation = translation;
    }

    public String getTranslation(){
        return translation;
    }
public String toString(){
        return translation;
}
}

