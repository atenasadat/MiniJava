package codegenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

interface function {
    public String toString();
}

public class Address implements function{
    public int num;
    public TypeAddress Type;
    public VarType varType;

    public Address(int num, VarType varType, TypeAddress Type) {
        this.num = num;
        this.Type = Type;
        this.varType = varType;
    }

    public Address(int num, VarType varType) {
        this.num = num;
        this.Type = TypeAddress.Direct;
        this.varType = varType;
    }

//    public String toString(){
//       return this.toString();
//
//    }
}


class Direct extends Address implements function{


    public Direct(int num, VarType varType) {
        super(num, varType);
    }
    @Override
    public String toString() {
        return this.num+"";
    }
}


class Indirect extends Address implements function{


    public Indirect(int num, VarType varType) {
        super(num, varType);
    }

    @Override
    public String toString() {
        return "@"+ this.num;
    }
}


class Imidiate extends Address implements function{


    public Imidiate(int num, VarType varType) {
        super(num, varType);
    }

    @Override
    public String toString() {
        return "#"+  this.num;
    }
}