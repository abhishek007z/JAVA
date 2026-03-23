package OOPs;

class Students{
    String name;
    private int roll_number;
    double cgpa;
    private void print(){
        System.out.println(name + " " + cgpa + " " + roll_number + " ");
    }
    int getRoll_number(){  //getter
        return roll_number;
    }
    void setRoll_number(int x){ //setter
        roll_number = x;
    }
    public void p(){
        print();
    }
}

public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.p();
        s1.cgpa = 8.95;
        s1.name = "Rohit"; 
        s1.p();
        s1.setRoll_number(11);
        System.out.println(s1.getRoll_number());
    }
}


// the accessing of the private data by making it public function and accessing in another function is known as the encapsulation. It is also known as hidding the data as the all data is present in a private function.
