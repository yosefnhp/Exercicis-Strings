import java.util.Scanner;
void main() {

    float[] scores = {15.0f, 12.0f, 6.0f};
    for (int i = 0; i < scores.length; i++) {
        for (int j = i + 1; j < scores.length; j++) {
            if (scores[i] > scores[j]){
                float cambio = scores[i];
                scores[i] = scores[j];
                scores[j] = cambio;


            }
        }

    }
    System.out.println("El array ordenado es: ");
    for (int i = 0; i<scores.length;i++){
        System.out.print(scores[i]+" ");
    }

}