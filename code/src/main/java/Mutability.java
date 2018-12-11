public class Mutability {

    class Pojo {
        private Integer counter;

        Integer getCounter() { return counter; }
        void setCounter(Integer counter) { this.counter = counter; }
    }

    void main() {
        Pojo pojo = new Pojo();
        pojo.setCounter(123);

        doSomething(pojo);

        // contents of POJO not clear here
        Integer unclear = pojo.getCounter();
    }

    void doSomething(Pojo pojo) {
        // ...
        pojo.setCounter(pojo.getCounter() + 1);
        // ...
    }

}
