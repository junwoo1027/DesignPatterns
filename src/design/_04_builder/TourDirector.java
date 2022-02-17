package design._04_builder;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan swissTrip() {
        return tourPlanBuilder.title("스위스 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2022, 02, 17))
                .whereToStay("호텔")
                .addPlan(0, "체크인")
                .addPlan(0, "식사")
                .getPlan();
    }

    public TourPlan longTrip() {
        return tourPlanBuilder.title("롱비치")
                .startDate(LocalDate.of(2022, 05, 03))
                .getPlan();
    }
}
