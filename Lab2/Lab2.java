package Lab2;

public class Lab2 {

    public static void main(String[] args) {

    }

    private class GenericTest<T> {
        private String name;
        private T value;

        public GenericTest(String name, T value){
            this.name = name;
            this.value = value;
        }

        @Override
        public String toString(){
            return String.format("name: value", name.toString(), value.toString());
        }
    }
}
