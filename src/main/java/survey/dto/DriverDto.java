package survey.dto;


public class DriverDto {
    private int id;
    private String name;
    private int round;
    private double ranking;

    private transient int dimensionId;

//    private DimensionDto dimension;

    public DriverDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

//    public DimensionDto getDimension() {
//        return dimension;
//    }
//
//    public void setDimension(DimensionDto dimension) {
//        this.dimension = dimension;
//    }

    public int getDimensionId() {
        return dimensionId;
    }

    public void setDimensionId(int dimensionId) {
        this.dimensionId = dimensionId;
    }
}
