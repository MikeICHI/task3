package Phone;


class Phone{
    private int number;
    private String model;
    private int weight;

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }



    Phone(){
//        this.number = 0;
//        this.model = "Unknown";
//        this.weight=0;
    }


    void getPhone(){
        System.out.println("number: "+number+" model: "+ model+" weight: "+weight);
    }

    void receiveCall(String name){
        System.out.println("Звонит: "+name );
    }
    //Принимает параметры звонящего и выводит
    void receiveCall(String name, int number){
        System.out.println("Звонит: "+name+" номер: "+number);
    }

    public int getNumber() {
        return number;
    }

    //Принимает массив строчных объектов в качестве параметра и выводит их
    void sendMessage(String[] phoneNumbers){
        for(String phoneNumber : phoneNumbers){
            System.out.println("новое сообщение от номера: "+ phoneNumber);
        }
    }
}
public class PhoneMobile {
    public static void main(String[] args) {
        Phone phone1 = new Phone(123, "Samsung", 600 );
        Phone phone2 = new Phone(456, "Iphone", 500);
        Phone phone3 = new Phone(789, "Xiaomi", 700);

        phone1.getPhone();
        phone2.getPhone();
        phone3.getPhone();

        phone1.receiveCall("Данила");
        System.out.println("Номер телефона : "+ phone2.getNumber());

        phone3.receiveCall("Андрей", 456);

        phone1.sendMessage(new String[]{"123","456","789"});

    }
}






