class Parent {
    void message() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    @Override
    void message() {
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.message();  // calls overridden method
    }
}

