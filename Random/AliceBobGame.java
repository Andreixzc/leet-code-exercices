package Random;

public class AliceBobGame {
    public static void main(String[] args) {
        
    }
    public static boolean winnerOfGame(String colors) {
        //alice so remove se a letra A que tiver cercada de A's.
        //AAABABB -> AABABB
        for (int i = 0; i < colors.length(); i++) {
            if (colors.charAt(i) == 'A' ||colors.charAt(i+1) == 'A' ||colors.charAt(i+3) == 'A' ) {
                //se tiver 3 As, remover da pos i+1 e fazer o shift da string
            }
            //outro bloco de IF pra jogada do bob.
        }



        return true;
    }
}
