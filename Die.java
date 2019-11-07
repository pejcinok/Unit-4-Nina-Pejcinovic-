public class Die {

    private int face;

    public Die (){
        face = 1;
    }

    public void roll(){
        face = (int) (Math.random() *6 +1);
    }

    public int getFace(){
        return face;
    }
    public String toString() {
        String result = "the face: ";
        result += face;
        return result;
    }

}
