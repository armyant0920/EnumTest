public class EnumSample {

    private static EnumSample instance;
    private MyEnum myEnum;
    private  WeekDay weekDay;

    private EnumSample(){


    }
    public static EnumSample getInstance(){

        if(instance==null){
            synchronized (EnumSample.class){
                instance=new EnumSample();
            }

        }

        return instance;
    }

    public MyEnum getMyEnum() {
        return myEnum;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public static void main(String[] args) {
        for (MyEnum e:MyEnum.values()){

            e.execute();
        }
    }

    public enum MyEnum implements Command{


        UP(2,"往上"){

            public void execute() {
                System.out.printf("(%d)方向:%s\n",value,text);

            }
        },DOWN(3,"往下") {

            public void execute() {
                System.out.printf("(%d)方向:%s\n",value,text);

            }
        },RIGHT(4,"往右") {

            public void execute() {
                System.out.printf("(%d)方向:%s\n",value,text);

            }
        },LEFT(5,"往左"){

            public void execute() {
                System.out.printf("(%d)方向:%s\n",value,text);

            }
        };
        protected int value;
        protected String text;
        private MyEnum(int value,String text){
            this.value=value;
            this.text=text;

        }


    }




}
