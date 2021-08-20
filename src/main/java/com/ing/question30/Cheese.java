package com.ing.question30;

public class Cheese {

    enum Name {
        STILTON(1),
        EZINE(2),
        ERZINCAN(3);

        private int id;

        public int getId() {
            return id;
        }

        Name(int id) {
            this.id = id;
        }
    }


    private Long id;
    private String name;

    public Cheese(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
