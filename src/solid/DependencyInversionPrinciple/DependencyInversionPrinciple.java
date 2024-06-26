package solid.DependencyInversionPrinciple;


class WiredKeyboard implements Keyboard{

}
class BluethootKeyboard implements Keyboard{

}

class WiredMouse implements Mouse{

}
class BluethootMouse implements Mouse{

}

class  Windows{
    private  final  BluethootKeyboard keyboard;
    private final  BluethootMouse mouse;
    public Windows(BluethootKeyboard keyboard,BluethootMouse mouse ) {
        this.keyboard=keyboard;
        this.mouse=mouse;
    }
}

class  Windows2{
    private final Keyboard keyboard;
    private final  Mouse mouse;


    public  Windows2(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}


public class DependencyInversionPrinciple {

    public static void main(String[] args) {
        Windows windows = new Windows( new BluethootKeyboard(), new BluethootMouse());

        Windows2 windows2 = new Windows2(new WiredKeyboard(), new WiredMouse());
        Windows2 windows3 = new Windows2(new BluethootKeyboard(), new WiredMouse());
        Windows2 windows4 = new Windows2(new WiredKeyboard(), new BluethootMouse());
    }
}
