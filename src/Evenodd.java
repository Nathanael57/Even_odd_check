public class Evenodd {

    public static void main(String[] args){
        //generating random number between 1 and 100
        int randomNumber = (int)(Math.random()*(100-1));
        //check whether it is even or odd
        if(randomNumber%2==0){
            System.out.println(randomNumber+"is an even number");
        }
        else{
            System.out.println(randomNumber+"is an odd number");
        }
    }
}
