package design._04_builder;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());

        TourPlan plan = director.swissTrip();
        TourPlan longTrip = director.longTrip();

        System.out.println(plan);
        System.out.println(longTrip);
    }
}
