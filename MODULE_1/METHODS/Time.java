public class Time {
    public static void main(String[] args) {
        secToHours(3600);
    }

    public static void secToHours(int sec){
        int hours = sec/3600;
        int minutes = (sec-(hours*3600))/60;
        int seconds = sec-((hours*3600)+(minutes*60));
        System.out.println(hours + " HR " + minutes + " MIN " + seconds + " SEC ");
    }
}
