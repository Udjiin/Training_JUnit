package Training;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticsTest {

    @org.junit.jupiter.api.Test
    void add() {

        Arithmetics arithmetics=new Arithmetics();
        double res=arithmetics.add(3,7);
        if(res!=10) Assertions.fail();
    }

    @org.junit.jupiter.api.Test
    void min() {
        Arithmetics arithmetics=new Arithmetics();
        double res=arithmetics.min(7,3);
        if (res!=4)Assertions.fail("failure");
    }

    @org.junit.jupiter.api.Test
    void mult() {
        Arithmetics arithmetics=new Arithmetics();
        double res=arithmetics.mult(7,3);
        if (res!=21)Assertions.fail("failure");
    }

    @org.junit.jupiter.api.Test
    void div() {
        Arithmetics arithmetics=new Arithmetics();
        double res=arithmetics.div(21,3);
        if (res!=7)Assertions.fail("failure");
    }
}