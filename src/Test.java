import static java.lang.String.format;

public class Test {

    public interface command{
        void dosometing();
    }

    public enum  Actions {
//        up(4),left(1),down(2),right(3),
    sayA(1){
    public String toString(){
        return format("%2d-A",value());
    }
},
        sayB(2){
            public String toString(){
                return format("%2d-B",value());
            }
        },
        sayC(3){
            public String toString(){
                return format("%2d-C",value());
            }
        },


        sayD(4){
            public String toString(){
                return format("%2d-D",value());
            }
        };
        private int value;
        private Actions(int value){
            this.value=value;
        }

        public int value(){
            return  value;
        }



    }
    public static void main(String[] args) {


        for(var action:Actions.values()){
//            System.out.printf("value(%s,%d)\n",action,action.value());
            System.out.println(action);
        }
        System.out.println(Actions.sayA);
        System.out.println(Actions.sayB);




    }

}
